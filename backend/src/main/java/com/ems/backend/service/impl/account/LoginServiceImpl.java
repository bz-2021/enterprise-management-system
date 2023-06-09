package com.ems.backend.service.impl.account;

import com.ems.backend.pojo.Employee;
import com.ems.backend.service.impl.utils.UserDetailsImpl;
import com.ems.backend.utils.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements com.ems.backend.service.account.LoginService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Override
    public Map<String, String> login(String name, String password) {
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(name, password);
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        UserDetailsImpl employeeDetails = (UserDetailsImpl) authenticate.getPrincipal();
        Employee employee = employeeDetails.getEmployee();

        Map<String, String > map = new HashMap<>();

        if(employee.getIncumbency().equals("否")){
            map.put("error_message", "您已离职，无权访问此系统");
            return map;
        }

        String jwt = JwtUtil.createJWT(employee.getId().toString());

        map.put("error_message", "success");
        map.put("token", jwt);

        return map;
    }
}
