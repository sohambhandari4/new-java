/*Define class student(rno,name,marks1,marks2) .Define result class(total,percentage) inside the student 
class.accept the student details and display the Marksheet with 
Rno,name,marks1,Marks2,toatl,percentage.(use inner class concept.*/
// Define the Student class
import java.util.*;
public class Student
 {
    private int rno;
    private String name;
    private int marks1;
    private int marks2;

    public Student(int rno, String name, int marks1, int marks2)
     {
        this.rno = rno;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
    public static void main(String[] args) 
    {
        Student student = new Student(101, "soham", 85, 90);
        Student.Result result = student.new Result();
        result.displayMarksheet();
    }

    public class Result 
    {
        private int total;
        private double percentage;

        public Result() 
        {
            total = marks1 + marks2;
            percentage = (total * 100.0) / 200.0;
        }

        public void displayMarksheet() 
        {
            System.out.println("student marksheet ");
            System.out.println("Roll Number: " + rno);
            System.out.println("Name: " + name);
            System.out.println("Marks 1: " + marks1);
            System.out.println("Marks 2: " + marks2);
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage + "%");
        }
    }
 }

