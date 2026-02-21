package com.webagent.projects.websmith.dto.member;

import java.time.Instant;

import com.webagent.projects.websmith.enums.ProjectRole;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
