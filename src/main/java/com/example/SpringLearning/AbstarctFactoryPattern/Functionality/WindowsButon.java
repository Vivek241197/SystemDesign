package com.example.SpringLearning.AbstarctFactoryPattern.Functionality;

import com.example.SpringLearning.AbstarctFactoryPattern.Button;
import org.springframework.stereotype.Component;

@Component("windowButon")
public class WindowsButon implements Button {

    @Override
    public void ofButton(String m){
        System.out.println("Of Windows "+m);
    }

}
