package nasledovanie.task3;

import java.util.Arrays;

class Developer extends Employee {
    private String[] projects;

    public Developer(String name, int id, double salary, String[] projects) {
        super(name, id, salary);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", salary=" + getSalary() +
                ", projects=" + Arrays.toString(projects) +
                '}';
    }
}
