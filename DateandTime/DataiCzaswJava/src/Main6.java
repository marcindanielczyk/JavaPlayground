//package com.example;

import java.time.LocalDate;
import java.time.Period;

public class Main6 {

    public static void main(String[] args) {

        Period period1 = Period.of(2,4,6);
        Period period2 = Period.between(LocalDate.parse("2017-08-01"),LocalDate.parse("2017-08-21"));
        Period period3 = Period.between(LocalDate.parse("2015-08-01"), LocalDate.parse("2017-11-27"));

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
    }
}
