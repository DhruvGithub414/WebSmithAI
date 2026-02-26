package com.webagent.projects.websmith.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
