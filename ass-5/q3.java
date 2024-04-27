import java.util.Scanner;

class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(username, password);
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validatePassword(String username, String password) throws IncorrectPasswordException {
        if (!username.equals(password)) {
            throw new IncorrectPasswordException("Incorrect password!");
        }
    }
}
