import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10");

        do{
            i++;
            System.out.println("Wybierz liczbę od 1 do 10: ");
            odp = scanner.nextInt();
            if(odp > los){
                System.out.println("Moja liczba jest mniejsza");
            }
            else if(odp < los){
                System.out.println("Moja liczba jest większa");
            }

        }while(los != odp);

        System.out.println("Udało Ci się zgadnąć za " + i + " razem!");
    }
}
