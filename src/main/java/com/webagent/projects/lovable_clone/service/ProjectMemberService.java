package com.webagent.projects.lovable_clone.service;

import java.util.List;

import com.webagent.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.webagent.projects.lovable_clone.dto.member.MemberResponse;
import com.webagent.projects.lovable_clone.dto.member.UpdateMemberRoleRequest;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
