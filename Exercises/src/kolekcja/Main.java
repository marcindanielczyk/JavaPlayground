package kolekcja;

import java.util.*;

public class Main {


    public static void main(String[] args) {
 //1.Zadanie
        //Tworze liste typu integer
        List<Integer> intList = new ArrayList<>();
        intList.add(20);
        intList.add(20);
        intList.add(31);
        intList.add(30);
        intList.add(34);
        intList.add(30);
        intList.add(40);
        intList.add(43);
        intList.add(40);
        intList.add(20);
        intList.add(10);
        intList.add(11);
        intList.add(20);
        intList.add(30);

        List<Integer> intList2 = new ArrayList<>(List.of(20, 20, 20));
        intList2.add(13);

        //Sprawdzam jakie wartosci sa dodane do List
        for(int liczby:intList){
            System.out.println(liczby);
        }

        System.out.println("--------");

        //Musze dodac wartosci z intList  do intSet(tylko nie wiem czy TreeSet,HashSet czy co)
        Set<Integer> intSet = new TreeSet<>();
        intSet.addAll(intList);
        //albo tak
        Set<Integer> intSet2 = new HashSet<>(intList);

        //Sprawdzam jakie wartosci sa dodane do Set
        for(int liczby2:intSet){
            System.out.println(liczby2);
        }




    }
}
