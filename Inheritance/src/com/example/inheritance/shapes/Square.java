package com.example.inheritance.shapes;

import com.example.inheritance.EColor;
import com.example.inheritance.shapes.AbstractShape;

public class Square extends Rectangle {

    public Square(double a, EColor color) {
        super(a, a, color);
    }

    @Override
    public void setA(double a) {
        setSide(a);
    }

    @Override
    public void setB(double b) {
        setSide(b);
    }

    private void setSide(double side) {
        super.setA(side);
        super.setB(side);
    }

    @Override
    public String toString() {
        return "Square: a=" + a + ", color=" + color;
    }
}
