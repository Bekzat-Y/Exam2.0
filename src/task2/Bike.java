package task2;

    public class Bike extends Vehicle{
        public Bike(String make, int year) {
            super(make, year);
        }

        @Override
        void start() {
            System.out.println("Bike start "+make+year);
        }

        @Override
        void stop() {
            System.out.println("Bike stop "+make+year);

        }
    }
