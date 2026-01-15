package com.example.SpringLearning.AbstarctFactoryPattern.Impl;

import com.example.SpringLearning.AbstarctFactoryPattern.Button;
import com.example.SpringLearning.AbstarctFactoryPattern.CheckBox;
import com.example.SpringLearning.AbstarctFactoryPattern.OsSelect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OsImpl {

    private Button bt;
    private CheckBox ck;

    public OsImpl(
            @Qualifier("macOsFa")OsSelect sl
            ){
        this.bt = sl.getButton();
        this.ck = sl.getCheckBox();
    }
    public void runOs(){
        bt.ofButton("Hello");
        ck.selectingCheckBox("Checking");
    }
}
