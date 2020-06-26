package inheritance;

import org.jetbrains.annotations.NotNull;

//1.
public class Car extends Vehicle {

    //1
    int numberOfSeats = 0;

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }
}

//2.
class Car1 extends Vehicle {
    //czemu musi byc notnull
    @Override
    public void setLicensePlate(@NotNull String license) {
        this.licensePlate = license.toLowerCase();
    }
}

    //If you override a method in a subclass, but still need to call the method defined in the superclass,
    //you can do so using the super reference, like this:
class Car3 extends Vehicle {
        public void setLicensePlate(String license) {
            super.setLicensePlate(license);
        }
    }

//The instanceof instruction can also be used determine if an object is a instance of a superclass of its class.
class Car4 extends Vehicle {
    Car car = new Car();

    boolean isVehicle = car instanceof Vehicle;
}

// The Java inheritance mechanism does not include constructors.
// In other words, constructors of a superclass are not inherited by subclasses.
// Subclasses can still call the constructors in the superclass using the super() contruct.
// In fact, a subclass constructor is required to call one of the constructors in the superclass
// as the very first action inside the constructor body.

//nested class
class MyClass {

    class MyNestedClass {

    }

}
public class MySubclass extends MyClass {

    public static void main(String[] args) {
        MySubclass subclass = new MySubclass();

        MyNestedClass nested =  subclass.new MyNestedClass();
    }
}
