package com.example.SpringLearning.Structural.Bridge.ShapeImpl;

import com.example.SpringLearning.Structural.Bridge.Render;
import com.example.SpringLearning.Structural.Bridge.Shape;

public class Circle extends Shape {

    private final float radius;

    public Circle(Render renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}
