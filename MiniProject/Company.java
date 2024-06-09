package MiniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {
    private Map<String, Department> departments;

    public Company() {
        this.departments = new HashMap<>();
    }



    public void addDepartment(String name) {
        departments.put(name, new Department(name));
    }

    public Department getDepartment(String name) {
        return departments.get(name);
    }

    public void removeDepartment(String name) {
        departments.remove(name);
    }



    public void addEmployee(String firstName, String lastName, String position, String departmentName) {
        Department department = departments.get(departmentName);
        if (department != null) {
            Employee employee = new Employee(firstName, lastName, position, departmentName);
            department.addEmployee(employee);
        }
    }

    public Employee findEmployee(String firstName, String lastName) {
        for (Department department : departments.values()) {
            for (Employee employee : department.getEmployees()) {
                if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                    return employee;
                }
            }
        }
        return null;
    }

    public void removeEmployee(String firstName, String lastName) {
        for (Department department : departments.values()) {
            for (Employee employee : department.getEmployees()) {
                if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                    department.removeEmployee(employee);
                    return;
                }
            }
        }
    }

    public void transferEmployee(String firstName, String lastName, String newDepartmentName) {
        Employee employee = findEmployee(firstName, lastName);
        if (employee != null) {
            removeEmployee(firstName, lastName);
            employee.setDepartmentName(newDepartmentName);
            Department newDepartment = departments.get(newDepartmentName);
            if (newDepartment != null) {
                newDepartment.addEmployee(employee);
            }
        }
    }

    public void updateEmployeeInfo(String firstName, String lastName, String newPosition, String newDepartmentName) {
        Employee employee = findEmployee(firstName, lastName);
        if (employee != null) {
            employee.setPosition(newPosition);
            transferEmployee(firstName, lastName, newDepartmentName);
        }
    }



    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        for (Department department : departments.values()) {
            allEmployees.addAll(department.getEmployees());
        }
        return allEmployees;
    }

    public List<Employee> getEmployeesByDepartment(String departmentName) {
        Department department = departments.get(departmentName);
        return department != null ? department.getEmployees() : new ArrayList<>();
    }

    public long getEmployeeCount() {
        return getAllEmployees().size();
    }
    public List<Employee> searchEmployeesByDepartment(String departmentName) {
        return getEmployeesByDepartment(departmentName);
    }

    public List<Employee> searchEmployeesByPosition(String position) {
        return getAllEmployees().stream()
                .filter(employee -> employee.getPosition().equalsIgnoreCase(position))
                .collect(Collectors.toList());
    }

    public List<Employee> searchEmployeesByName(String name) {
        return getAllEmployees().stream()
                .filter(employee -> employee.getFirstName().equalsIgnoreCase(name) || employee.getLastName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}

