package example;

public class Modyfikatory {
    private int a = 10;
    private int b = 7;
    private int h = 10;
    public int d = 13;

    public Modyfikatory(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Modyfikatory() {
        a = 17;
        this.b = 2;

    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b1) {
        b = b1;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }


    public int pomnoz1(String figura) {
        if (figura == "kwadrat") {
            return a * b;
        } else if (figura == "trapez") {
            return a * h;
        } else {
            return 0;
        }
    }

    public int poleKwadratu() {
        return this.a * this.b;
    }

    //final
    public class Circle {
        public static final double PI = 3.141592653589793238;
    }

}
