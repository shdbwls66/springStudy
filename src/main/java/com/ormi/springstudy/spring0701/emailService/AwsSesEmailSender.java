package com.ormi.springstudy.spring0701.emailService;

public class AwsSesEmailSender implements EmailSender{

    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending AWS SES email to " + to);
    }
}
