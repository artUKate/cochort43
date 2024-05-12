package abstraction.task3;

public class CarNavigationSystem extends NavigationSystem {

    @Override
    public void startNavigation() {
        System.out.println("Car navigation system started");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Car navigation system stopped");
    }
}