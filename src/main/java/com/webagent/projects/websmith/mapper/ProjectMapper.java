package com.webagent.projects.websmith.mapper;

import com.webagent.projects.websmith.enums.ProjectRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.webagent.projects.websmith.dto.project.ProjectResponse;
import com.webagent.projects.websmith.dto.project.ProjectSummaryResponse;
import com.webagent.projects.websmith.entity.Project;

import java.util.List;
// @JavaBean
@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

//    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project, ProjectRole role);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
