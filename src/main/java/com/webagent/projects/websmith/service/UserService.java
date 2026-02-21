package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
