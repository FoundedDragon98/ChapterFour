package ChapterFour;

public class Hat
{
    String color;
    int height;
    
    public Hat(String clr, int ht)
    {
        this.color = clr;
        this.height = ht;
    }
    
    public Hat newHat(Hat other) {
        Hat temp = new Hat(other.color, this.height);
        return temp;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String toString() {
        return "The hat's color is: " + this.color;
    }
}
