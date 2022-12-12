package com.ems.backend.service.impl.account;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.ems.backend.mapper.DepartmentMapper;
import com.ems.backend.pojo.Department;
import com.ems.backend.pojo.Employee;
import com.ems.backend.utils.AuthorizationUtil;
import com.mysql.cj.xdevapi.JsonString;
import com.mysql.cj.xdevapi.JsonValue;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class GetInfoServiceImpl implements com.ems.backend.service.account.GetInfoService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Map<String, Object> getInfo() {
        Employee employee = AuthorizationUtil.getEmployee();
        QueryWrapper<Department> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("did", employee.getDid());
        String DepartmentName = departmentMapper.selectOne(queryWrapper).getDName();
        employee.setPassword("想得美");
        Map<String,Object> beanToMa = BeanUtils.beanToMap(employee);
        beanToMa.put("department", DepartmentName);
        return beanToMa;
    }
}
