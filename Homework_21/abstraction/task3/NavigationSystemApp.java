package abstraction.task3;

public class NavigationSystemApp {

    public static void main(String[] args) {
        NavigationSystem carNavigation = new CarNavigationSystem();
        NavigationSystem marineNavigation = new MarineNavigationSystem();

        carNavigation.startNavigation();
        carNavigation.stopNavigation();

        marineNavigation.startNavigation();
        marineNavigation.stopNavigation();
    }
}