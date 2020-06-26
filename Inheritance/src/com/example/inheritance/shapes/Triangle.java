package com.example.inheritance.shapes;

import com.example.inheritance.EColor;
import com.example.inheritance.shapes.AbstractShape;

public class Triangle extends AbstractShape {

    private double a, b, c;

    public Triangle(double a, double b, double c, EColor color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getSurface() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle: a=" + a + ", b=" + b + ", c=" + c + ", color=" + color;
    }

}
