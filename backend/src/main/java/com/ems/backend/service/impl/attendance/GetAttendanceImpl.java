package com.ems.backend.service.impl.attendance;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ems.backend.mapper.AttendanceMapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Attendance;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.attendance.GetAttendanceService;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GetAttendanceImpl implements GetAttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Override
    public Map<String, String> getAttendance() {
        Employee employee = AuthorizationUtil.getEmployee();
        Map<String, String> map = new HashMap<>();
        QueryWrapper<Attendance> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", employee.getId());
        Attendance attendance =  attendanceMapper.selectOne(queryWrapper);
        if(attendance == null){
            map.put("error_message", "未找到此雇员的考勤信息");
            return map;
        }
        map.put("error_message", "success");
        map.put("attendance", attendance.getAttendance().toString());
        map.put("late", attendance.getLate().toString());
        map.put("leave_early", attendance.getLeaveEarly().toString());
        map.put("absence", attendance.getAbsence().toString());
        map.put("overtime", attendance.getOvertime().toString());
        return map;
    }
}
