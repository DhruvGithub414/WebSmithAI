package com.webagent.projects.websmith.repository;

import com.webagent.projects.websmith.entity.ChatSession;
import com.webagent.projects.websmith.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
    
}
