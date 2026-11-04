package model;
public class TimeRecord {
    protected int id;
    protected int employee_id;
    protected String date;
    protected double hours;
    protected String status;

    public TimeRecord(int id, int employee_id, String date, double hours, String status) {
        this.id = id;
        this.employee_id = employee_id;
        this.date = date;
        this.hours = hours;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Метод, який буде перевизначено в нащадку
    public void processRecord() {
        System.out.println("TimeRecord: обробка загального запису часу");
    }

    @Override
    public String toString() {
        return "TimeRecord{id=" + id + ", employee_id=" + employee_id + ", date='" + date + "', hours=" + hours + ", status='" + status + "'}";
    }
}
