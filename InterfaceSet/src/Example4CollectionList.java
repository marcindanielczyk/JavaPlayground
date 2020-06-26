//Kolekcja typu List pozwala na duplikowanie elementów
//W kolekcjach typu List można wstawiać elementy na dowolnych pozycjach

import java.util.ArrayList;
import java.util.List;

public class Example4CollectionList {

    public static void main(String[] args) {

        //Utworzenie pustej listy i dodanie do niej elementów
        List<String> stringList = new ArrayList<>();
        stringList.add("Jeden");
        stringList.add("Dwa");
        stringList.add("Trzy");
        stringList.add("Cztery");
        stringList.add(3, "Dwa");
        stringList.add(3,"Pięć");
        stringList.add(4,"Sześć");

        //Wyświetlenie zawartości listy przy pomocy pętli forEach
        for (String numbers : stringList){
            System.out.println(numbers);
        }

        //Pobranie z listy elementu o indeksie
        System.out.println("W liście na pozycji 0 jest: " + stringList.get(0));
        System.out.println("W liście na pozycji 3 jest: " + stringList.get(3));

        //Pobranie indeksu danego elementu
        System.out.println("W liście 'Trzy' jest na pozycji: " + stringList.indexOf("Trzy"));
        System.out.println("W liście 'Pięć' jest na pozycji: " + stringList.indexOf("Pięć"));

        //Wyświetlenie ilości elementów w liście
        System.out.println("Do listy dodano: " + stringList.size());

        //Usunięcie elementu z listy
        stringList.remove("Pięć");

        //Wyświetlenie zawartości listy przy pomocy przeciążonej metody toString()
        System.out.println(stringList.toString());
    }


}
