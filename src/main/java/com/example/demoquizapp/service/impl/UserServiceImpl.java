package com.example.demoquizapp.service.impl;

import com.example.demoquizapp.dto.CreateUserRequest;
import com.example.demoquizapp.model.Question;
import com.example.demoquizapp.model.User;
import com.example.demoquizapp.repository.QuestionRepository;
import com.example.demoquizapp.repository.UserRepository;
import com.example.demoquizapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final QuestionRepository questionRepository;

    @Override
    public void create(CreateUserRequest request, Long questionId) {
        Optional<Question> questionOptional = questionRepository.findById(questionId);

        if (questionOptional.isPresent()) {
            Question question = questionOptional.get();

            User user = new User();
            BeanUtils.copyProperties(request, user);
            user.setQuestion(question);

            String submittedAnswer = request.getSubmitAnswer();
            boolean isCorrect = submittedAnswer != null && submittedAnswer.equals(question.getCorrectAnswer());

            user.setAnswerStatus(isCorrect);

            userRepository.save(user);
        }
    }
}
