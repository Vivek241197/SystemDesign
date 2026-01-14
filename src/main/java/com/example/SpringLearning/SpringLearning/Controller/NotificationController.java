package com.example.SpringLearning.SpringLearning.Controller;

import com.example.SpringLearning.SpringLearning.Impl.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationClient client;

    @GetMapping("/")
    public void getMessage(){
        client.sendMessage("Hello","phone");
    }
}
