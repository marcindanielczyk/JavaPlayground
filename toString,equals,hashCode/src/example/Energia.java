package example;

public class Energia {
    public double m;
    public static final double G = 9.80665;
    public double h;


    public Energia(double m, final double G, double h) {
        this.m = m;
        this.h = h;
    }

    public double oblEnePot() {
        return m * G * h;
    }


}
