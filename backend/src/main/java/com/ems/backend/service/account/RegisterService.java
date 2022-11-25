package com.ems.backend.service.account;

import java.text.ParseException;
import java.util.Map;

public interface RegisterService {
    Map<String,String> register(String name,
                                String level,
                                String status,
                                String gender,
                                String photo,
                                String ethnicity,
                                String birthday,
                                String politicalFace,
                                String education,
                                String idCard,
                                String phoneNumber,
                                String email,
                                String username,
                                String account,
                                String did,
                                String password,
                                String confirmedPassword) throws ParseException;
}
