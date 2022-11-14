package com.ems.backend.service.impl.account;

import com.ems.backend.pojo.Employee;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GetInfoServiceImpl implements com.ems.backend.service.account.GetInfoService {
    @Override
    public Map<String, String> getInfo() {
        Employee employee = AuthorizationUtil.getEmployee();
        Map<String,String> data = new HashMap<>();
        data.put("error_message", "success");
        data.put("id", employee.getId().toString());
        data.put("name", employee.getName());
        data.put("photo", employee.getPhoto());
        data.put("department",employee.getDepartment().toString());
        data.put("status", employee.getStatus());

        return data;
    }
}
