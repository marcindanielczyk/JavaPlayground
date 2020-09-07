import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int pierw_licz;
        int druga_licz;
        char znak;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        pierw_licz = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        druga_licz = scanner.nextInt();


        System.out.println("Dodawanie - wciśnij +");
        System.out.println("Odejmowanie - wciśnij -");
        System.out.println("Mnożenie - wciśnij *");
        System.out.println("Dzielenie - wciśnij /");
        System.out.println("Modulo - wciśnij %");

        znak = scanner.next().charAt(0);
        switch(znak) {
            case '+':
            {
                System.out.println(pierw_licz + druga_licz);
                break;
            }
            case '-':
            {
                System.out.println(pierw_licz - druga_licz);
                break;
            }
            case '*':
            {
                System.out.println(pierw_licz * druga_licz);
                break;
            }
            case '/':
            {

                if(druga_licz == 0){
                    System.out.println("Nie dzielimy przez zero!");
                }
                else{
                    System.out.println(pierw_licz/druga_licz + " reszty: " + pierw_licz % druga_licz);;
                }
                break;
            }
            case '%':
            {
                if(druga_licz == 0){
                    System.out.println("Nie dzielimy przez 0");
                }
                else
                {
                    System.out.println(pierw_licz % druga_licz);
                }
                break;
            }

            }
    }
}