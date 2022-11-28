package com.ems.backend.controller.account;

import com.ems.backend.service.account.ForgetPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class ForgetPasswordController {
    @Autowired
    private ForgetPasswordService forgetPasswordService;

    @PostMapping("/update/password/")
    Map<String,String> updatePassword(@RequestParam Map<String, String> data){
        Integer id = Integer.parseInt(data.get("id"));
        String password = data.get("password");
        String confirmedPassword = data.get("confirmedPassword");
        return forgetPasswordService.updatePassword(id, password, confirmedPassword);
    }
}
