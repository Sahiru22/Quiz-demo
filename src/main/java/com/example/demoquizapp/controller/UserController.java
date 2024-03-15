package com.example.demoquizapp.controller;

import com.example.demoquizapp.dto.CreateUserRequest;
import com.example.demoquizapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/questions/{question-id}/answers")
    public void create(@RequestBody CreateUserRequest request, @PathVariable ("question-id") Long questionId){
        userService.create(request,questionId);
    }
}
