package com.ormi.springstudy.spring0701.emailService;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);

}
