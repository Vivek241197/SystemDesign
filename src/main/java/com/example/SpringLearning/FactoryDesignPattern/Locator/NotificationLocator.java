package com.example.SpringLearning.FactoryDesignPattern.Locator;

import com.example.SpringLearning.FactoryDesignPattern.Notification;

public interface NotificationLocator {
    Notification getNotification(String type);
}
