package com.ems.backend.controller.account;

import com.ems.backend.service.account.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Map;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/employee/register/")
    public Map<String, String> register(@RequestParam Map<String,String> data) throws ParseException {
        String name = data.get("name");
        String gender = data.get("gender");
        String ethnicity = data.get("ethnicity");
        String birthday = data.get("birthday");
        String politicalFace = data.get("politicalFace");
        String education = data.get("education");
        String idCard = data.get("idCard");
        String phoneNumber = data.get("phoneNumber");
        String department = data.get("department");
        String password = data.get("password");
        String confirmedPassword = data.get("confirmedPassword");
        return registerService.register(
                name,
                gender,
                ethnicity,
                birthday,
                politicalFace,
                education,
                idCard,
                phoneNumber,
                department,
                password,
                confirmedPassword);
    }

}
