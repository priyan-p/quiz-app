package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Quiz {

    // @Id
    private String id;

    //@OneToMany
    private List<Question> questions;

}
