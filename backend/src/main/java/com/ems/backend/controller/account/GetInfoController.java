package com.ems.backend.controller.account;

import com.ems.backend.service.account.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class GetInfoController {

    @Autowired
    private GetInfoService getInfoService;

    @GetMapping ("/employee/info")
    public     Map<String, Object> getInfo(){
        return getInfoService.getInfo();
    }
}
