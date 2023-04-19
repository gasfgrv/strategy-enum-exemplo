package com.gusta.example.stategy.enumstrategy.controller;

import com.gusta.example.stategy.enumstrategy.dto.ErroDto;
import com.gusta.example.stategy.enumstrategy.utils.ResponseStrategy;
import feign.FeignException;
import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GetGithubUserControllerAdvice {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<Object> handleFeignException() {    
        var error = new ErroDto(LocalDateTime.now(), "This user doesn't exists");
        return ResponseStrategy.RESPONSE_ERROR.execute(error);
    }

}
