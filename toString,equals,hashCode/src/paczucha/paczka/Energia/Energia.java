package paczucha.paczka.Energia;

public class Energia {
    public double m;
    public static final double G = 9.80665;
    public double h;

    //cos tu nie halo z tym G
    public Energia(double m, final double G, double h) {
        this.m = m;
        this.h = h;
    }

    public double oblEnePot() {
        return m * G * h;
    }


}
