package com.ormi.springstudy.spring0701.Quiz;

import org.springframework.boot.SpringApplication;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("부엉이가 수영하면?", "첨부엉첨부엉");
        QuizView quizView = new QuizView();

        QuizController quizController = new QuizController(quiz, quizView);
        quizController.startQuiz();


        SpringApplication.run(Main.class, args);
    }
}
