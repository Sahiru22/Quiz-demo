package com.example.demoquizapp.service;

import com.example.demoquizapp.dto.CreateUserRequest;

public interface UserService {
    void create(CreateUserRequest request, Long questionId);
}
