package com.webagent.projects.websmith.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
