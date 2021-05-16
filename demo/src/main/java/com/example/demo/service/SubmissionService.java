package com.example.demo.service;

import com.example.demo.model.QuizSubmission;
import com.example.demo.repository.SubmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {

    //@Autowired
    private SubmissionRepository submissionRepository;

    public QuizSubmission submitQuiz(QuizSubmission quizSubmission) {
        //return submissionRepository.save(quizSubmission);
        return null;
    }

}
