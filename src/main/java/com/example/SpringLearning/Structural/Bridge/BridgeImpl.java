package com.example.SpringLearning.Structural.Bridge;

import com.example.SpringLearning.Structural.Bridge.Renderer.RasterRender;
import com.example.SpringLearning.Structural.Bridge.Renderer.VectorRenderor;
import com.example.SpringLearning.Structural.Bridge.ShapeImpl.Circle;
import com.example.SpringLearning.Structural.Bridge.ShapeImpl.Rectangle;

public class BridgeImpl {

    public static void main(String[] args) {

        Render vector = new VectorRenderor();
        Render raster = new RasterRender();

        Shape circle1 = new Circle(vector, 5);
        Shape circle2 = new Circle(raster, 5);

        Shape rectangle1 = new Rectangle(vector, 10, 4);
        Shape rectangle2 = new Rectangle(raster, 10, 4);

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();

    }
}