package com.ems.backend.service.account;

import java.util.Map;

public interface RegisterService {
    Map<String,String> register(String name, String password, String confirmedPassword);
}
