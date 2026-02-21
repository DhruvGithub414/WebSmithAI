package com.webagent.projects.lovable_clone.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.lovable_clone.dto.auth.AuthResponse;
import com.webagent.projects.lovable_clone.dto.auth.LoginRequest;
import com.webagent.projects.lovable_clone.dto.auth.SignupRequest;
import com.webagent.projects.lovable_clone.service.AuthService;

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
