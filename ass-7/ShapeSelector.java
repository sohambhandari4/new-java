/*Write Java program to implement a shape selector from a given set of shapes(triangle, circle and 
line) */
import java.util.Scanner;
public class ShapeSelector
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Line");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice)
         {
            case 1:
                System.out.println("You selected: Triangle");
                drawTriangle();
                break;
            case 2:
                System.out.println("You selected: Circle");
                drawCircle();
                break;
            case 3:
                System.out.println("You selected: Line");
                drawLine();
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 3.");
        }
        scanner.close();
    }

    public static void drawTriangle()
     {
        System.out.println("Drawing a triangle...");
    }
    public static void drawCircle()
     {
        System.out.println("Drawing a circle...");
    }
    public static void drawLine() 
    {
        System.out.println("Drawing a line...");
    }
}

