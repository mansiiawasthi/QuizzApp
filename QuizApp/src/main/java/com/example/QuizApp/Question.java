package com.example.QuizApp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "question_title")
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    @Column(name = "right_answer")
    private String rightAnswer;
    @Column(name = "difficulty_level")
    private String difficultylevel;


}
