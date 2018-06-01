package com.zero.hmbrowser;

import javafx.scene.canvas.Canvas;

public class ResizableCanvas extends Canvas {
    public ResizableCanvas() {
        widthProperty().addListener((observable, oldValue, newValue) -> draw());
        heightProperty().addListener((observable, oldValue, newValue) -> draw());
    }

    private void draw() {
        // double width = getWidth();
        // double height = getHeight();
        //
        // GraphicsContext gc = getGraphicsContext2D();
        // gc.clearRect(0, 0, width, height);
    }

    @Override
    public double prefWidth(double height) {
        return getWidth();
    }

    @Override
    public double prefHeight(double width) {
        return getHeight();
    }
}
