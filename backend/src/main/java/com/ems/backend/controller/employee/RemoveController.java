package com.ems.backend.controller.employee;

import com.ems.backend.service.employee.RemoveEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RemoveController {

    @Autowired
    private RemoveEmployeeService removeEmployeeService;

    @PostMapping("/employee/delete/")
    public Map<String, String> removeEmployee(@RequestParam Map<String, String> data){
        return removeEmployeeService.RemoveEmployee(data);
    }
}
