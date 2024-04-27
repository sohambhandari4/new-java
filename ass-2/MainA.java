/*Write a Java program to create a Package ―SY‖ which has a class SYMarks (members – ComputerTotal, 
MathsTotal, and ElectronicsTotal). Create another package TY which has a class TYMarks (members –
Theory, Practicals). Create n objects of Student class (having rollNumber, name, SYMarks and TYMarks). 
Add the marks of SY and TY computer subjects and calculate the Grade (‗A‘ for >= 70, ‗B‘ for >= 60 ‗C‘ for 
>= 50 , Pass Class for > =40 else ‗FAIL‘) and display the result of the student in proper format. */


public class MainA
{
    public static void main(String[] args) {
        // Creating SYMarks objects
        SYMarks syMarks1 = new SYMarks(80, 75, 85);
        SYMarks syMarks2 = new SYMarks(70, 65, 75);

        // Creating TYMarks objects
        TYMarks tyMarks1 = new TYMarks(85, 90);
        TYMarks tyMarks2 = new TYMarks(75, 80);

        // Creating Student objects
        Student student1 = new Student(1, "John", syMarks1, tyMarks1);
        Student student2 = new Student(2, "Alice", syMarks2, tyMarks2);

        // Calculating the grades
        calculateGrade(student1);
        calculateGrade(student2);

        // Displaying results
        displayResult(student1);
        displayResult(student2);
    }

    public static void calculateGrade(Student student) {
        SYMarks syMarks = student.getSyMarks();
        TYMarks tyMarks = student.getTyMarks();

        int computerTotal = syMarks.getComputerTotal() + tyMarks.getPracticals();
        String grade;
        if (computerTotal >= 70) {
            grade = "A";
        } else if (computerTotal >= 60) {
            grade = "B";
        } else if (computerTotal >= 50) {
            grade = "C";
        } else if (computerTotal >= 40) {
            grade = "Pass Class";
        } else {
            grade = "FAIL";
        }
        student.setGrade(grade);
    }

    public static void displayResult(Student student) {
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println();
    }
}

class Student {
    private int rollNumber;
    private String name;
    private SYMarks syMarks;
    private TYMarks tyMarks;
    private String grade;

    public Student(int rollNumber, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    // Getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SYMarks getSyMarks() {
        return syMarks;
    }

    public void setSyMarks(SYMarks syMarks) {
        this.syMarks = syMarks;
    }

    public TYMarks getTyMarks() {
        return tyMarks;
    }

    public void setTyMarks(TYMarks tyMarks) {
        this.tyMarks = tyMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class SYMarks {
    private int computerTotal;
    private int mathsTotal;
    private int electronicsTotal;

    public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicsTotal = electronicsTotal;
    }

    // Getters and setters
    public int getComputerTotal() {
        return computerTotal;
    }

    public void setComputerTotal(int computerTotal) {
        this.computerTotal = computerTotal;
    }

    public int getMathsTotal() {
        return mathsTotal;
    }

    public void setMathsTotal(int mathsTotal) {
        this.mathsTotal = mathsTotal;
    }

    public int getElectronicsTotal() {
        return electronicsTotal;
    }

    public void setElectronicsTotal(int electronicsTotal) {
        this.electronicsTotal = electronicsTotal;
    }
}

class TYMarks {
    private int theory;
    private int practicals;

    public TYMarks(int theory, int practicals) {
        this.theory = theory;
        this.practicals = practicals;
    }

    // Getters and setters
    public int getTheory() {
        return theory;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }

    public int getPracticals() {
        return practicals;
    }

    public void setPracticals(int practicals) {
        this.practicals = practicals;
    }
}
