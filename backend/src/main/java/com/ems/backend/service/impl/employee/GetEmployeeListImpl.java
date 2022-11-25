package com.ems.backend.service.impl.employee;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.employee.GetEmployeeListService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetEmployeeListImpl implements GetEmployeeListService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployeeList() {
        Employee employee = AuthorizationUtil.getEmployee();

        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();

        queryWrapper.gt("level", employee.getLevel());
        //System.out.println(employeeMapper.selectList(queryWrapper));

        return employeeMapper.selectList(queryWrapper);
    }
}
