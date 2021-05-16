package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Question {

    @Id
    private String id;

    private String questionData;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Answer> answers;

    private Date createdTime;

//    public boolean equals(){
//
//    }
//
//    @Override
//    public int hashCode(){
//
//    }

}
