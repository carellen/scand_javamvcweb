package scand.model;

public class Employee extends Entity {
    private String position;
    private String department;
    private String characteristic;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String position, String department, String characteristic) {
        super(id, firstName, lastName);
        this.position = position;
        this.department = department;
        this.characteristic = characteristic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", characteristic='" + characteristic + '\'' +
                "} ";
    }
}
