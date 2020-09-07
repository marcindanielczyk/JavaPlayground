package example;

public class Karton1 {
    //pole klasy
    public String nazwa;
    public int ilosc;
    public String coto;

    //metody klasy

    public String wypij1(boolean zatrucie) {
        if (zatrucie) {
            String example = "Siurpsiurp pije " + coto + " z firmy " + nazwa + ". Chcesz wiedziec ile? To Ci powiem: " + ilosc + " ale sie holipka zatrułem.";
            return example;
        } else {
            return "Siurpsiurp pije " + coto + " z firmy " + nazwa + ". Chcesz wiedziec ile? To Ci powiem: " + ilosc;
        }

    }

}
