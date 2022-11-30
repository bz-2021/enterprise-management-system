package com.ems.backend.controller.attendance;

import com.ems.backend.pojo.Attendance;
import com.ems.backend.service.attendance.GetAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GetAttendanceController {
    @Autowired
    private GetAttendanceService getAttendanceService;

    @PostMapping ("/get/attendance/")
    Map<String, String> getAttendance(@RequestParam Map<String,String > data){
        return getAttendanceService.getAttendance(data.get("id"));
    }
}
