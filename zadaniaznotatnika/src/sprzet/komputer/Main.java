package sprzet.komputer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Komputer komputer = new Komputer();

        ArrayList<Procesor> procesors = new ArrayList<>();
        procesors.add(new Procesor(2));
        procesors.add(new Procesor(5));
        procesors.add(new Procesor(8));
        procesors.add(new Procesor(3));
        procesors.add(new Procesor(1));

        Collections.sort(procesors);

    }
}
