package com.example.QuizApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id=1001;
    private String title;
    @ManyToMany
    private List<Question> questions;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public List<Question> getQuestions () {
        return questions;
    }

    public void setQuestions (List<Question> questions) {
        this.questions = questions;
    }
//    public void setTitle (String title) {
//    }
//
//    public void setQuestions (List<Question> questions) {
//    }
//
//    public List<Question> getQuestions () {
//        return questions;
//    }

//        public void setTitle (String title) {
//        this.title = title;
//    }
//
//    public String getTitle () {
//        return title;
//    }
//
//    public void setQuestions (List<Question> questions) {
//        this.questions = questions;
//    }
//
//    public List<Question> getQuestions () {
//        return questions;
//    }

}

//package com.example.QuizApp.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Data
//public class Quiz {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private String title;
//
//    @ManyToMany
//    private List<Question> questions;
//
//    public void setTitle (String title) {
//        this.title = title;
//    }
//
//    public String getTitle () {
//        return title;
//    }
//
//    public void setQuestions (List<Question> questions) {
//        this.questions = questions;
//    }
//
//    public List<Question> getQuestions () {
//        return questions;
//    }
//}
