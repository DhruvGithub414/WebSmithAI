package com.webagent.projects.lovable_clone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.webagent.projects.lovable_clone.dto.project.ProjectResponse;
import com.webagent.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import com.webagent.projects.lovable_clone.entity.Project;

import java.beans.JavaBean;
import java.util.List;
// @JavaBean
@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
