package com.org.hotelms.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllExcepttion {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<> handelUserNotFoundException(){
        return null;
    }
}
