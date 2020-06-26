package com.example.inheritance.shapes;

import com.example.inheritance.EColor;

public abstract class AbstractShape {

    protected EColor color;

    public AbstractShape(EColor color) {
        this.color = color;
    }

    public EColor getColor() {
        return color;
    }

    public void setColor(EColor color) {
        this.color = color;
    }

    public abstract double getPerimeter();

    public abstract double getSurface();
}
