package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

//    @Transactional(propagation = Propagation.R, isolation = Isolation.SERIALIZABLE)
    public Question addQuestion(Question question) {
        question.setId(UUID.randomUUID().toString());
        question.setCreatedTime(new Date());
        return questionRepository.save(question);
    }

    public List<Question> listAllQuestions() {
        return (List<Question>) questionRepository.findAll();
    }

}
