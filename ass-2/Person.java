/*Define a class person(pid,pname,age,gender). Define the default and parametrized constructor.Overlaod the 
constructor.Accept the 5 person details and display it.(use this keyword.)*/
import java.util.Scanner;

public class Person {
    private int pid;
    private String pname;
    private int age;
    private String gender;

    // Default constructor
    public Person() {
        pid = 0;
        pname = "";
        age = 0;
        gender = "";
    }

    // Parameterized constructor
    public Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person ID: " + pid);
        System.out.println("Person Name: " + pname);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[5];

        // Accept details of 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String pname = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            persons[i] = new Person(pid, pname, age, gender);
        }

        scanner.close();

        // Display details of all persons
        System.out.println("\nDetails of all persons:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nDetails of Person " + (i + 1) + ":");
            persons[i].displayDetails();
        }
    }
}

