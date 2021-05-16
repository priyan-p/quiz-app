package com.example.demo.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class QuizSubmission {

    private String id;

    private List<QuizAnswer> quizAnswers;

    private Date submittedTime;

}
