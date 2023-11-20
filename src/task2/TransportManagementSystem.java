package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Bike bike = new Bike("Kawasaki",2020);
        Bus bus = new Bus("HippiBus",1984);
        Car car = new Car("Bmw",2008);
        bus.start();
        bus.stop();
        System.out.println();
        bike.start();
        bike.stop();
        System.out.println();
        car.start();
        car.stop();

    }
}
