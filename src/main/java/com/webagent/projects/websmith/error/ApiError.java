package com.webagent.projects.websmith.error;


import org.springframework.http.HttpStatus;

import java.time.Instant;

public record ApiError(
        HttpStatus status,
        String message,
        Instant timeStamp
) {
    public ApiError(HttpStatus status, String message){
        this (status, message, Instant.now());
    }
}
