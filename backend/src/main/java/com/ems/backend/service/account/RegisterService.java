package com.ems.backend.service.account;

import java.text.ParseException;
import java.util.Map;

public interface RegisterService {
    Map<String,String> register(String name,
                                String gender,
                                String ethnicity,
                                String birthday,
                                String politicalFace,
                                String education,
                                String idCard,
                                String phoneNumber,
                                String department,
                                String password,
                                String confirmedPassword) throws ParseException;
}
