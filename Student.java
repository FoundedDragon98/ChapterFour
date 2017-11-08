package ChapterFour;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private double testScore1;
    private double testScore2;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Input two test scores");
        testScore1 = scan.nextDouble();
        testScore2 = scan.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public String getAverage()
    {
        return "The average test score is: " + ((this.testScore1+this.testScore2)*0.5);
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public String getName()
    {
        return "The name is: " + this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    public void printName()
    {
        System.out.println(this.name);
    }
}