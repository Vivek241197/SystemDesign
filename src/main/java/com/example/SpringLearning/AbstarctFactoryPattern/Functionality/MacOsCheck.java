package com.example.SpringLearning.AbstarctFactoryPattern.Functionality;

import com.example.SpringLearning.AbstarctFactoryPattern.CheckBox;
import org.springframework.stereotype.Component;

@Component("macCheck")
public class MacOsCheck implements CheckBox {

    @Override
    public void selectingCheckBox(String a){
        System.out.println("Selecting checkBox "+a);
    }
}
