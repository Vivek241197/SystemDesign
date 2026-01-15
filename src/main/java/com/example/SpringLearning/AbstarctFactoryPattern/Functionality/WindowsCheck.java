package com.example.SpringLearning.AbstarctFactoryPattern.Functionality;

import com.example.SpringLearning.AbstarctFactoryPattern.CheckBox;
import org.springframework.stereotype.Component;

@Component("windowcheck")
public class WindowsCheck implements CheckBox {

    @Override
    public void selectingCheckBox(String a){
        System.out.println("CheckBox of Windows "+a);
    }
}
