package com.example.QuizApp.service;


import com.example.QuizApp.Question;
import com.example.QuizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions(){
//         return questionDao.findAll();
        List<Question> questions = questionDao.findAll();
        System.out.println("Fetched questions: " + questions);  //
        return questions;
    }


    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion( Question question) {
        questionDao.save(question);
        return "success";
    }
}
