//package com.example;

import java.time.LocalDate;

public class Main1 {

    public static void main(String[] args) {

        //Reprezentacja daty
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2010,1,30);
        LocalDate parseDate = LocalDate.parse("2013-11-02");

        System.out.println("now() : " + nowDate);
        System.out.println("of(...) : " + ofDate);
        System.out.println("parse(...) : " + parseDate);
        System.out.println(ofDate.toString() + "\n");

        //Manipulacja datami
        LocalDate sourceDate = LocalDate.parse("2018-01-01");
        // Warto zauważyć, że raz utworzony obiekt klasy “LocalDate” nie może być już później modyfikowany,
        // dlatego wynik działania metod na zmiennej “sourceDate” za każdym razem przypisywany jest do nowego obiektu.
        LocalDate date1 = sourceDate.plusDays(5);
        LocalDate date2 = sourceDate.minusDays(5);
        LocalDate date3 = sourceDate.minusMonths(6);

        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Date3: " + date3 + "\n");

        //Zapytania o daty
        LocalDate date4 = LocalDate.parse("2018-01-01");
        LocalDate date5 = LocalDate.parse("2019-05-23");

        System.out.println("date4 występuje po date5: " + date4.isAfter(date5));
        System.out.println("date4 występuje przed date5: " + date4.isBefore(date5) + "\n");

        LocalDate date6 = LocalDate.parse("2020-07-15");

        System.out.println("date6 który to dzień tygodnia: " + date6.getDayOfWeek());
        System.out.println("date6 który to dzień miesiąca: " + date6.getDayOfMonth());
        System.out.println("date6 który to dzień roku: " + date6.getDayOfYear() + "\n");

        //isLeapYear()
        System.out.println(date4.getYear() + "jest rokiem przestępnym: " + date4.isLeapYear());
        System.out.println(date5.getYear() + "jest rokiem przestępnym: " + date5.isLeapYear());
        System.out.println(date6.getYear() + "jest rokiem przestępnym: " + date6.isLeapYear());


    }
}
