//package com.example.QuizApp.controller;
//
//import com.example.QuizApp.model.QuestionWrapper;
//import com.example.QuizApp.service.QuizService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import org.springframework.http.ResponseEntity;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("quiz")
//public class QuizController {
//@Autowired
//QuizService quizService;
//
//    @PostMapping("create")
//    public ResponseEntity<String> createQuiz (@RequestParam int numQ, @RequestParam String category, @RequestParam String title) {
////        return new ResposnseEntity<>("I am here",HttpStatus.OK);
//        return quizService.createQuiz(category,numQ,title);
//    }
//    @GetMapping("get/{id}")
//    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
//        return quizService.getQuizQuestions(id); // Missing return!
//    }
//
//
//}
//


package com.example.QuizApp.controller;

import com.example.QuizApp.model.QuestionWrapper;
import com.example.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz (@RequestParam int numQ, @RequestParam String category, @RequestParam String title) {
        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
        return quizService.getQuizQuestions(id);
    }
}
