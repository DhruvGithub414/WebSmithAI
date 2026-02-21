package com.webagent.projects.lovable_clone.entity;

import java.time.Instant;

import com.webagent.projects.lovable_clone.enums.ProjectRole;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
