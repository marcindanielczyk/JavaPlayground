import java.util.Arrays;

public class RegExp {

    public static void main(String[] args) {
        String example = "W  Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie";

        System.out.println("Napis ma dwie spacje: " + example.matches(".*\\s{2}.*"));
        System.out.println("Zamień podwójną spację na pojedynczą spację: " + example.replace("  ", " "));

        String[] split1 = example.split(" \\t");
        System.out.println(split1[0]);
        System.out.println(split1[1]);

        String[] split2 = example.split(" ");
        System.out.println(Arrays.toString(split2));
    }
}
