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
        Department department = departmentMapper.selectById(did);
        // 目标的部门
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        QueryWrapper<Department> departmentQueryWrapper = new QueryWrapper<>();
        departmentQueryWrapper.eq("did", employee.getDid());
        Integer d_level = departmentMapper.selectOne(departmentQueryWrapper).getDLevel();
        // 发送此操作的人员所在的部门的级别
        if(d_level > department.getDLevel()) return list;
        queryWrapper.eq("did", did);
        list = employeeMapper.selectList(queryWrapper);
        for(Employee employee1 : list) employee1.setPassword("");
        return list;
    }
}
