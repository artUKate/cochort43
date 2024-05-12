package nasledovanie.task3;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee developer1 = new Developer("John", 1, 50000, new String[]{"Project A", "Project B"});
        Employee developer2 = new Developer("Alice", 2, 60000, new String[]{"Project C", "Project D"});

        System.out.println("Developer 1: " + developer1);
        System.out.println("Developer 2: " + developer2);

        Employee manager = new Manager("Bob", 3, 70000, new Employee[]{developer1, developer2});

        System.out.println("Manager: " + manager);
    }
}