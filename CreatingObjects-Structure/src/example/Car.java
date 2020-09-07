package example;

public class Car {

    private Engine engine;
    private SteeringWheel steeringWheel;

    public Car(){
        System.out.println("Konstruktor 'Car' został wywołany");
        this.steeringWheel = new SteeringWheel();
        this.engine = new Engine();
    }
}
