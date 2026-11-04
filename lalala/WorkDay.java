package model;
public class WorkDay extends TimeRecord {
    protected String start_time;
    protected String end_time;
    protected double hours_worked;

    public WorkDay(int id, int employee_id, String date, String start_time, String end_time, double hours_worked) {
        super(id, employee_id, date, hours_worked, "Active");
        this.start_time = start_time;
        this.end_time = end_time;
        this.hours_worked = hours_worked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    public void startWork() {
        start_time = "08:00";
        System.out.println("Робочий день почався: " + start_time);
    }

    public void endWork() {
        end_time = "20:00";
        calculateHours();
        System.out.println("pобочий день завершено: " + end_time);
    }

    public void calculateHours() {
        hours_worked = 8.0;
    }

    @Override
    public void processRecord() {
        System.out.println("WorkDay.processRecord: обробка робочого дня за дату " + date);
    }

    @Override
    public String toString() {
        return "WorkDay{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", date='" + date + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", hours_worked=" + hours_worked +
                '}';
    }
}
