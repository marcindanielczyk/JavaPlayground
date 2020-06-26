package com.example.inheritance;

import com.example.inheritance.shapes.Circle;
import com.example.inheritance.shapes.Rectangle;
import com.example.inheritance.shapes.Square;
import com.example.inheritance.shapes.Triangle;

public class InheritanceExample {

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(2,5,EColor.RED);
        System.out.println(rectangle);
        System.out.println("perimeter=" + rectangle.getPerimeter());
        System.out.println("surface=" + rectangle.getSurface());
        System.out.println();

        Square square = new Square(6, EColor.YELLOW);
        System.out.println(square);
        System.out.println("perimeter=" + square.getPerimeter());
        System.out.println("surface=" + square.getSurface());
        System.out.println();

        Triangle triangle = new Triangle(3,4,5,EColor.ORANGE);
        System.out.println(triangle);
        System.out.println("perimeter=" + triangle.getPerimeter());
        System.out.println("surface=" + triangle.getSurface());
        System.out.println();

        Circle circle = new Circle(3,EColor.BLUE);
        System.out.println(circle);
        System.out.println("perimeter=" + circle.getPerimeter());
        System.out.println("surface=" + circle.getSurface());
        System.out.println();
    }
}
