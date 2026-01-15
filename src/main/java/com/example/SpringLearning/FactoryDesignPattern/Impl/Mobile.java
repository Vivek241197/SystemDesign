package com.example.SpringLearning.FactoryDesignPattern.Impl;

import com.example.SpringLearning.FactoryDesignPattern.Notification;
import org.springframework.stereotype.Component;

@Component("phone")
public class Mobile implements Notification {

    @Override
    public void send(String message) {
        System.out.println(message+" sent from phone");
    }
}
