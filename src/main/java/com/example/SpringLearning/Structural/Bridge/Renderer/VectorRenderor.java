package com.example.SpringLearning.Structural.Bridge.Renderer;

import com.example.SpringLearning.Structural.Bridge.Render;

public class VectorRenderor implements Render {

    @Override
    public void renderCircle(float radius){
        System.out.println("Drawing pixels for a circle of radius " + radius + " (RASTER).");
    }

    @Override
    public void renderRectangle(float width, float height) {
        System.out.println("Drawing pixels for a rectangle " + width + "x" + height + " (RASTER).");
    }
}
