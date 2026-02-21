package com.webagent.projects.websmith.mapper;

import com.webagent.projects.websmith.dto.member.MemberResponse;
import com.webagent.projects.websmith.entity.ProjectMember;
import com.webagent.projects.websmith.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {
    @Mapping(target="userId", source = "id")
    @Mapping(target = "projectRole", constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(User owner);

    @Mapping(target="userId", source="user.id")
    @Mapping(target="email", source = "user.email")
    @Mapping(target="name", source = "user.name")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
