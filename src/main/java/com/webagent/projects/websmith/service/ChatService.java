package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.entity.ChatMessage;
import org.springframework.ai.chat.model.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatMessage> getProjectChatHistory(Long projectId);

}
