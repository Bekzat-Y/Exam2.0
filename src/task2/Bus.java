package task2;

public class Bus extends Vehicle{

    public Bus(String make, int year) {
        super(make, year);
    }

    @Override
    void start() {
        System.out.println("Bus start "+make+year);
    }

    @Override
    void stop() {
        System.out.println("Bus stop "+make+year);
    }
}
