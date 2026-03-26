package com.webagent.projects.websmith.service.impl;

import com.webagent.projects.websmith.entity.ChatMessage;
import com.webagent.projects.websmith.entity.ChatSession;
import com.webagent.projects.websmith.entity.ChatSessionId;
import com.webagent.projects.websmith.repository.ChatMessageRepository;
import com.webagent.projects.websmith.repository.ChatSessionRepository;
import com.webagent.projects.websmith.security.AuthUtil;
import com.webagent.projects.websmith.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final AuthUtil authUtil;
    private final ChatSessionRepository chatSessionRepository;

    @Override
    public List<ChatMessage> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMessageList;
    }
}
