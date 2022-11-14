package com.ems.backend.service.impl.employee;


import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.service.employee.AddEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AddEmployeeImpl implements AddEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String, String> addEmployee(Map<String, String> data) {
        return null;
    }
}
