package inheritance;

public class inheritance_type_casting {

    public static void main(String[] args) {

        // rzutowanie
        Car car = new Car();
        // upcast to Vehicle
        Vehicle vehicle = car;

        // downcast to car again
        Car car2 = (Car) vehicle;


    }
}
