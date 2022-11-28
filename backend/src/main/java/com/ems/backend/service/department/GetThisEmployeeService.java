package com.ems.backend.service.department;

import com.ems.backend.pojo.Employee;

import java.util.List;

public interface GetThisEmployeeService {
    List<Employee> getlist(Integer did);
}
