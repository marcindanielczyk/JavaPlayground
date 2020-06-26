//package com.example;

import java.time.LocalDateTime;

public class Main3 {

    public static void main(String[] args) {

        //Reprezentacja daty i czasu
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2015,10,25,4,33,11);
        LocalDateTime dateTime3 = LocalDateTime.parse("2018-06-21T19:34:25");

        System.out.println("now(): " + dateTime1);
        System.out.println("of(...): " + dateTime2);
        System.out.println("parse(...): " + dateTime3);


    }
}
