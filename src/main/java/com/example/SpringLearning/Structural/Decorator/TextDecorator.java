package com.example.SpringLearning.Structural.Decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class TextDecorator implements TextView {

    protected final TextView inner;

}
