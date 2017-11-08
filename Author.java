package ChapterFour;

public class Author
{
    private String name;
    private int age;
    
    public Author(String nm, int num) {
        this.name = nm;
        this.age = num;
    }
    
    public String toString() {
        return "The author's name is " + this.name + " and their age is " + this.age;
    }
}
