package com.ems.backend.service.verification;

import java.util.Map;

public interface SendCodeService {
    Map<String, String> sendCode(String email);
    Map<String, String> verifyCode(String email, String code);
}
