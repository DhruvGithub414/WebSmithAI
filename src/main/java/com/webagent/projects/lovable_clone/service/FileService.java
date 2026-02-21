package com.webagent.projects.lovable_clone.service;

import org.jspecify.annotations.Nullable;

import com.webagent.projects.lovable_clone.dto.project.FileContentResponse;
import com.webagent.projects.lovable_clone.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
