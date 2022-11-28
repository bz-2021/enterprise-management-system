package com.ems.backend.service.impl.department;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.DepartmentMapper;
import com.ems.backend.pojo.Department;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.department.GetDepartmentListService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDepartmentListImpl implements GetDepartmentListService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getlist() {
        Employee employee = AuthorizationUtil.getEmployee();
        if(employee.getIncumbency().equals("否")){
            return null;
        }
        QueryWrapper<Department> queryWrapper = new QueryWrapper<>();
        return departmentMapper.selectList(queryWrapper);
    }
}
