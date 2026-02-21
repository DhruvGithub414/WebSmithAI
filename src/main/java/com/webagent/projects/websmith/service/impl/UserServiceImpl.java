package com.webagent.projects.websmith.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.websmith.dto.auth.UserProfileResponse;
import com.webagent.projects.websmith.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
