package com.ems.backend.service.impl.verification;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.mapper.VerificationMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.pojo.Verification;
import com.ems.backend.service.verification.SendCodeService;
import com.ems.backend.utils.RandomTools;
import com.ems.backend.utils.SendEmailUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class SendCodeServiceImpl implements SendCodeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private VerificationMapper verificationMapper;

    @Autowired
    private SendEmailUtils sendEmailUtils;
    @Override
    public Map<String, String> sendCode(String email) {
        Map<String, String> map = new HashMap<>();
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("e_mail", email);
        Employee employee = employeeMapper.selectOne(queryWrapper);
        if(employee == null){
            map.put("error_message", "该邮箱尚未注册");
            return map;
        }
        Integer id = employee.getId();
        String Code = RandomTools.randomCode();
        Date date = new Date();
        QueryWrapper<Verification> queryWrapper1 = new QueryWrapper<>();
        queryWrapper1.eq("register_id", id);
        Verification verification = verificationMapper.selectOne(queryWrapper1);
        if(verifyTime(verification, 120)){
            map.put("error_message", "请勿重复请求");
            return map;
        }
        try{
            if(verification != null){
                verification.setCode(Code);
                verification.setTime(date);
                verification.setStatus(0);
                verificationMapper.update(verification, queryWrapper1);
            } else{
                verification = new Verification(id, email, Code, date, date, 0);
                verificationMapper.insert(verification);
            }
            sendEmailUtils.sendRegisterCode(email, Code);
            map.put("error_message", "success");
            return map;
        } catch (Exception e){
            e.printStackTrace();
            map.put("error_message", "未知错误");
            return map;
        }

    }
    @Override
    public Map<String, String> verifyCode(String email, String code){
        Map<String, String> map = new HashMap<>();
        QueryWrapper<Verification> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email", email);
        Verification verification = verificationMapper.selectOne(queryWrapper);
        if(verification == null){
            map.put("error_message", "未查询到记录");
        } else {
            if(verifyLastRequest(verification, 10)){
                map.put("error_message", "请十秒后再试");
                verification.setLastRequest(new Date());
                verificationMapper.update(verification, queryWrapper);
                return map;
            }
            verification.setLastRequest(new Date());
            verificationMapper.update(verification, queryWrapper);
            if(!Objects.equals(verification.getCode(), code)) {
                map.put("error_message", "验证码错误");
            } else if(verification.getStatus() == 1){
                map.put("error_message", "验证码已失效");
            } else if(verifyTime(verification, 600)){
                map.put("error_message", "success");
                verification.setStatus(1);
                verificationMapper.update(verification, queryWrapper);
            } else {
                map.put("error_message", "验证码无效");
            }
        }
        return map;
    }

    private Boolean verifyTime(Verification verification, int interval){
        try {
            Date now_date = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date now = sdf2.parse(sdf2.format(now_date));//当前时间
            Date date = sdf2.parse(sdf2.format(verification.getTime()));//过去
            long between = (now.getTime() - date.getTime()) / 1000;//除以1000是为了转换成秒
            return between <= interval;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Boolean verifyLastRequest(Verification verification, int interval){
        try {
            Date now_date = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date now = sdf2.parse(sdf2.format(now_date));//当前时间
            Date date = sdf2.parse(sdf2.format(verification.getLastRequest()));//过去
            long between = (now.getTime() - date.getTime()) / 1000;//除以1000是为了转换成秒
            return between <= interval;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
