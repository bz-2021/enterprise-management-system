package com.ems.backend.service.impl.attendance;

import com.ems.backend.mapper.AttendanceMapper;
import com.ems.backend.mapper.EmployeeMapper;
import com.ems.backend.pojo.Attendance;
import com.ems.backend.pojo.Employee;
import com.ems.backend.service.attendance.NewAttendance;
import com.ems.backend.utils.AuthorizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service

public class NewAttendanceImpl implements NewAttendance {
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Map<String, String> newAttendance(String status, String id) {
        Employee employee = AuthorizationUtil.getEmployee();
        Map<String,String> map = new HashMap<>();
        if(employee.getId() == 25){
            map.put("error_message", "游客身份不支持修改数据");
            return map;
        }
        int eid;
        try {
            eid = Integer.parseInt(id);
        } catch (Exception e){
            map.put("error_message", "无效的Id");
            return map;
        } // 如果无法将字符串转化为int类型
        Attendance attendance = attendanceMapper.selectById(eid);
        boolean No_Data_Before = false;
        if(attendance == null){
            attendance = new Attendance(
                    eid,
                    0,
                    0,
                    0,
                    0,
                    0,
                    new Date()
            );
            attendanceMapper.insert(attendance);
            No_Data_Before = true;
        }
        Date Now_date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            System.out.println(sdf.format(Now_date) + "  " + sdf.format(attendance.getUpdateTime()));
            if(sdf.format(Now_date).equals(sdf.format(attendance.getUpdateTime())) &&
                    !No_Data_Before){
                map.put("error_message", "今天已进行过考勤");
                return map;
            }
        } catch (Exception e){
            attendance.setUpdateTime(new Date());
        }
        if(eid == employee.getId()){
            int now_att = attendance.getAttendance();
            attendance.setAttendance(now_att + 1);
            attendanceMapper.updateById(attendance);
            map.put("error_message", "success");
            return map;
        }
        Employee employee1 = employeeMapper.selectById(eid);
        if(employee1.getLevel() <= employee.getLevel()){
            map.put("error_message", "您没有该权限");
            return map;
        }
        switch (status) {
            case "attendance":
                int now_att = attendance.getAttendance();
                attendance.setAttendance(now_att + 1);
                map.put("error_message", "success");
                break;
            case "late": {
                int now_late = attendance.getLate();
                attendance.setLate(now_late + 1);
                map.put("error_message", "success");
                break;
            }
            case "leave_early": {
                int now_late = attendance.getLeaveEarly();
                attendance.setLeaveEarly(now_late + 1);
                map.put("error_message", "success");
                break;
            }
            case "absence": {
                int now_late = attendance.getAbsence();
                attendance.setAbsence(now_late + 1);
                map.put("error_message", "success");
                break;
            }
            case "overtime": {
                int now_late = attendance.getOvertime();
                attendance.setOvertime(now_late + 1);
                map.put("error_message", "success");
                break;
            }
            default:
                map.put("error_message", "您发送的参数有误");
                break;
        }
        attendance.setUpdateTime(new Date());
        attendanceMapper.updateById(attendance);
        return map;
    }
}
