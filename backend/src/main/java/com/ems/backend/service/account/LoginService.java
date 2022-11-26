package com.ems.backend.service.account;

import java.util.Map;

public interface LoginService {
    Map<String,String> login(String name, String password);
}
