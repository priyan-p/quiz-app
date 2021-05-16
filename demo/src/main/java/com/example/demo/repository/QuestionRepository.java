package com.example.demo.repository;

import com.example.demo.model.Question;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface QuestionRepository extends PagingAndSortingRepository<Question, String> {
}
