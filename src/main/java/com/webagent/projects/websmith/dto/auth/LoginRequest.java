package com.webagent.projects.websmith.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
