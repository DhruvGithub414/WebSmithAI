package com.webagent.projects.websmith.dto.chat;

import com.webagent.projects.websmith.entity.ChatEvent;
import com.webagent.projects.websmith.entity.ChatSession;
import com.webagent.projects.websmith.enums.MessageRole;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

public record ChatResponse(
        Long id,

        ChatSession chatSession,

        String content,

        MessageRole role,

        List<ChatEvent>events,

//    String toolCalls; // JSON Array of Tools Called

        Integer tokensUsed,

        Instant createdAt
){
}
