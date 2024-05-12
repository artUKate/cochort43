package nasledovanie.task1;

    class Car extends Vehicle {
        private int doors;

        public Car(int wheels, int seats, int doors) {
            super(wheels, seats);
            this.doors = doors;
        }

        public void honk() {
            System.out.println("Beep beep!");
        }
    }
