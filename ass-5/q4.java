import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        try {
            validateName(name);
            System.out.println("Employee name is valid: " + name);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name is Invalid");
        }
        // Add more validation rules as needed
    }
}
