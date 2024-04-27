import java.util.Scanner;

class VowelException extends Exception {
    public VowelException(String message) {
        super(message);
    }
}

class BlankException extends Exception {
    public BlankException(String message) {
        super(message);
    }
}

class ExitException extends Exception {
    public ExitException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        try {
            checkCharacter(ch);
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        } catch (BlankException e) {
            System.out.println(e.getMessage());
        } catch (ExitException e) {
            System.out.println(e.getMessage());
            System.exit(0); // Terminate program
        } catch (Exception e) {
            System.out.println("Valid Character");
        }
    }

    public static void checkCharacter(char ch) throws VowelException, BlankException, ExitException {
        if (ch == ' ') {
            throw new BlankException("BlankException: Character is blank");
        } else if (ch == 'X') {
            throw new ExitException("ExitException: Character is 'X'");
        } else if (isVowel(ch)) {
            throw new VowelException("VowelException: Character is a vowel");
        } else {
            System.out.println("Valid Character");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
