//package com.example;

import java.time.LocalTime;

public class Main2 {

    public static void main(String[] args) {

        //Reprezentacja czasu
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(9,30,15);
        LocalTime time3 = LocalTime.parse("11:32:05");

        System.out.println("now(): " + time1);
        System.out.println("of(...) : " + time2);
        System.out.println("parse(...) : " + time3 + "\n");

        //Manipulowanie czasem
        LocalTime time4 = LocalTime.parse("19:43:25");

        System.out.println("Liczba sekunda jaka upłynęła od godziny 00:00:00 " +
                "do godziny " + time1 + " to: " + time1.toSecondOfDay());
    }
}
