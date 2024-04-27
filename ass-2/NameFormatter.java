/*Writa a java program that take input as aperson name in the format of first middle last name and then print it 
in the form last first and middle,where in the middle name first character is capital letter.*/
import java.util.Scanner;

public class NameFormatter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name (First Middle Last): ");
        String fullName = scanner.nextLine();
        scanner.close();

        String[] names = fullName.split(" ");
        if (names.length == 3) 
        {
            String firstName = names[0];
            String middleName = names[1];
            String lastName = names[2];

            // Capitalizing the first character of the middle name
            char firstCharOfMiddleName = Character.toUpperCase(middleName.charAt(0));

            // Printing the name in the desired format
            System.out.println("Formatted name: " + lastName + " " + firstName + " " + firstCharOfMiddleName + middleName.substring(1));
        } 
        else
         {
            System.out.println("Invalid input! Please enter the full name in the format (First Middle Last).");
        }
    }
}
