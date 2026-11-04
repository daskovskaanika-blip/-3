package model;
public class Admin extends Employee { // Наслідується від Employee (ієрархія)
    protected String login;
    protected String role;

    public Admin(int id, String first_name, String last_name, String position, String login, String role) {
        super(id, first_name, last_name, position);
        this.login = login;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getRole() {
        return role;
    }

    public void viewEmployeeInfo(Employee employee) {
        employee.showInfo();
    }

    public void viewTimeRecord(TimeRecord record) {
        System.out.println(record);
    }

    @Override
    public void showInfo() {
        System.out.println("Admin [id=" + id + ", name=" + first_name + " " + last_name + ", login=" + login + ", role=" + role + "]");
    }

    @Override
    public String toString() {
        return "Admin{id=" + id + ",\n full_name='" + first_name + " " + last_name + "', login='" + login + "', role='" + role + "'}";
    }
}
