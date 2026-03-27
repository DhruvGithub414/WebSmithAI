package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);

}
