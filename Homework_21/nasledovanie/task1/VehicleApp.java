package nasledovanie.task1;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car(4, 5, 4);
        System.out.println("Car has " + car.wheels + " wheels and " + car.seats + " seats.");
        car.drive();
        car.honk();

        Bicycle bicycle = new Bicycle(2, 1, 6);
        System.out.println("Bicycle has " + bicycle.wheels + " wheels and " + bicycle.seats + " seat.");
        bicycle.drive();
        bicycle.ringBell();
    }
}