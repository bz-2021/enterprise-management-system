package com.ems.backend.service.impl.department;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.DepartmentMapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Department;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.department.GetThisEmployeeService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetThisEmployeeImpl implements GetThisEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Employee> getlist(Integer did) {
        List<Employee> list = new ArrayList<>();
        Employee employee = AuthorizationUtil.getEmployee();
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        QueryWrapper<Department> departmentQueryWrapper = new QueryWrapper<>();
        departmentQueryWrapper.eq("did", employee.getDid());
        Integer d_level = departmentMapper.selectOne(departmentQueryWrapper).getDLevel();
        if(d_level < did) return list;
        queryWrapper.eq("did", did);
        return employeeMapper.selectList(queryWrapper);
        and is a diiffentrent news and we all thanks to do this 
    }
}
