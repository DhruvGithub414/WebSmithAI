package com.webagent.projects.websmith.service;

import java.util.List;

import com.webagent.projects.websmith.dto.member.InviteMemberRequest;
import com.webagent.projects.websmith.dto.member.MemberResponse;
import com.webagent.projects.websmith.dto.member.UpdateMemberRoleRequest;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    Void removeProjectMember(Long projectId, Long memberId);
}
