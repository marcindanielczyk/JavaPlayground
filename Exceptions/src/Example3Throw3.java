public class Example3Throw3 {

    public static void main(String[] args) {

        //W tej tablicy podaj słownie indeksy które mają być wypisane na liście "q" - aby zakończyć program,
        // np. "1", "2", "jeden", "10", "-10"
        String[] indexToPrint = new String[]{"1", "2", "3", "10", "jeden", "-1", "dwa", "2", "10", "0", "q"};

        String[] strings = new String[]{"To", "jest", "bardzo", "przydatny", "kurs", "."};

        for (int i = 0; i < 100; i++) {

            String next = indexToPrint[i];
            System.out.println("Pobrano wyraz: " + next);

            if (next.equals("q")) {
                break;
            }

            try {
                int index = getIndex(strings, next);
                System.out.println("Wyraz o indeksie " + index + " to '" + strings[index] + "'");

            } catch (IllegalArgumentException ex) {
                System.out.println("Wystąpił błąd: " + ex.getMessage());
            }
        }
    }

    public static int getIndex(String[] strings, String next) throws IllegalArgumentException {

        int index = 0;
        try {
            index = Integer.valueOf(next);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Nie wprowadzono cyfry!");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Wprowadzona liczba musi być większa od 0!");
        }
        if (index >= strings.length) {
            throw new IllegalArgumentException("Wprowadzona liczba musi być mniejsza od " + strings.length + "!");
        }
        return index;
    }
}