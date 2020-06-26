package paczucha.paczka.Karton;

public class Karton {
    //pole klasy
    static int ileRazy;
    int ileRazyBezStatic;

    public String nazwa;
    public int ilosc;
    public String coto;

    //metody klasy
    // jak jest void to nic nie zwraca(w sensie wyswietla) i trzeba pisać System.out.println
    public void wypij(boolean zatrucie) {
        ileRazy++;
        ileRazyBezStatic++;
        if (zatrucie) {
            System.out.println("Pije " + coto + " z firmy " + nazwa + ". W ilości: " + ilosc + " i sie tym zatrułem");
        } else {
            String example = "Pije " + coto + " z firmy " + nazwa + ". W ilości: " + ilosc;
            System.out.println(example.toString());

        }

    }

    public static int ileRazyWypili() {
        return ileRazy;
    }

    public int IleRazyBezStatic() {
        return ileRazyBezStatic;
    }

}
