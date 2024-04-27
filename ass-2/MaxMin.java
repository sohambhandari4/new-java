//1.Write a java program which accepts 3int values and prints the maximum and minimum
import java.util.Scanner;
public class MaxMin 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Accept three integer values from the user
        System.out.println("Enter three integer values:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the maximum value
        int max = num1;
        if (num2 > max)
         {
            max = num2;
        }
        if (num3 > max)
         {
            max = num3;
        }

        // Find the minimum value
        int min = num1;
        if (num2 < min) 
        {
            min = num2;
        }
        if (num3 < min) 
        {
            min = num3;
        }

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }
}
