package com.gusta.example.stategy.enumstrategy.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public enum ResponseStrategy {

    RESPONSE_EMPTY {
        @Override
        public ResponseEntity<Object> execute(Object body) {
            var headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PROBLEM_JSON_VALUE);
            return new ResponseEntity<>(body, headers, HttpStatus.BAD_REQUEST);
        }
    },
    RESPONSE_OK {
        @Override
        public ResponseEntity<Object> execute(Object body) {
            return new ResponseEntity<>(body, HttpStatus.OK);
        }
    },
    RESPONSE_ERROR {
        @Override
        public ResponseEntity<Object> execute(Object body) {
            var headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PROBLEM_JSON_VALUE);
            return new ResponseEntity<>(body, headers, HttpStatus.NOT_FOUND);
        }
    };

    public abstract ResponseEntity<Object> execute(Object body);

}
