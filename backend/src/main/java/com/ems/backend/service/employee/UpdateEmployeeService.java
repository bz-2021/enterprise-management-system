package com.ems.backend.service.employee;

import java.text.ParseException;
import java.util.Map;

public interface UpdateEmployeeService {
    Map<String, String> updateEmployee(Map<String,String> data) throws ParseException;
}
