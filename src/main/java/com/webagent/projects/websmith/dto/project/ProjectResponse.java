package com.webagent.projects.websmith.dto.project;

import java.time.Instant;

import com.webagent.projects.websmith.dto.auth.UserProfileResponse;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
