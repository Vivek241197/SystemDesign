package com.example.SpringLearning.Structural.Decorator.Impl;

import com.example.SpringLearning.Structural.Decorator.TextDecorator;
import com.example.SpringLearning.Structural.Decorator.TextView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class BoldDecorator extends TextDecorator {

    public BoldDecorator(TextView inner) {
        super(inner);
    }

    @Override
    public void render() {
        System.out.print("<b>");
        inner.render();
        System.out.print("</b>");
    }
}
