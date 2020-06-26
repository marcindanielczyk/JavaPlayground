import java.util.ArrayList;
import java.util.List;

public class Example2Collection {

    public static void main(String[] args) {

        //Utworzenie tablic stringów
        String[] strings = new String[]{"jeden", "dwa", "trzy", "cztery"};

        //Utworzenie kolekcji stringów
        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");
        stringList.add("cztery");

        //Iteracja na obkietach umieszczonych w tablicy
        for (String string : strings) {
            System.out.println(string);
        }

        //Iteracja na obiektach umieszczonych w kolekcji danych
        for (String string : stringList) {
            System.out.println(string);
        }
        
    }
}