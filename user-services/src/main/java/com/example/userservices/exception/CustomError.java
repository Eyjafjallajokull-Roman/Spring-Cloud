package com.example.userservices.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomError {
    private final String message;
    private final ErrorType errorType;
    private final LocalDateTime localDateTime;
}




