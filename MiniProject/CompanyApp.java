package MiniProject;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();


        company.addDepartment("IT");
        company.addDepartment("HR");


        company.addEmployee("Anna", "Ivanova", "Developer", "IT");
        company.addEmployee("Alex", "Petrov", "Recruiter", "HR");
        company.addEmployee("Oleg", "Sidorov", "Manager", "IT");


        System.out.println("Все сотрудники компании:");
        for (Employee employee : company.getAllEmployees()) {
            System.out.println(employee);
        }


        company.transferEmployee("Alex", "Petrov", "IT");
        System.out.println("\nПосле перевода Alex Petrov в IT:");
        for (Employee employee : company.getAllEmployees()) {
            System.out.println(employee);
        }


        company.updateEmployeeInfo("Anna", "Ivanova", "Senior Developer", "IT");
        System.out.println("\nПосле обновления информации о Anna Ivanova:");
        for (Employee employee : company.getAllEmployees()) {
            System.out.println(employee);
        }


        company.removeEmployee("Oleg", "Sidorov");
        System.out.println("\nПосле удаления Oleg Sidorov:");
        for (Employee employee : company.getAllEmployees()) {
            System.out.println(employee);
        }


        System.out.println("\nСотрудники отдела IT:");
        for (Employee employee : company.getEmployeesByDepartment("IT")) {
            System.out.println(employee);
        }


        System.out.println("\nКоличество сотрудников в компании: " + company.getEmployeeCount());

        System.out.println("\nПоиск сотрудников по отделу HR:");
        for (Employee employee : company.searchEmployeesByDepartment("HR")) {
            System.out.println(employee);
        }

        System.out.println("\nПоиск сотрудников по должности Developer:");
        for (Employee employee : company.searchEmployeesByPosition("Developer")) {
            System.out.println(employee);
        }

        System.out.println("\nПоиск сотрудников по имени :");
        for (Employee employee : company.searchEmployeesByName("Alex")) {
            System.out.println(employee);
        }
    }
}
