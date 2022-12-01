package com.ems.backend.controller.employee;

import com.ems.backend.service.employee.AddSelfInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AddSelfInfoController {
    @Autowired
    private AddSelfInfoService addSelfInfoService;

    @PostMapping("/employee/add/info/")
    Map<String, String> addInfo(@RequestParam Map<String,String> data){
        return addSelfInfoService.addInfo(data);
    }
}
