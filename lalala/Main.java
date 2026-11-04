package model;
public class Main {
    public static void main(String[] args) {
        System.out.println("запуск програми");

        Employee emp = new Employee(1, "вероніка", "дашковська", "Розробник");
        Admin admin = new Admin(2, "вася", "в синем", "Менеджер", "admin_olena", "SuperAdmin");

        System.out.println("\n виклик showInfo");
        emp.showInfo();
        admin.showInfo();

        System.out.println("\nщблік робочого часу");
        WorkDay workDay = new WorkDay(101, 1, "2026-06-05", "", "", 0);
        workDay.startWork();
        workDay.endWork();
        workDay.processRecord();

        TimeRecord record = new TimeRecord(102, 1, "2026-06-05", 8.0, "Approved");
        record.processRecord();

        System.out.println("\npackage-private доступ ");
        emp.department = "security department";
        System.out.println("змінено відділ через package-private поле: " + emp.department);
    }
}