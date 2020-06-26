package com.example.inheritance;

import com.example.inheritance.shapes.*;

public class PolymorphismExample {

    public static void main(String[] args) {

        AbstractShape shape1 = new Rectangle(2,5,EColor.RED);
        AbstractShape shape2 = new Square(6,EColor.YELLOW);
        AbstractShape shape3 = new Triangle(3,4, 5, EColor.ORANGE);
        AbstractShape shape4 = new Circle(3,EColor.BLUE);

        AbstractShape[] shapes = {shape1,shape2,shape3,shape4};

        for (AbstractShape shape: shapes){
            System.out.println(shape);
            System.out.println("perimeter=" + shape.getPerimeter());
            System.out.println("surface=" + shape.getSurface());
            System.out.println();
        }

        shape1 = new Circle(10,EColor.YELLOW);
        System.out.println(shape1);
    }
}
