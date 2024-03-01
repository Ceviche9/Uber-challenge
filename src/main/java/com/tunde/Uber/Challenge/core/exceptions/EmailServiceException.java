package com.tunde.Uber.Challenge.core.exceptions;

import com.tunde.Uber.Challenge.dto.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmailServiceException extends Throwable {
    @ExceptionHandler(Exception.class)
    public ResponseEntity generalException(Exception exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO(exception.getMessage(), "500");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }
}