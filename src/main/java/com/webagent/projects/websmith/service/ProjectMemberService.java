package com.webagent.projects.websmith.service;

import java.util.List;

import com.webagent.projects.websmith.dto.member.InviteMemberRequest;
import com.webagent.projects.websmith.dto.member.MemberResponse;
import com.webagent.projects.websmith.dto.member.UpdateMemberRoleRequest;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    Void removeProjectMember(Long projectId, Long memberId, Long userId);
}
