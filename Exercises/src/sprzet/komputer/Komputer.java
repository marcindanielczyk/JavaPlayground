package sprzet.komputer;

public class Komputer {

    private String obudowa;
    private PlytaGlowna plytaglowna;
    private Zasilacz zasilacz = new Zasilacz();
    private DyskTwardy dysktwardy = new DyskTwardy();

    public Komputer(){
        System.out.println("Konstruktor z klasy Komputer");
        this.plytaglowna = new PlytaGlowna();
    }
}
