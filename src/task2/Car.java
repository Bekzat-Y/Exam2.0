package task2;

public class Car extends Vehicle {
    public Car(String make, int year ){
        super(make,year);
    }
    @Override
    void start() {
        System.out.println("Car start "+make+year);

    }

    @Override
    void stop() {
        System.out.println("Car stop  " + make + year);

    }
}
