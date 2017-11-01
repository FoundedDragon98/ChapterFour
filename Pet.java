package ChapterFour;


/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private String name;
    private int age;
    public static int numPets;
    
    public Pet(int num, String nm)
    {
        this.name = nm;
        this.age = num;
        numPets++;
    }
    
    public static void example() {
        System.out.println("This is static!");
    }
    
    public Pet newPet(Pet other) {
        Pet temp = new Pet(other.age, this.name);
        return temp;
    }
    
    public void setAge(int num) {
        this.age = num;
    }
    
    public String toString() {
        return "The pet's name is: " + this.name;
    }
}
