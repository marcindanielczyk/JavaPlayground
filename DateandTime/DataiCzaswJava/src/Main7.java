//package com.example

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main7 {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2010,10,12,13,41,21);
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy-HH:mm");

        System.out.println(dateTime.format(customDateTimeFormatter));
    }
}
