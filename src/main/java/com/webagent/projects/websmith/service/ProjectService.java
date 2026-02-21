package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.project.ProjectRequest;
import com.webagent.projects.websmith.dto.project.ProjectResponse;
import com.webagent.projects.websmith.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
