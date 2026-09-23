package com.org.hotelms.exception;

import com.org.hotelms.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllExcepttion {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiResponse> handelUserNotFoundException(UserNotFoundException unfe) {
        String message = unfe.getMessage();
        ApiResponse response=ApiResponse.builder().message(message).status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
