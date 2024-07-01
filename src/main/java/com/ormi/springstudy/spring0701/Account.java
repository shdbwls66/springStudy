package com.ormi.springstudy.spring0701;

public class Account {
    private String accountNumber;
    private double balance;

    public void changeAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void drawMoney(double money){
        if (balance < money){
            System.out.println("잔액이 부족합니다.");

            return;
        }
        balance -= money;
    }

}
