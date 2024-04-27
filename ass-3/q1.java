import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {}
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        name = scanner.nextLine();
        department = scanner.nextLine();
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {}
    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        bonus = new Scanner(System.in).nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    public double getTotalSalary() {
        return super.getSalary() + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Manager maxTotalSalaryManager = null;
        double maxTotalSalary = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            Manager manager = new Manager();
            manager.accept();
            double totalSalary = manager.getTotalSalary();
            if (totalSalary > maxTotalSalary) {
                maxTotalSalary = totalSalary;
                maxTotalSalaryManager = manager;
            }
        }

        if (maxTotalSalaryManager != null) {
            System.out.println("\nDetails of Manager with Maximum Total Salary:");
            maxTotalSalaryManager.display();
        } else {
            System.out.println("No managers found.");
        }
    }
}
