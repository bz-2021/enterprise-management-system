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

        int ToBeUpdatedId = Integer.parseInt(data.get("employee_id"));

        Employee ToBeUpdated = employeeMapper.selectById(ToBeUpdatedId);

        try{
            if(ToBeUpdated.getLevel() < employee.getLevel()){
                map.put("error_message", "您没有该权限");
                return map;
            }
        } catch (Exception e){
            map.put("error_message", "发生未知错误（该成员级别不明）");
            return map;
        }

        String name = data.get("name");
        String gender = data.get("gender");
        String photo = data.get("photo");
        String ethnicity = data.get("ethnicity");
        String birthday = data.get("birthday");
        String politicalFace = data.get("politicalFace");
        String education = data.get("education");
        String idCard = data.get("idCard");
        String phoneNumber = data.get("phoneNumber");
        String department = data.get("department");
        String status = data.get("status");
        Integer level = Integer.parseInt(data.get("level"));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date myBirthday;
        myBirthday = sdf.parse(birthday);

        if(name == null){
            map.put("error_message", "姓名不能为空");
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

        Employee new_employee = new Employee(
                ToBeUpdatedId,
                name,
                gender,
                photo,
                ethnicity,
                myBirthday,
                politicalFace,
                education,
                idCard,
                phoneNumber,
                ToBeUpdated.getPassword(),
                Integer.parseInt(department),
                status,
                level
        );

        employeeMapper.updateById(new_employee);

        map.put("error_message", "success");

        return map;

    }
}
