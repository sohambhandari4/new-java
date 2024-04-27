import java.util.Scanner;

class Vehicle {
    String company;
    double price;
    public Vehicle(String company, double price) { this.company = company; this.price = price; }
    void display() { System.out.println("Company: " + company + ", Price: " + price); }
}

class LightMotorVehicle extends Vehicle {
    double mileage;
    public LightMotorVehicle(String company, double price, double mileage) { super(company, price); this.mileage = mileage; }
    @Override void display() { super.display(); System.out.println("Mileage: " + mileage); }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;
    public HeavyMotorVehicle(String company, double price, double capacityInTons) { super(company, price); this.capacityInTons = capacityInTons; }
    @Override void display() { super.display(); System.out.println("Capacity in tons: " + capacityInTons); }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter 1 for Light Motor Vehicle or 2 for Heavy Motor Vehicle: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter company: ");
            String company = scanner.nextLine();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            if (choice == 1) {
                System.out.print("Enter mileage: ");
                double mileage = scanner.nextDouble();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (choice == 2) {
                System.out.print("Enter capacity in tons: ");
                double capacityInTons = scanner.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacityInTons);
            }
        }
        for (Vehicle vehicle : vehicles) { vehicle.display(); }
    }
}
