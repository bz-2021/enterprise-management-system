package com.ems.backend.service.impl.account;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.DepartmentMapper;
import com.ems.backend.pojo.Department;
import com.ems.backend.pojo.Employee;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GetInfoServiceImpl implements com.ems.backend.service.account.GetInfoService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Map<String, String> getInfo() {
        Employee employee = AuthorizationUtil.getEmployee();

        QueryWrapper<Department> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("did", employee.getDid());

        String DepartmentName = departmentMapper.selectOne(queryWrapper).getDName();

        Map<String,String> data = new HashMap<>();
        data.put("error_message", "success");
        data.put("id", employee.getId().toString());
        data.put("name", employee.getName());
        data.put("photo", employee.getPhoto());
        data.put("department",DepartmentName);
        data.put("status", employee.getStatus());

        return data;
    }
}
