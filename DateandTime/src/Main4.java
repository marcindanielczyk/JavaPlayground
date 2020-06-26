//package com.example;

import java.util.Iterator;
import java.util.Set;
import java.time.ZoneId;

public class Main4 {

    public static void main(String[] args) {

        //Reprezentacja strefy czasowe
        ZoneId zone1 = ZoneId.of("Europe/London");
        ZoneId zone2 = ZoneId.of("Europe/Warsaw");
        ZoneId zone3 = ZoneId.of("GMT");

        //Dostępne strefy czasowe
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        Iterator<String> setIterator = availableZoneIds.iterator();

        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }


    }
}
