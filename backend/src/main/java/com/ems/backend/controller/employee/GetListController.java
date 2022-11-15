package com.ems.backend.controller.employee;


import com.ems.backend.pojo.Employee;
import com.ems.backend.service.employee.GetEmployeeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetListController {

    @Autowired
    private GetEmployeeListService getEmployeeListService;

    @GetMapping("/employee/getlist/")
    public List<Employee> getList(){
        return getEmployeeListService.getEmployeeList();
    }
}
