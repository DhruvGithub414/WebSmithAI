package com.webagent.projects.websmith.dto.chat;

import com.webagent.projects.websmith.entity.ChatMessage;
import com.webagent.projects.websmith.enums.ChatEventType;
import jakarta.persistence.*;

public record ChatEventResponse(
        Long id,



        ChatEventType type,

        Integer sequenceOrder,

        String content,

        String filePath,

        String metadata
) {
}
