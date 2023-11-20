package task3;

public class GeometryCalculator {
        public static void main(String[] args) {

                Rectangle rectangle = new Rectangle();
               Circle circle = new Circle();
               Triangle triangle = new Triangle();

            System.out.println("Площадь "+rectangle.areaCalculator(13.7,12.8));
            System.out.println("Периметр "+rectangle.perimeterCalculator(13.2 ,6.5));

            System.out.println("Окружность "+circle.circleOcr(5.4,7.4));
            System.out.println("Периметр "+circle.circlePer(1.3,6.3));

            System.out.println("Площадь "+triangle.trianglePlosh(9.5,34.3));
            System.out.println("Периметр "+triangle.trianglePer(2.5,8.4));
                }
        }
