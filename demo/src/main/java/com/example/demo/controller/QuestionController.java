package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.model.QuestionList;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping
    public QuestionList listQuestion() {
        return new QuestionList(questionService.listAllQuestions());
    }

}
