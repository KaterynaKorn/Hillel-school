public class Employee {
    private String lastName;
    private String name;
    private String position;
    private int salaryPerHour;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public Employee(String lastName, String name, String position, int salaryPerHour) {
        this.lastName = lastName;
        this.name = name;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salaryPerHour='" + salaryPerHour + '\'' +
                '}';
    }
}
