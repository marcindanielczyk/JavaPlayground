import java.util.Arrays;

public class RegExp2 {

    public static void main(String[] args) {
        String example = "W  Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie";

        if(example.matches("(.*)\\s{2}(.*)")){
            System.out.println("Napis ma dwie spacje");
        }

        String jednaspacja = example.replace("  ", " ");
        String wnowejlinii = example.replaceAll("\\si Szczebrzeszyn z tego słynie","\n \ri Szczebrzeszyn z tego słynie");
        System.out.println(wnowejlinii);

        String[] split = jednaspacja.split(" ");
        System.out.println(Arrays.toString(split));
    }
}
