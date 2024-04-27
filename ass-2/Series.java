/*Create a package named Series having three different classes to print series:
a. Prime numbers b. Fibonacci series c. Squares of numbers Write a program to generate ‗n‘ terms 
of the above series.*/
import java.util.Scanner;

public class Series {
    public static void generatePrimeNumbers(int n) {
        int count = 0;
        int num = 2;
        System.out.println("Prime numbers:");
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static void generateFibonacciSeries(int n) {
        int n1 = 0, n2 = 1;
        System.out.println("Fibonacci series:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }

    public static void generateSquaresOfNumbers(int n) {
        System.out.println("Squares of numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        generatePrimeNumbers(n);
        generateFibonacciSeries(n);
        generateSquaresOfNumbers(n);

        scanner.close();
    }
}



