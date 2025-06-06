////package com.example.QuizApp.service;
////
////import com.example.QuizApp.dao.QuestionDao;
////import com.example.QuizApp.dao.QuizDao;
////import com.example.QuizApp.model.Question;
////import com.example.QuizApp.model.QuestionWrapper;
////import com.example.QuizApp.model.Quiz;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.HttpStatus;
////import org.springframework.stereotype.Service;
////
////import java.util.ArrayList;
////import java.util.List;
////import java.util.Optional;
////
////
////
////public class QuizService {
////    private QuestionDao questionDao;
////
////    @Service
////    public class  QuizService() {
////
////        @Autowired
////        QuizDao quizDao;
////        @Autowired
////        QuestionDao questionDao;
////    }
////
////    public ResponseEntity<String> createQuiz (String category, int numQ, String title) {
////
////
////        List<Question> questions= questionDao.findRandomQuestionsByCategory(category,numQ);
////
////        Quiz quiz = new Quiz();
////        quiz.setTitle(title);
////        quiz.setQuestions(questions);
////        quizDao.save(quiz);
////        return new ResponseEntity<>("Success", HttpStatus.CREATED);
////
////    }
////
////    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
////        Optional<Quiz> quiz= quizDao.findById(id);
////        List<Question> questionsFromDB1= quiz.get().getQuestions();
////        List<QuestionWrapper> questionsForUser = new ArrayList<>();
////       for(Question q: questionsFromDB1){
////           QuestionWrapper qw= new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
////          questionsForUser.add(qw);
////       }
////        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
////
////    }
////}
//
//
//
//package com.example.QuizApp.service;
//
//import com.example.QuizApp.dao.QuestionDao;
//import com.example.QuizApp.dao.QuizDao;
//import com.example.QuizApp.model.Question;
//import com.example.QuizApp.model.QuestionWrapper;
//import com.example.QuizApp.model.Quiz;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class QuizService {
//
//    @Autowired
//     QuizDao quizDao;
//
//    @Autowired
//    QuestionDao questionDao;
//
//    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
//        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);
//
//        Quiz quiz = new Quiz();
//        quiz.setTitle(title);
//        quiz.setQuestions(questions);
//        quizDao.save(quiz);
//
//        return new ResponseEntity<>("Success", HttpStatus.CREATED);
//    }
//
//    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
//        Optional<Quiz> quiz = quizDao.findById(id);
//        if (!quiz.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        List<Question> questionsFromDB = quiz.get().getQuestions();
//        List<QuestionWrapper> questionsForUser = new ArrayList<>();
//
//        for (Question q : questionsFromDB) {
//            QuestionWrapper qw = new QuestionWrapper(
//                    q.getId(),
//                    q.getQuestionTitle(),
//                    q.getOption1(),
//                    q.getOption2(),
//                    q.getOption3(),
//                    q.getOption4()
//            );
//            questionsForUser.add(qw);
//        }
//
//        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
//    }
//}

package com.example.QuizApp.service;

import com.example.QuizApp.dao.QuestionDao;
import com.example.QuizApp.dao.QuizDao;
import com.example.QuizApp.model.Question;
import com.example.QuizApp.model.QuestionWrapper;
import com.example.QuizApp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        if (!quiz.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();

        for (Question q : questionsFromDB) {
            QuestionWrapper qw = new QuestionWrapper(
                    q.getId(),
                    q.getQuestionTitle(),
                    q.getOption1(),
                    q.getOption2(),
                    q.getOption3(),
                    q.getOption4()
            );
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }
}
