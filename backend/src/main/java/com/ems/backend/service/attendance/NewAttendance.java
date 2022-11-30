package com.ems.backend.service.attendance;

import java.util.Map;

public interface NewAttendance {
    Map<String,String > newAttendance(String status, String id);
}
