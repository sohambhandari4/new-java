/*Define a class MyNumber having one private int data member. Write a default constructor to 
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods isNegative, 
isPositive, isZero, isOdd, isEven. Create an object in main. Use command line arguments to pass a 
value to the object (Hint : convert string argument to integer) and perform the above tests. Provide 
javadoc comments for all constructors and methods and generate the html help file. */
import java.util.Arrays;
public class MyNumber
 {
    private int number;
    public MyNumber() 
    {
        this.number = 0;
    }
    public MyNumber(int value)
     {
        this.number = value;
    }

    public boolean isNegative()
     {
        return number < 0;
    }
    public boolean isPositive()
     {
        return number > 0;
    }
    public boolean isZero()
     {
        return number == 0;
    }
    public boolean isOdd() 
    {
        return number % 2 != 0;
    }
    public boolean isEven()
     {
        return number % 2 == 0;
    }

    public static void main(String[] args) 
    {
        if (args.length > 0)
         {
            int value = Integer.parseInt(args[0]);
            MyNumber myNumber = new MyNumber(value);
            // Perform tests
            System.out.println("Is negative? " + myNumber.isNegative());
            System.out.println("Is positive? " + myNumber.isPositive());
            System.out.println("Is zero? " + myNumber.isZero());
            System.out.println("Is odd? " + myNumber.isOdd());
            System.out.println("Is even? " + myNumber.isEven());
        } 
        else 
        {
            System.out.println("No command line arguments provided.");
        }
    }
}
