package com.example.inheritance;

import com.example.inheritance.shapes.*;

import java.util.Random;

public class LateBindingExample {

    public static void main(String[] args) {

        AbstractShape[] shapes = new AbstractShape[6];
        Random random = new Random();

        int i = 0;
        while (i<shapes.length){

            int randomNumber = random.nextInt(4);
            switch (randomNumber) {
                case 0:
                    shapes[i] = new Rectangle(2,5,EColor.RED);
                    break;
                case 1:
                    shapes[i] = new Square(6, EColor.YELLOW);
                    break;
                case 2:
                    shapes[i] = new Triangle(3,4,5,EColor.ORANGE);
                    break;
                case 3:
                    shapes[i] = new Circle(3, EColor.BLUE);
                    break;
            }

            i++;
        }

        for (int j=0;j<shapes.length;j++){
            System.out.println(shapes[j]);
            System.out.println("perimeter=" + shapes[j].getPerimeter());
            System.out.println("surface=" + shapes[j].getSurface());
            System.out.println();
        }
    }
}
