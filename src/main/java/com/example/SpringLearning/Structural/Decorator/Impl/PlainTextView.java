package com.example.SpringLearning.Structural.Decorator.Impl;

import com.example.SpringLearning.Structural.Decorator.TextView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlainTextView implements TextView {

    private final String text;

    @Override
    public void render() {
        System.out.print(text);
    }

}
