package com.webagent.projects.lovable_clone.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.lovable_clone.dto.project.FileContentResponse;
import com.webagent.projects.lovable_clone.dto.project.FileNode;
import com.webagent.projects.lovable_clone.service.FileService;

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
