// Przykład błędu programisty, ukrywanie wystąpienia wyjątku
public class UkrywanieWyjątku {
    try{
        int index = getIndex(strings, next)
        System.out.println("Wyraz o indeksie " + index + " to '" + strings[index] + "'");
    } catch (Exception ex) {

    }
}

// Prawidłowa minimalna obsługa wyjątku, wyświetlenie na konsoli błędu
public class UkrywanieWyjątku {
    try {
        int index = getIndex(strings, next)
        System.out.println("Wyraz o indeksie " + index + " to '" + strings[index] + "'");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

    /*                                                                          Dobre praktyki
            Na sam koniec rozdziału z wyjątkami przedstawimy Ci kilka dobrych praktyk pracy z wyjątkami:

        - jeżeli stosujesz blok try {…} catch() {…} to on powinien być jak najmniejszy. Jeżeli zastosujesz bardzo rozbudowane bloki to tracisz możliwość generowania lepszego kodu obsługi błędów
        - zamiast ogólnych, stosuj specjalizowane wyjątki, które niosą informację co się stało. Jeżeli wśród standardowych nie znajdziesz takiego który jest Ci potrzebny stwórz swój.
        - stosuj wyjątki typu „checked”, są one trudniejsze do implementacji, ale wymuszają napisanie kodu obsługi danego wyjątku
        - nie stosuj wyjątków do obsługi logiki biznesowej – wyjątki nie służą do zwracania stanu z metody lub zmiany logiki programu. Służą wyłącznie do zgłaszania sytuacji wyjątkowej

     */