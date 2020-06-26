package sprzet.komputer;

public class PlytaGlowna {

    private Procesor procesor;
    private KartaGraficzna kartagraficzna;
    private PamiecRam pamiecram;

    public PlytaGlowna(){
        System.out.println("Konstruktor z klasy PlytaGlowna");
        this.procesor = new Procesor(3);
        this.kartagraficzna = new KartaGraficzna();
        this.pamiecram = new PamiecRam();
    }
}
