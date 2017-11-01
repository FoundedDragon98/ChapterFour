package ChapterFour;


/**
 * Write a description of class PetDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetDriver
{
    public static void main(String[] args) {
        Pet spot = new Pet(6, "Spot");
        System.out.println(spot);
        spot.setAge(16);
        
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
        Pet sam = new Pet(9, "Sam");
        System.out.println("Number of pets: " + Pet.numPets);
    }
}
