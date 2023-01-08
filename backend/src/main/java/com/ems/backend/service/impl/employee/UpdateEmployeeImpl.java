package com.ems.backend.service.impl.employee;

import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.employee.UpdateEmployeeService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class UpdateEmployeeImpl implements UpdateEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String, String> updateEmployee(Map<String, String> data) throws ParseException {

        Employee employee = AuthorizationUtil.getEmployee();

        Map<String, String> map = new HashMap<>();

        if(employee.getId() == 25){
            map.put("error_message", "游客身份不支持修改数据");
            return map;
        }

        int ToBeUpdatedId = Integer.parseInt(data.get("employee_id"));

        Employee ToBeUpdated = employeeMapper.selectById(ToBeUpdatedId);

        try{
            if(ToBeUpdated.getLevel() <= employee.getLevel()){
                map.put("error_message", "您没有该权限");
                return map;
            }
        } catch (Exception e){
            map.put("error_message", "该成员级别不明，无法更新");
            return map;
        }

        String status = data.get("status");
        String level = data.get("level");
        String name = data.get("name");
        String gender = data.get("gender");
        String photo = data.get("photo");
        String ethnicity = data.get("ethnicity");
        String birthday = data.get("birthday");
        String politicalFace = data.get("politicalFace");
        String education = data.get("education");
        String idCard = data.get("id_card");
        String phoneNumber = data.get("phone_number");
        String email = data.get("e_mail");
        String incumbency = data.get("incumbency");
        String username = data.get("username");
        String account = data.get("account");
        String did = data.get("did");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date myBirthday = null;
        if(birthday != null){
            try{
                myBirthday = sdf.parse(birthday);
            } catch (Exception e){
                map.put("error_message", "出生日期不符合规则");
                return map;
            }
        }

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
                } else if(ll <= employee.getLevel()){
                    map.put("error_message", "您无法将此人level改为同级或更高");
                    return map;
                }
            } catch(Exception e){
                map.put("error_message", "level不符合规则");
                return map;
            }
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
        //photo = photo.trim();

        if(photo.length() > 500){
            map.put("error_message", "照片URL超出限制");
            return map;
        }
        ethnicity = ethnicity.trim();

        if(ethnicity.length() > 10){
            map.put("error_message", "民族超出字数限制");
            return map;
        }
        politicalFace = politicalFace.trim();

        if(politicalFace.length() > 10){
            map.put("error_message", "政治面貌超出字数限制");
            return map;
        }
        education = education.trim();

        if(education.length() > 10){
            map.put("error_message", "受教育程度超出字数限制");
            return map;
        }
        idCard = idCard.trim();

        if(idCard.length() > 20){
            map.put("error_message", "身份证号长度超出");
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
            map.put("error_message", "用户名长度超出限制");
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

        Employee new_employee = new Employee(
                ToBeUpdatedId,
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
                incumbency,
                username,
                account,
                ToBeUpdated.getPassword(),
                ToBeUpdated.getRegistTime(),
                Integer.parseInt(did)
        );

        employeeMapper.updateById(new_employee);

        map.put("error_message", "success");

        return map;

    }
}
