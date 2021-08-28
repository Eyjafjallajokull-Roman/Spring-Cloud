package com.example.roomsservices.controller;

import com.example.roomsservices.exception.CustomError;
import com.example.roomsservices.exception.ErrorType;
import com.example.roomsservices.exception.ServiceException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ErrorHandlingController {

    @ExceptionHandler(value = {ServiceException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CustomError handleServiceException(ServiceException exception) {
        return new CustomError(exception.getMessage(), exception.getErrorType(), LocalDateTime.now());
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CustomError handleServiceException(ConstraintViolationException ex, HandlerMethod hm) {
        return new CustomError(ex.getMessage(), ErrorType.VALIDATION_ERROR_TYPE, LocalDateTime.now());
    }
}
