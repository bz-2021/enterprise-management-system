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
                                        String level,
                                        String status,
                                        String gender,
                                        String photo,
                                        String ethnicity,
                                        String birthday,
                                        String politicalFace,
                                        String education,
                                        String idCard,
                                        String phoneNumber,
                                        String email,
                                        String username,
                                        String account,
                                        String did,
                                        String password,
                                        String confirmedPassword) throws ParseException {
        Map<String, String> map = new HashMap<>();

        if(name == null){
            map.put("error_message", "姓名不能为空");
            return map;
        }
        if(level == null){
            map.put("error_message", "level不能为空");
            return map;
        } else {
            try{
                int ll = Integer.parseInt(level);
                if(ll > 5 || ll < 1){
                    map.put("error_message", "level只能是1-5之间的数字");
                    return map;
                }
            } catch(Exception e){
                map.put("error_message", "level不符合规则");
                return map;
            }
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
        status = status.trim();

        if(status.length() == 0){
            map.put("error_message", "职位不能为空");
            return map;
        }
        if(status.length() > 10){
            map.put("error_message", "职位超出字数限制");
            return map;
        }
        if(!(gender.equals("男") || gender.equals("女"))){
            map.put("error_message", "性别只能为男或女");
            return map;
        }
        photo = photo.trim();

        if(photo.length() > 500){
            map.put("error_message", "照片URL超出字数限制");
            return map;
        }
        ethnicity = ethnicity.trim();

        if(ethnicity.length() > 10){
            map.put("error_message", "民族超出字数限制");
            return map;
        }
        politicalFace = politicalFace.trim();

        if(politicalFace.length() > 10){
            map.put("error_message", "政治面貌超出超出限制");
            return map;
        }
        education = education.trim();

        if(education.length() > 10){
            map.put("error_message", "受教育程度超出字数限制");
            return map;
        }
        idCard = idCard.trim();

        if(idCard.length() > 20){
            map.put("error_message", "身份证号长度超出字数限制");
            return map;
        }
        phoneNumber = phoneNumber.trim();

        if(phoneNumber.length() > 20){
            map.put("error_message", "手机号长度超出限制");
            return map;
        }
        email = email.trim();

        if(email.length() > 30){
            map.put("error_message", "E-mail长度超出限制");
            return map;
        }
        username = username.trim();

        if(username.length() > 20){
            map.put("error_message", "用户名长度超出字数限制");
            return map;
        }

        did = did.trim();

        if(did.length() == 0){
            map.put("error_message", "部门编号不能为空");
            return map;
        }
        try{
            int d_id = Integer.parseInt(did);
            if(d_id < 1 || d_id > 6){
                map.put("error_message", "部门编号不存在");
                return map;
            }
        } catch (Exception e){
            map.put("error_message", "部门编号不符合规则");
            return map;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date now_date = new Date();

        Date myBirthday = null;

        if(birthday != null){
            try{
                myBirthday = sdf.parse(birthday);
            } catch (Exception e){
                map.put("error_message", "出生日期不符合规则");
                return map;
            }
        }

        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        List<Employee> users = employeeMapper.selectList(queryWrapper);
        if(!users.isEmpty()){
            map.put("error_message", "用户名已存在");
            return map;
        }

        String encodedPassword = passwordEncoder.encode(password);

        Employee employee = new Employee(null,
                status,
                Integer.parseInt(level),
                name,
                gender,
                photo,
                ethnicity,
                myBirthday,
                politicalFace,
                education,
                idCard,
                phoneNumber,
                email,
                "是",
                username,
                account,
                encodedPassword,
                now_date,
                Integer.parseInt(did)
                );

        employeeMapper.insert(employee);

        map.put("error_message", "success");
        return map;
    }
}
