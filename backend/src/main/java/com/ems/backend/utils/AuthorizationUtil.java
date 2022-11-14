package com.ems.backend.utils;

import com.ems.backend.pojo.Employee;
import com.ems.backend.service.impl.utils.EmployeeDetailsImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthorizationUtil {

    public static Employee getEmployee(){
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        EmployeeDetailsImpl loginUser = (EmployeeDetailsImpl) authentication.getPrincipal();
        return loginUser.getEmployee();
    }

}
