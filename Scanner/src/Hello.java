import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz swoje imię: ");
        String name1 = scanner.nextLine();
        System.out.println("Witaj " + name1);

    }
}
