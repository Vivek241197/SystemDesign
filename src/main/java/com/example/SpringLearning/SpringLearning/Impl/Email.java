package com.example.SpringLearning.SpringLearning.Impl;

import com.example.SpringLearning.SpringLearning.Notification;
import org.springframework.stereotype.Component;

@Component("email")
public class Email implements Notification {

    @Override
    public void send(String message){
        System.out.println(message+" sent from Email");
    }
}
