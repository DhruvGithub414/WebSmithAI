package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.auth.AuthResponse;
import com.webagent.projects.websmith.dto.auth.LoginRequest;
import com.webagent.projects.websmith.dto.auth.SignupRequest;


public interface AuthService {


    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
