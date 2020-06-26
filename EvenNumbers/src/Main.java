import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] Fill_tab = new int[10];

        for (int i = 0; i < Fill_tab.length; i++) {
            if (i % 2 == 1) {
                Fill_tab[i] = -1;
            } else {
                Fill_tab[i] = i;
            }
        }

        System.out.println("Fill_tab:" + Arrays.toString(Fill_tab));
    }

}
