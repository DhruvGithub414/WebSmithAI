package com.webagent.projects.websmith.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

import com.webagent.projects.websmith.enums.MessageRole;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "chat_messages")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "project_id", referencedColumnName = "project_id", nullable = false),
            @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    })
    ChatSession chatSession;

    @Column(columnDefinition = "text", nullable = false)
    String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    MessageRole role;

//    String toolCalls; // JSON Array of Tools Called

    Integer tokensUsed = 0;

    @CreationTimestamp
    Instant createdAt;
}
