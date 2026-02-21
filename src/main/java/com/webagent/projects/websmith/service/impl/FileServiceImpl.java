package com.webagent.projects.websmith.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.websmith.dto.project.FileContentResponse;
import com.webagent.projects.websmith.dto.project.FileNode;
import com.webagent.projects.websmith.service.FileService;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
