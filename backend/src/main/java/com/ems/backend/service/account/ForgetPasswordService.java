package com.ems.backend.service.account;

import java.util.Map;

public interface ForgetPasswordService {
    Map<String,String> updatePassword(String email, String code, String password, String confirmedPassword);
}
