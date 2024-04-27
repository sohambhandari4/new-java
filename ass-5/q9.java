class IllegalNumberOfArgumentException extends Exception {
    public IllegalNumberOfArgumentException(String message) {
        super(message);
    }
}

class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}

class NegativeResultException extends Exception {
    public NegativeResultException(String message) {
        super(message);
    }
}

public class Calculator {
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new IllegalNumberOfArgumentException("Illegal number of arguments");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            char operator = args[2].charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                throw new InvalidOperatorException("Invalid operator");
            }

            int result = performOperation(num1, num2, operator);

            if (result < 0) {
                throw new NegativeResultException("Negative result");
            }

            System.out.println("Result: " + result);
        } catch (IllegalNumberOfArgumentException | InvalidOperatorException | NegativeResultException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public static int performOperation(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
        }
        return result;
    }
}
