package com.gusta.example.stategy.enumstrategy.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErroDto {

    private LocalDateTime errorTimestamp;
    private String errorMessage;

}
