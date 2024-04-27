/*Define a Student class (roll number, name, percentage). Define a default and parameterized constructor. 
Keep a count of objects created. Create objects using parameterized constructor and display the object count 
after each object is created. (Use static member and method). Also display the contents of each object. */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 85.5);
        s1.display();

        Student s2 = new Student(102, "Alice", 78.9);
        s2.display();

        Student s3 = new Student();
        s3.display();

        System.out.println("Total number of objects created: " + Student.getCount());
    }
}

class Student {
    private int rollNumber;
    private String name;
    private double percentage;
    private static int count = 0;

    // Default constructor
    public Student() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    // Parameterized constructor
    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
        count++;
        System.out.println("Object created. Count: " + count);
    }

    // Static method to get count of objects
    public static int getCount() {
        return count;
    }

    // Method to display object contents
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }
}

