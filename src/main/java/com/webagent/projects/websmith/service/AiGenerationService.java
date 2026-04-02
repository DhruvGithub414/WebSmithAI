package com.webagent.projects.websmith.service;

import aj.org.objectweb.asm.commons.Remapper;
import com.webagent.projects.websmith.dto.chat.StreamResponse;
import reactor.core.publisher.Flux;

public interface AiGenerationService {

    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
