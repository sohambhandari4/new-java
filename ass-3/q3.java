import java.util.Scanner;

abstract class Staff {
    String name, address;
    public Staff(String name, String address) { this.name = name; this.address = address; }
    abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double salary;
    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address); this.department = department; this.salary = salary;
    }
    @Override void display() { System.out.println("Full Time Staff Details: " + name + ", " + address + ", " + department + ", " + salary); }
}

class PartTimeStaff extends Staff {
    int hours; double rate;
    public PartTimeStaff(String name, String address, int hours, double rate) {
        super(name, address); this.hours = hours; this.rate = rate;
    }
    @Override void display() { System.out.println("Part Time Staff Details: " + name + ", " + address + ", " + hours + ", " + rate); }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of staff: ");
        int n = scanner.nextInt();
        Staff[] staffs = new Staff[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter 1 for FullTimeStaff or 2 for PartTimeStaff: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter department: ");
                String department = scanner.nextLine();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                staffs[i] = new FullTimeStaff(name, address, department, salary);
            } else if (choice == 2) {
                System.out.print("Enter hours: ");
                int hours = scanner.nextInt();
                System.out.print("Enter rate per hour: ");
                double rate = scanner.nextDouble();
                staffs[i] = new PartTimeStaff(name, address, hours, rate);
            }
        }
        for (Staff staff : staffs) { staff.display(); }
    }
}
