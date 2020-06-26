package typwyliczeniowy;

import java.util.EnumMap;

public class Main {

    public static void main(String[] args) {

        DniTygodnia poniedzialek = DniTygodnia.PONIEDZIALEK;
        DniTygodnia wtorek = DniTygodnia.WTOREK;
        DniTygodnia sroda = DniTygodnia.SRODA;
        DniTygodnia czwartek = DniTygodnia.CZWARTEK;
        DniTygodnia piatek = DniTygodnia.PIATEK;
        DniTygodnia sobota = DniTygodnia.SOBOTA;
        DniTygodnia niedziela = DniTygodnia.NIEDZIELA;

        DniTygodnia[] dnitygodnia = DniTygodnia.values();

        for (DniTygodnia wszystkiedni : dnitygodnia) {
            System.out.println("dzien= " + wszystkiedni.toString());
        }

        Wojewodztwa[] wojewodztwa = Wojewodztwa.values();

        for (Wojewodztwa i : wojewodztwa) {
            System.out.println("wojewodztwo= " + i);
        }

        //do 3 zadania chyba trzeba wykorzystac interfejs typu map czy cos

        EnumMap<AmerykaPlnPanstwa, String> enumowaMapa = new EnumMap<>(AmerykaPlnPanstwa.class);
        enumowaMapa.put(AmerykaPlnPanstwa.ANTIGUA_I_BARBUDA, "StolicaAntigua");
        enumowaMapa.put(AmerykaPlnPanstwa.BAHAMY, "StolicaBahamy");
        enumowaMapa.put(AmerykaPlnPanstwa.BARBADOS, "StolicaBarbados");


        System.out.println(enumowaMapa.getOrDefault(AmerykaPlnPanstwa.BELIZE, "brak panstwa"));

        System.out.println(zwrocStolice(AmerykaPlnPanstwa.BAHAMY));

        System.out.println(zwrocStoliceSwitch(AmerykaPlnPanstwa.BAHAMY));

        System.out.println(zwrocStolicePoleKlasy(AmerykaPlnPanstwa.BAHAMY));

        System.out.println(zwrocStoliceMetodaAbstrakcyjna(AmerykaPlnPanstwa2.BAHAMY));


    }

    private static String zwrocStolice(AmerykaPlnPanstwa panstwo) {
        if (panstwo == AmerykaPlnPanstwa.ANTIGUA_I_BARBUDA) {
            return "stolicaAntigua";
        } else if (panstwo == AmerykaPlnPanstwa.BAHAMY) {
            return "stolciaBahamy";
        } else if (panstwo == AmerykaPlnPanstwa.BARBADOS) {
            return "stolicaBarbados";
        }
        return "Nieznane paśtwo!";
    }

    private static String zwrocStoliceSwitch(AmerykaPlnPanstwa panstwo) {
        switch (panstwo) {
            case ANTIGUA_I_BARBUDA:
                return "stolicaAntigua";
            case BAHAMY:
                return "stolciaBahamy";
            case BARBADOS:
                return "stolicaBarbados";
            case BELIZE:
                return "stolicaBelize";
            default:
                return "Nieznane panstwo";

        }

    }

    private static String zwrocStolicePoleKlasy(AmerykaPlnPanstwa panstwo) {
// Kotlinowski  val example: String = if (true) "wartosc jest true" else "wartosc jest false";
        String value;
        if (true) {
            value = "wartosc jest true";
        } else {
            value = "wartosc jest false";
        }

        return panstwo == null ? "Nie moze byc null" : panstwo.getStolica();
    }

    private static String zwrocStoliceMetodaAbstrakcyjna(AmerykaPlnPanstwa2 panstwo) {
        return panstwo.getStolica();
    }
}


