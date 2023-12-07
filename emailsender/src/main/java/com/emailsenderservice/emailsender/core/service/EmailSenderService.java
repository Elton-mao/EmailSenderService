package com.emailsenderservice.emailsender.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;    
        public void emailsender(String toEMail, String subject, String body){
            SimpleMailMessage message = new SimpleMailMessage();
                message.setFrom();
                message.setTo(toEMail);              
                message.setSubject(subject);
                message.setText(body);
                mailSender.send(message);
                System.err.println("mensagem enviada");

        }
}
