package com.ems.backend.controller.verification;

import com.ems.backend.service.verification.SendCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SendCodeController {

    @Autowired
    private SendCodeService sendCodeService;

    @PostMapping("/verification/email/")
    public Map<String, String> sendCode(@RequestParam Map<String, String> data){
        return sendCodeService.sendCode(data.get("email"));
    }
}
