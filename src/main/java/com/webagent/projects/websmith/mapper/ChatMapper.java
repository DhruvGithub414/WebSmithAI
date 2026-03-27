package com.webagent.projects.websmith.mapper;

import com.webagent.projects.websmith.dto.chat.ChatResponse;
import com.webagent.projects.websmith.entity.ChatMessage;

import java.util.List;

public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);

}
