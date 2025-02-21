package com.nilsw13.myportefolio.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final JavaMailSender javaMailSender;


   @Value("${spring.mail.username}")
   private String username;

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String text, String sender){
       try {
           System.out.println("creating new email..");
           SimpleMailMessage mailMessage = new SimpleMailMessage();
           mailMessage.setFrom(sender);
           mailMessage.setTo(username);
           mailMessage.setSubject("Contact from Portfolio");
           mailMessage.setText(text + "\n\n" + "sender : " + sender);
           javaMailSender.send(mailMessage);
           System.out.println("email ready : " + "username: " + username + "/" + "message : " + text);
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
   }


}
