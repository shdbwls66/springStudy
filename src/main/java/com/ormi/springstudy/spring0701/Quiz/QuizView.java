package com.ormi.springstudy.spring0701.Quiz;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class QuizView {
    public void displayQuestion(String question){
        System.out.println(question);
    }

    public String getUserAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("답변을 입력하세요");
        String answer = sc.nextLine();

        return answer;
    }

    public void displayResult(boolean isCorrect){
        if (isCorrect) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다!");
        }
    }
}
