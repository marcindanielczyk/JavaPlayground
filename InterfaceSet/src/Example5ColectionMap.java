//Kolekcja typu Map pozwala na zduplikowane wartości
//Kolekcja Map pozwala na mapowanie klucz na wartość


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example5ColectionMap {

    public static void main(String[] args) {

        //Utworzenie obiektu map
        Map<String, String> stringMap = new HashMap<>();

        //Dodanie elementó∑ do mapy
        stringMap.put("1", "Jeden");
        stringMap.put("2", "Dwa");
        stringMap.put("3", "Trzy");
        stringMap.put("4", "Cztery");

        //Przejście po wszystkich elementach mapy i wyświetlenie ich na konsolii
        Set<String> keySet = stringMap.keySet();//czemu tu tworze Set
        for (String key : keySet) {
            System.out.println("klucz: " + key + " wartość: " + stringMap.get(key));
        }

        //Sprawdzenie czy mapa zawiera klucz
        System.out.println("Mapa zawiera klucz 1: " + stringMap.containsKey("1"));
        System.out.println("Mapa zawiera klucz 10: " + stringMap.containsKey("10"));

        //Sprawdzenie czy mapa zawiera wartość
        System.out.println("Mapa zawiera wartośc 'Jeden': " + stringMap.containsValue("Jeden"));
        System.out.println("Mapa zawiera wartośc 'Pięć': " + stringMap.containsValue("Pięć"));

        //Wyświetlenie zawartości mapy przy pomocy przeciążonej metody toString()
        System.out.println(stringMap.toString());

        //Użycie mapy w przypadku zamiany tekstu w stringu
        String message = "1, 2, 3, Start. Programujemy coraz lepiej...";
        System.out.println("Oryginalny komunikat: " + message);

        Set<String> words = stringMap.keySet();//Czemu tu tworze Set
        for (String word : words) {
            message = message.replace(word, stringMap.get(word));//skad wie ze word to sa wartosci
        }

        System.out.println("Komunikat po zamianie: " + message);
    }
}
