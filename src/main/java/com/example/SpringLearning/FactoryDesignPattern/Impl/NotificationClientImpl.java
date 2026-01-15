package com.example.SpringLearning.FactoryDesignPattern.Impl;

import com.example.SpringLearning.FactoryDesignPattern.Locator.NotificationLocator;
import com.example.SpringLearning.FactoryDesignPattern.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationClientImpl {

    @Autowired
    private NotificationLocator locator;

    public void sendMessage(String message,String type){
        Notification notify = locator.getNotification(type);
        notify.send(message);
    }
}
