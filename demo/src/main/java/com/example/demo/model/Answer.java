package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "question_answers")
public class Answer {

    @Id
    private String id;

    @ManyToOne
    private Question question;

    private String answerData;

    private Date createdTime;

}
