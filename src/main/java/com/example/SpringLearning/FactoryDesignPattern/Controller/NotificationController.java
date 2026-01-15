package com.example.SpringLearning.FactoryDesignPattern.Controller;

import com.example.SpringLearning.FactoryDesignPattern.Impl.NotificationClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationClientImpl client;

    @GetMapping("/")
    public void getMessage(){
        client.sendMessage("Hello","phone");
    }
}
