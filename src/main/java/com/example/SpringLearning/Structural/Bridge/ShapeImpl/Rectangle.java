package com.example.SpringLearning.Structural.Bridge.ShapeImpl;

import com.example.SpringLearning.Structural.Bridge.Render;
import com.example.SpringLearning.Structural.Bridge.Shape;

public class Rectangle extends Shape{

    private final float width;
    private final float height;

    public Rectangle(Render renderer, float width, float height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        renderer.renderRectangle(width, height);
    }
}
