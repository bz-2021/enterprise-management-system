package com.ems.backend.service.account;

import java.util.Map;

public interface ForgetPasswordService {
    Map<String,String> updatePassword(Integer id, String password, String confirmedPassword);
}
