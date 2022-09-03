package com.gusta.example.stategy.enumstrategy.controller;

import com.gusta.example.stategy.enumstrategy.dto.UserDto;
import org.springframework.http.ResponseEntity;

public enum ResponseStrategy {

    RESPONSE_EMPTY{
        @Override
        ResponseEntity<?> execute(Object body) {
            return ResponseEntity.badRequest().build();
        }
    },
    RESPONSE_OK {
        @Override
        ResponseEntity<?> execute(Object body) {
            return ResponseEntity.ok((UserDto) body);
        }
    },
    RESPONSE_ERROR {
        @Override
        ResponseEntity<?> execute(Object body) {
            return ResponseEntity.notFound().build();
        }
    };

    abstract ResponseEntity<?> execute(Object body);

}
