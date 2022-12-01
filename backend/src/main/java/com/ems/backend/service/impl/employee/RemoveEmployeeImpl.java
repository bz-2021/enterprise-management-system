package com.ems.backend.service.impl.employee;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.employee.RemoveEmployeeService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RemoveEmployeeImpl implements RemoveEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Map<String, String> RemoveEmployee(Map<String, String> data) {
        Employee employee = AuthorizationUtil.getEmployee();
        Integer IdToBeDel = Integer.parseInt(data.get("id"));

        Map<String, String> map = new HashMap<>();

        Employee EmployeeToBeDel = employeeMapper.selectById(IdToBeDel);

        if(EmployeeToBeDel.getLevel() > employee.getLevel()){
            if(!EmployeeToBeDel.getIncumbency().equals("否")){
                map.put("error_message", "该员工已离职");
            } else {
                EmployeeToBeDel.setIncumbency("否");
                map.put("error_message", "success");
            }
        } else {
            map.put("error_message", "您没有该权限");
        }
        return map;
    }
}
