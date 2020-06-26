package paczucha;

public class Engine {

    private Cooler cooler;
    private SparkPlug sparkPlug;

    public Engine(){
        System.out.println("Konsturktor 'Engine' został wywołany");
        this.cooler = new Cooler();
        this.sparkPlug = new SparkPlug();
    }

}
