package com.example.nubesexercitatio.service;

import com.example.nubesexercitatio.entity.QuestionEntity;
import com.example.nubesexercitatio.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public QuestionEntity save(QuestionEntity questionEntity){
        return questionRepository.save(questionEntity);
    }
}
