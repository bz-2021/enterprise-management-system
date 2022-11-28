package com.ems.backend.service.impl.account;

import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.account.ForgetPasswordService;
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

    @Override
    public Map<String, String> updatePassword(Integer id, String password, String confirmedPassword) {
        Employee employee = AuthorizationUtil.getEmployee();
        Map<String,String> map = new HashMap<>();
        Employee tobeUpdated = employeeMapper.selectById(id);

        try{
            if(tobeUpdated.getLevel() <= employee.getLevel()){
                map.put("error_message", "您没有该权限");
                return map;
            }
        } catch (Exception e){
            map.put("error_message", "该成员级别不明，无法更新");
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
        String encodedPassword = passwordEncoder.encode(password);
        tobeUpdated.setPassword(encodedPassword);
        map.put("error_message", "success");
        return map;
    }
}
