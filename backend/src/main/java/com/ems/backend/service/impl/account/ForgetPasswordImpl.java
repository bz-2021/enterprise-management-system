package com.ems.backend.service.impl.account;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.account.ForgetPasswordService;
import com.ems.backend.service.verification.SendCodeService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ForgetPasswordImpl implements ForgetPasswordService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private SendCodeService sendCodeService;

    @Override
    public Map<String, String> updatePassword(String email, String code,String password, String confirmedPassword) {
        Map<String,String> map = new HashMap<>();

        QueryWrapper<Employee> employeeQueryWrapper = new QueryWrapper<>();
        employeeQueryWrapper.eq("e_mail", email);
        Employee employee = employeeMapper.selectOne(employeeQueryWrapper);
        if(employee == null){
            map.put("error_message", "该邮箱尚未注册");
            return map;
        }

        if(password == null || confirmedPassword == null){
            map.put("error_message", "密码不能为空");
            return map;
        }
        if(password.length() == 0 || confirmedPassword.length() == 0){
            map.put("error_message", "密码不能为空");
            return map;
        }
        if(password.length() > 30 || confirmedPassword.length() > 30){
            map.put("error_message", "密码的长度不能大于30");
            return map;
        }
        if(!password.equals(confirmedPassword)){
            map.put("error_message", "两次输入的密码不一致");
            return map;
        }
        map = sendCodeService.verifyCode(email, code);

        if(map.get("error_message").equals("success")){
            employee.setPassword(passwordEncoder.encode(password));
            employeeMapper.updateById(employee);
        }
        return map;
    }
}
