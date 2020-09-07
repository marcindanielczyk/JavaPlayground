//Kolekcja typu Set pozwala tylko na przechowywanie unikalnych elementów
//Implementacja HashSet nie zachowuje porządku wstawianych elementów


import java.util.HashSet;
import java.util.Set;

public class Example3CollectionSet {

    public static void main(String[] args) {

        //Dodanie elementów do kolekcji
        Set<String> strings = new HashSet<>();
        strings.add("Jeden");
        strings.add("Dwa");
        strings.add("Dwa");
        strings.add("Trzy");
        strings.add("Cztery");
        strings.add("Cztery");

        //Wyświetlanie zawartości kolekcji
        for (String string : strings){
            System.out.println(string);
        }

        //Wyświetlanie ilości elementów w kolekcji
        System.out.println("Ilość elementów wynosi: " + strings.size());

        //Sprawdzenie czy w kolekcjach występują dane
        System.out.println("Czy występuje w kolekcji wyraz Dwa: " + strings.contains("Dwa"));

        //Usunięcie elementu "Dwa"
        strings.remove("Dwa");
        System.out.println("Czy występuje w kolekcji wyraz Dwa:" + strings.contains("Dwa"));

        System.out.println("Czy występuje w kolekcji wyraz Adam: " + strings.contains("Adam"));

        //Sprawdzenie czy kolekcja jest pusta
        System.out.println("Czy kolekcja jest pusta: " + strings.isEmpty());

        //Wyczyszczenie kolekcji
        strings.clear();
        System.out.println("Czy kolekcja jest pusta (po metodzie clear()): " + strings.isEmpty());
    }
}
