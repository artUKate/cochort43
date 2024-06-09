package MiniProject;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String departmentName;

    public Employee(String firstName, String lastName, String position, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.departmentName = departmentName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + position + ") - " + departmentName;
    }
}
