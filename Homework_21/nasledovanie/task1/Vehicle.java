package nasledovanie.task1;
/*Создайте базовый класс Vehicle с общими свойствами и методами
для транспортных средств. Затем создайте производные классы Car и
Bicycle, расширяющие класс Vehicle, добавляя специфические свойства
 и методы (например, количество дверей для автомобиля).
 */
public class Vehicle {
    int wheels;
    int seats;

    public Vehicle(int wheels, int seats) {
    }

    public void Vehicle(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public void drive() {
        System.out.println("The vehicle is in motion.");
    }
}

