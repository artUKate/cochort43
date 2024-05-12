package abstraction.task3;

public class MarineNavigationSystem extends NavigationSystem {

    @Override
    public void startNavigation() {
        System.out.println("Marine navigation system started");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Marine navigation system stopped");
    }
}