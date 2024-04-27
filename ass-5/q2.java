import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        try {
            MyDate date = new MyDate(day, month, year);
            date.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }

    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            throw new InvalidDateException("Invalid Date");
        }

        // Check for months with less than 31 days
        if ((day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
                (day == 30 && month == 2) ||
                (day == 29 && month == 2 && !isLeapYear(year))) {
            throw new InvalidDateException("Invalid Date");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
