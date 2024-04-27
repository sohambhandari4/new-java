/*Define a class Employee(id,name,department,salary).define default and parametrized constuctor also 
overlaod the constructor.Create the inner class manager(bonus ).define the accept and display in both the 
class.create the n object of manager and display the details of manager having maximum 
salary.(sal=sal+bouns*/
import java.util.*;

public class Employees {
    // Employee class
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employees() {
    }

    // Parameterized Constructor
    public Employees(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Inner class Manager
    class Manager {
        private double bonus;

        // Constructor
        public Manager() {
        }

        // Parameterized Constructor
        public Manager(double bonus) {
            this.bonus = bonus;
        }

        // Method to accept manager details
        public void accept() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Manager's bonus: ");
            this.bonus = scanner.nextDouble();
        }

        // Method to display manager details
        public void display() {
            double totalSalary = salary + bonus;
            System.out.println("Manager's Bonus: " + bonus);
            System.out.println("Manager's Total Salary: " + totalSalary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of managers: ");
        int n = scanner.nextInt();

        Employee emp = new Employee();
        Employee.Manager maxSalaryManager = emp.new Manager();

        double maxSalary = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Manager " + (i + 1) + " details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Department: ");
            String department = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, department, salary);

            // Accept bonus for manager
            System.out.println("Enter Manager " + (i + 1) + " bonus: ");
            double bonus = scanner.nextDouble();
            Employee.Manager manager = employee.new Manager(bonus);

            // Check if manager's total salary is greater than current max salary
            if ((salary + bonus) > maxSalary) {
                maxSalary = salary + bonus;
                maxSalaryManager = manager;
            }
        }

        // Display details of manager with maximum salary
        System.out.println("Details of Manager with maximum salary:");
        maxSalaryManager.display();

        scanner.close();
    }
}
