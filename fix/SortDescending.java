//Write a java program which accepts an integer arrary and print the data and sort the data in descending order
import java.util.Arrays;
import java.util.Scanner;
public class SortDescending 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < length; i++)
         array[i] = scanner.nextInt();

        Arrays.sort(array);
        for (int i = 0; i < length / 2; i++) 
        {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
        scanner.close();
    }
}

