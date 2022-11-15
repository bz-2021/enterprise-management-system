package com.ems.backend.service.impl.account;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegisterServiceImpl implements com.ems.backend.service.account.RegisterService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String name,
                                        String gender,
                                        String ethnicity,
                                        String birthday,
                                        String politicalFace,
                                        String education,
                                        String idCard,
                                        String phoneNumber,
                                        String department,
                                        String password,
                                        String confirmedPassword) throws ParseException {
        Map<String, String> map = new HashMap<>();

        if(name == null){
            map.put("error_message", "姓名不能为空");
            return map;
        }
        if(password == null || confirmedPassword == null){
            map.put("error_message", "密码不能为空");
            return map;
        }
        name = name.trim();

        if(name.length() == 0){
            map.put("error_message", "姓名不能为空");
            return map;
        }
        if(password.length() == 0 || confirmedPassword.length() == 0){
            map.put("error_message", "密码不能为空");
            return map;
        }
        if(name.length() > 10){
            map.put("error_message", "姓名长度不能大于10");
            return map;
        }
        if(password.length() > 100 || confirmedPassword.length() > 100) {
            map.put("error_message", "密码长度不能大于100");
            return map;
        }
        if(!password.equals(confirmedPassword)) {
            map.put("error_message", "两次输入的密码不一致");
            return map;
        }
        if(!(gender.equals("男") || gender.equals("女"))){
            map.put("error_message", "性别只能为男或女");
            return map;
        }
        if(idCard == null){
            map.put("error_message", "身份证号不能为空");
            return map;
        }
        if(department == null){
            map.put("error_message", "部门名称不能为空");
            return map;
        }
        if(phoneNumber == null){
            map.put("error_message", "手机号不能为空");
            return map;
        }

        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        List<Employee> users = employeeMapper.selectList(queryWrapper);
        if(!users.isEmpty()){
            map.put("error_message", "用户名已存在");
            return map;
        }

        String encodedPassword = passwordEncoder.encode(password);
        String Photo = "https://cdn.acwing.com/media/user/profile/photo/183562_lg_b8aaa078f8.jpg";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date myBirthday;
        myBirthday = sdf.parse(birthday);

        Employee employee = new Employee(null,
                name,
                gender,
                Photo,
                ethnicity,
                myBirthday,
                politicalFace,
                education,
                idCard,
                phoneNumber,
                encodedPassword,
                0,
                "在职",
                12);

        employeeMapper.insert(employee);

        map.put("error_message", "success");
        return map;
    }
}
