package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.project.FileContentResponse;
import com.webagent.projects.websmith.dto.project.FileNode;
import com.webagent.projects.websmith.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

//    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
