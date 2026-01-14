package com.example.SpringLearning.SpringLearning.Locator;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceLocatorConfig {

    @Bean
    public ServiceLocatorFactoryBean notificationLocator(){
        ServiceLocatorFactoryBean factory = new ServiceLocatorFactoryBean();
        factory.setServiceLocatorInterface(NotificationLocator.class);
        return factory;
    }
}
