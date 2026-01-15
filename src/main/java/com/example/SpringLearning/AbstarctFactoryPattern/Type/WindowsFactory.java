package com.example.SpringLearning.AbstarctFactoryPattern.Type;

import com.example.SpringLearning.AbstarctFactoryPattern.Button;
import com.example.SpringLearning.AbstarctFactoryPattern.CheckBox;
import com.example.SpringLearning.AbstarctFactoryPattern.OsSelect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("windows")
public class WindowsFactory implements OsSelect {

    private Button bt;
    private CheckBox box;

    public WindowsFactory(
            @Qualifier("windowButon")Button bt,
            @Qualifier("windowcheck")CheckBox ck
    ) {
        this.bt=bt;
        this.box=ck;
    }


    @Override
    public Button getButton(){
        return bt;
    }
    @Override
    public CheckBox getCheckBox(){
        return box;
    }
}
