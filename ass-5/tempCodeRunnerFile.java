class AgeNotWithinTheRangeException extends Exception {
    public AgeNotWithinTheRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinTheRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinTheRangeException("Age Not Within The Range");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name not valid");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John", 20, "Engineering");
            student1.display();
        } catch (AgeNotWithinTheRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
