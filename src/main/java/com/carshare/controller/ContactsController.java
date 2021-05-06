package com.carshare.controller;

import com.samskivert.mustache.Mustache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.github.mustachejava.DefaultMustacheFactory;
//import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.io.IOException;
import java.io.StringWriter;

@Controller
public class ContactsController {
    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value = {"/contacts"})
    public String contacts(){
        return "contacts";
    }

//    @RequestMapping(value = "send", method = RequestMethod.POST)
//    public String sendEmail(@Valid EmailDto emailDto) {
//
//        MustacheFactory mf = new DefaultMustacheFactory();
//        Mustache m = mf.compile("email.mustache");
//
//        StringWriter writer = new StringWriter();
//        String messageText = "";
//        try {
//            m.execute(writer, emailDto).flush();
//            messageText = writer.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(emailDto.getTo());
//        message.setSubject(emailDto.getSubject());
//
//        message.setText(messageText);
//
//        mailSender.send(message);
//
//        return "sendEmail";
//    }

}
