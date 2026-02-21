package com.webagent.projects.websmith.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
