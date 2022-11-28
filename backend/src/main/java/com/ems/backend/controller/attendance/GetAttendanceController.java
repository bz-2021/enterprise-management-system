package com.ems.backend.controller.attendance;

import com.ems.backend.pojo.Attendance;
import com.ems.backend.service.attendance.GetAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GetAttendanceController {
    @Autowired
    private GetAttendanceService getAttendanceService;

    @GetMapping("/get/attendance/")
    Map<String, String> getAttendance(){
        return getAttendanceService.getAttendance();
    }
}
