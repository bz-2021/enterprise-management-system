package com.ems.backend.service.attendance;

import java.util.Map;

public interface GetAttendanceService {
    Map<String, String> getAttendance(String id);
}
