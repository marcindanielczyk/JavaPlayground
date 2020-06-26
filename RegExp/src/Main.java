import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String example = "Hello World, it's world of RegExp";

        //Przykład szukania znaków/słów w tekście
        System.out.println("Czy tekst zawiera słowo 'World': " + example.matches("World"));
        System.out.println("Czy tekst zawiera słowo 'World': " + example.matches(".*World.*"));
        System.out.println("Czy tekst zawiera literę 'a': " + example.matches(".*a"));
        System.out.println("Czy tekst zawiera literę 'o': " + example.matches(".*o?"));

        //Przykłąd zamiany tekstu
        System.out.println("Zamiana pierwszego słowa 'World' na 'moooo': " + example.replace("World", "moooo"));
        System.out.println("Zamiana wszystkich liter 'o' na 'a': " +example.replace('o', 'a'));

        //Przykład zamiany słów w tekście
        System.out.println("Zamiana wszystkich słów 'World' i 'world' na 'moooo': " + example.replaceAll("[Ww]orld", "moooo"));

        //Podział tekstu na poszczególne wyrazy
        String[] split = example.split(" ");
        System.out.println("Wynikowa tablica po podziale na znaku spacji: " + Arrays.toString(split));

        String[] split2 = example.split(",");
        System.out.println("Wynikowa tablica po podziale na znaku ',': " + Arrays.toString(split2));


    }
}
