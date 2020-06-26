import static java.util.logging.Logger.global;

public class Main {

    public static void main(String[] args) {
        int[] tab1 = {20, 10, 13, 30, 100, 20, 102, 4, 10, 17};
        int min = tab1[0];
        int max = tab1[0];
        int length = tab1.length;

        for (int i = 0; i < length; i++) {
            int value = tab1[i];
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }

        }
        double suma = 0;

        for (int value : tab1) {
            suma = suma + value;
        }
        double avg = suma/length;


        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avg = " + avg);


    }
}
