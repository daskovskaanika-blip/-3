package model;
public class Employee {
    protected int id;
    protected String first_name;
    protected String last_name;
    protected String position;


    String department = "IT Department";

    public Employee(int id, String first_name, String last_name, String position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPosition() {
        return position;
    }

    public void showInfo() {
        System.out.println("Employee [id=" + id + ", name=" + first_name + " " + last_name + ", position=" + position + "]");
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", first_name='" + first_name + "', last_name='" + last_name + "', position='" + position + "'}";
    }
}
