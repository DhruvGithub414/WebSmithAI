package com.webagent.projects.websmith.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.websmith.dto.auth.AuthResponse;
import com.webagent.projects.websmith.dto.auth.LoginRequest;
import com.webagent.projects.websmith.dto.auth.SignupRequest;
import com.webagent.projects.websmith.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
