package com.ormi.springstudy.spring0701.Quiz;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
public class QuizController {
    private Quiz quiz;
    private QuizView quizView;

    @GetMapping
    public void startQuiz(){
        quizView.displayQuestion(quiz.getQuestion());
        boolean result = quizView.getUserAnswer().equals(quiz.getAnswer());
        quizView.displayResult(result);
    }

}
