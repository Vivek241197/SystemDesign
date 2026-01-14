package com.example.SpringLearning.SpringLearning.Impl;

import com.example.SpringLearning.SpringLearning.Locator.NotificationLocator;
import com.example.SpringLearning.SpringLearning.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationClient {

    @Autowired
    private NotificationLocator locator;

    public void sendMessage(String message,String type){
        Notification notify = locator.getNotification(type);
        notify.send(message);
    }
}
