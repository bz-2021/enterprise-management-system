package com.ems.backend.controller.account;


import com.ems.backend.service.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/employee/token/")
    public Map<String,String> login(@RequestParam Map<String,String> data){
        System.out.println(data);
        String name = data.get("name");
        String password = data.get("password");
        return loginService.login(name, password);
    }
}
