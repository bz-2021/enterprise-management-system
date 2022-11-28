package com.ems.backend.controller.department;

import com.ems.backend.pojo.Employee;
import com.ems.backend.service.department.GetThisEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GetThisEmployeeController {
    @Autowired
    private GetThisEmployeeService getThisEmployeeService;

    @PostMapping("/this/employee/")
    private List<Employee> getThis(@RequestParam Map<String,String> data){
        return getThisEmployeeService.getlist(Integer.parseInt(data.get("did")));
    }
}
