package com.ems.backend.controller.employee;


import com.ems.backend.service.employee.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Map;

@RestController
public class UpdateController {

    @Autowired
    private UpdateEmployeeService updateEmployeeService;

    @PostMapping("/employee/update/")
    public Map<String,String> update(@RequestParam Map<String,String> data) throws ParseException {
        return updateEmployeeService.updateEmployee(data);
    }
}
