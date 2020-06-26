import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = new int[]{20, 10, 13, 30, 100, 20, 102, 4, 10, 17};

        System.out.println(Arrays.toString(values));

        bubbleSort(values);

        System.out.println(Arrays.toString(values));

    }

    private static void bubbleSort(int[] tab) {
        int length = tab.length;
        int temporary = 0;
        int range = 0;

        for (int i = 0; i < length; i++) {

            range = length - 1 - i;

            for (int j = 0; j < range; j++) {
                if (tab[j] > tab[j + 1]) {
                    temporary = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temporary;
                }
            }
        }

    }
}
