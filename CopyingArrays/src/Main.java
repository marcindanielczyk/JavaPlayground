import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int length = 5;
        int[] tab1 = new int[length];
            // int[] tab1[] = new int[length][];  czy tak moze byc dla wielowymiarowej?
             // int tab2[] = new int[length];

        Random randomGenerator = new Random();

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = randomGenerator.nextInt(10);
        }

        int[] tab2 = new int[tab1.length];
        System.arraycopy(tab1, 0, tab2, 0, length);

        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));


        int[] tab3 = new int[tab1.length];

        for (int i = 0; i < tab3.length; i++){
            tab3[i] = tab1[i];
        }
        System.out.println("---");
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab3));

    }

}
