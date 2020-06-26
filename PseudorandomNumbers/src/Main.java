import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

      int[] randomArray = new int[10];
      Random randomGenerator = new Random();

      for (int i = 0; i < randomArray.length; i++){
          randomArray[i] = 5 + randomGenerator.nextInt(10);

        }

      System.out.println(Arrays.toString(randomArray));
    }
}
