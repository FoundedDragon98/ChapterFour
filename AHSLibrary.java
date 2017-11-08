package ChapterFour;

public class AHSLibrary
{
    public static void main(String[] args) {
       Library ahs = new Library("Acalanes", 10);
       Author a = new Author("J.K. Rowling", 52);
       Book book1 = new Book(a, "Harry Potter and the Sorcerer's Stone");
       Book book2 = new Book(a, "Harry Potter and the Chamber of Secrets");
       Book book3 = new Book(a, "Harry Potter and the Prisoner of Azkaban");
       Book book4 = new Book(a, "Harry Potter and the Goblet of Fire");
       Book book5 = new Book(a, "Harry Potter and the Order of the Phoenix");
       Book book6 = new Book(a, "Harry Potter and the Half-Blood Prince");
       Book book7 = new Book(a, "Harry Potter and the Deathly Hallows");
       ahs.addBook(book1, 0);
       ahs.addBook(book2, 1);
       ahs.addBook(book3, 2);
       ahs.addBook(book4, 3);
       ahs.addBook(book5, 4);
       ahs.addBook(book6, 5);
       ahs.addBook(book7, 6);
       ahs.addBook(book3, 7);
       ahs.addBook(book5, 8);
       ahs.addBook(book7, 9);
       System.out.println(ahs);
    }
}
