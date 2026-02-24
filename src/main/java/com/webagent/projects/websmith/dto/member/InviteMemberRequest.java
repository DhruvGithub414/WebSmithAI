package com.webagent.projects.websmith.dto.member;

import com.webagent.projects.websmith.enums.ProjectRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InviteMemberRequest(
        @Email
        @NotBlank
        String email,

        @NotNull
        ProjectRole role
) {
}
