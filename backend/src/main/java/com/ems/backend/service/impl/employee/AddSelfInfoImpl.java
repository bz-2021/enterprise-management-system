package com.ems.backend.service.impl.employee;

import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.employee.AddSelfInfoService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AddSelfInfoImpl implements AddSelfInfoService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String, String> addInfo(Map<String, String> data) {
        Map<String, String> map = new HashMap<>();
        Employee employee = AuthorizationUtil.getEmployee();
        String photo = data.get("photo");
        String ethnicity = data.get("ethnicity");
        String politicalFace = data.get("politicalFace");
        String education = data.get("education");
        String idCard = data.get("id_card");
        String phoneNumber = data.get("phone_number");
        String email = data.get("e_mail");
        String username = data.get("username");
        String account = data.get("account");
        String birthday = data.get("birthday");

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
        employee.setPhoto(photo);
        employee.setPoliticalFace(politicalFace);
        employee.setEthnicity(ethnicity);
        employee.setEducation(education);
        employee.setIdCard(idCard);
        employee.setPhoneNumber(phoneNumber);
        employee.setEMail(email);
        employee.setUserName(username);
        employee.setAccount(account);
        employee.setBirthday(myBirthday);
        employeeMapper.updateById(employee);
        map.put("error_message", "success");
        return map;
    }
}
