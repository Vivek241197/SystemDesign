package com.example.SpringLearning.AbstarctFactoryPattern.Functionality;

import com.example.SpringLearning.AbstarctFactoryPattern.Button;
import org.springframework.stereotype.Component;

@Component("macButon")
public class MacOsButon implements Button {

    @Override
    public void ofButton(String b){
        System.out.println("Of Windows "+b);
    }
}
