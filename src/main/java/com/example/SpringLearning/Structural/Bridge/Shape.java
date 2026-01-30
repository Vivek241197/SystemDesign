package com.example.SpringLearning.Structural.Bridge;

public abstract class Shape {

    protected Render renderer;

    public Shape(Render renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
