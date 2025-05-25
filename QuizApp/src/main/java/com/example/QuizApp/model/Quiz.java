package com.example.QuizApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    private Integer id;
    private String title;
    @ManyToMany
    private List<Question> questions;

    public void setTitle (String title) {
    }

    public void setQuestions () {

    }

    public void setQuestions (List<Question> questions) {
    }

    public List<Question> getQuestions () {
        return List.of();
    }
}
