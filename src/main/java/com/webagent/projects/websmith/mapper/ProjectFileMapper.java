package com.webagent.projects.websmith.mapper;

import com.webagent.projects.websmith.dto.project.FileNode;
import com.webagent.projects.websmith.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {
    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);

}
