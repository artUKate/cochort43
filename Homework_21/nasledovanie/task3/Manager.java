package nasledovanie.task3;

import java.util.Arrays;

class Manager extends Employee {
    private Employee[] subordinates;

    public Manager(String name, int id, double salary, Employee[] subordinates) {
        super(name, id, salary);
        this.subordinates = subordinates;
    }

    public Employee[] getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Employee[] subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", salary=" + getSalary() +
                ", subordinates=" + Arrays.toString(subordinates) +
                '}';
    }
}
