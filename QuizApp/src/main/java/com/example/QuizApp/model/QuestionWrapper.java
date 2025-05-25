package com.example.QuizApp.model;


import lombok.Data;

@Data

public class QuestionWrapper {
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper (Integer id) {
        this.id = id;
    }

    public QuestionWrapper (String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public QuestionWrapper (int id, String questionTitle, String option1, String option2, String option3, String option4) {
    }
}
