package com.example.demoquizapp.dto;

import lombok.Data;

@Data
public class CreateUserRequest {
    private Long id;
    private String name;
    private String submitAnswer;
    private Boolean answerStatus;
}
