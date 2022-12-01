package com.ems.backend.controller.attendance;

import com.ems.backend.service.attendance.NewAttendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NewAttendanceController {
    @Autowired
    private NewAttendance newAttendance;

    @PostMapping("/update/attendance/")
    Map<String,String> newAttendance(@RequestParam Map<String,String> data){
        String status = data.get("status");
        String id = data.get("id");
        return newAttendance.newAttendance(status, id);
    }
}
