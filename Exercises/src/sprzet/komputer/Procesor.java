package sprzet.komputer;

import java.util.Comparator;

public class Procesor implements Comparable<Procesor> {

    private int iloscrdzeni;

    public Procesor(int iloscrdzeni){
        this.iloscrdzeni = iloscrdzeni;
        System.out.println("Konstruktor z klasy Procesor");
    }


    @Override
    public int compareTo(Procesor o) {
        return 0;
    }
}
