package com.ormi.springstudy.spring0701.emailService;

public class EmailService {
    private final EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendMail(String to, String subject, String body){
        emailSender.sendEmail(to, subject, body);
    }
}
