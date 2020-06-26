package com.example.inheritance.shapes;

import com.example.inheritance.EColor;
import com.example.inheritance.shapes.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius, EColor color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius + ", color=" + color;
    }
}
