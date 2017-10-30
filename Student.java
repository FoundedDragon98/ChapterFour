
public class Student
{
    private String name;
    private int idNumber;
    private Student bestFriend;
    
    public Student()
    {
        
    }
    
    public Student(int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public int combineIDNumbers() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public Student newStudent(Student other) {
        Student temp = new Student(other.idNumber, this.name);
        return temp;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public String toString() {
        return "The student's name is: " + this.name;
    }
}
