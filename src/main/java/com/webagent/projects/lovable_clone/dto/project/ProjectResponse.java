package com.webagent.projects.lovable_clone.dto.project;

import java.time.Instant;

import com.webagent.projects.lovable_clone.dto.auth.UserProfileResponse;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
