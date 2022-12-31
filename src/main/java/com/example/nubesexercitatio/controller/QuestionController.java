package com.example.nubesexercitatio.controller;

import com.example.nubesexercitatio.entity.QuestionEntity;
import com.example.nubesexercitatio.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("")
    public QuestionEntity save(@RequestBody QuestionEntity questionEntity){
        return questionService.save(questionEntity);
    }
}
