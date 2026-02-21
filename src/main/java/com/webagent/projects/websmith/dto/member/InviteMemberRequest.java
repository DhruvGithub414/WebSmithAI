package com.webagent.projects.websmith.dto.member;

import com.webagent.projects.websmith.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
