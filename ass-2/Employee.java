/*. Write a java program which define class Employee with data member as name and salary.program store the 
information of 5 Employees.display the name who earn maximum salary.(Use arrary of object)*/
import java.util.Scanner;

public class Employee
 {
    private String name;
    private double salary;

    public Employee(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
     {
        return name;
    }

    public double getSalary() 
    {
        return salary;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        // Input employee details
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            employees[i] = new Employee(name, salary);
        }

        // Find employee with maximum salary
        double maxSalary = employees[0].getSalary();
        String maxSalaryEmployee = employees[0].getName();
        for (int i = 1; i < employees.length; i++)
         {
            if (employees[i].getSalary() > maxSalary) 
            {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i].getName();
            }
        }

        System.out.println("Employee with maximum salary: " + maxSalaryEmployee);
        scanner.close();
    }
}

