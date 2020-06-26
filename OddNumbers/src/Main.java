import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] Los_tab = new int[10];
        int i = 0;
        while (i < Los_tab.length) {
            if (i % 2 == 0) {
                Los_tab[i] = i + 1;
            } else {
                Los_tab[i] = i;
            }

            i++;
        }
        System.out.println("Los_tab =" + Arrays.toString(Los_tab));
    }

}

