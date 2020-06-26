/* 1. Program nie kompiluje się
   2. Tak, program nie mógł się skompilować ponieważ
   wyjątek typu Exception wymaga zapewnienia obsługi
 */

public class Example2Throw {

    public static void main(String[] args) throws Exception {

        //W tej tablicy podaj słownie indeksy które mają być wypisane na liście "q" - aby zakończyć program,
        // np. "1", "2", "jeden", "10", "-10"
        String[] indexToPrint = new String[]{"1", "2", "3", "10", "jeden", "q"};

        String[] strings = new String[]{"To", "jest", "bardzo", "przydatny", "kurs", "."};

        for (int i=0;i<100;i++){

            String next = indexToPrint[i];
            System.out.println("pobrano wyraz: " + next);

            if (next.equals("q")){
                break;
            }

            int index = getIndex(strings,next);
            System.out.println("Wyraz o indeksie " + index + " to '" + strings[index] + "'");

        }
    }

    public static int getIndex(String[] strings, String next) throws Exception {

        int index = Integer.valueOf(next);
        if (index < 0){
            throw new Exception("Wprowadzona liczba musi być większa od 0!");
        }
        if (index >= strings.length){
            throw new Exception("Wprowadzona liczba musi być mniejsza od " +strings.length + "!");
        }
        return index;
    }
}
