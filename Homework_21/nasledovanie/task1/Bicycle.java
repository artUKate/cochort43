package nasledovanie.task1;

class Bicycle extends Vehicle {
    private int gears;

    public Bicycle(int wheels, int seats, int gears) {
        super(wheels, seats);
        this.gears = gears;
    }

    public void ringBell() {
        System.out.println("Ring ring!");
    }
}