package com.example.SpringLearning.Structural.Decorator.Impl;

import com.example.SpringLearning.Structural.Decorator.TextDecorator;
import com.example.SpringLearning.Structural.Decorator.TextView;
import org.springframework.stereotype.Component;

@Component
public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(TextView inner) {
        super(inner);
    }

    @Override
    public void render() {
        System.out.print("<i>");
        inner.render();
        System.out.print("</i>");
    }
}
