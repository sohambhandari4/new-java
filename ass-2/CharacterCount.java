//Write a java program which accepts a string and a characters to be search from the user the program should 
//display the totalno of character in string.
import java.util.Scanner;

public class CharacterCount
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++)
         {
            if (str.charAt(i) == searchChar) 
            {
                count++;
            }
        }
        System.out.println("Total number of characters in the string: " + str.length());
        System.out.println("Total occurrences of '" + searchChar + "' in the string: " + count);

        scanner.close();
    }
}
