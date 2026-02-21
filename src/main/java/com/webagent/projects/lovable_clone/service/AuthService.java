package com.webagent.projects.lovable_clone.service;

import org.jspecify.annotations.Nullable;

import com.webagent.projects.lovable_clone.dto.auth.AuthResponse;
import com.webagent.projects.lovable_clone.dto.auth.LoginRequest;
import com.webagent.projects.lovable_clone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
