package ChapterFour;

public class Library
{
    private String libName;
    private Book[] books;
    
    public Library(String libnm, int number) {
        this.libName = libnm;
        this.books = new Book[number];
    }
    
    public String toString() {
        String output = "This library has \n";
        for(Book b: books) {
            output += b + "\n";
        }
        
        return output;
    }
    
    public void addBook(Book b, int number) {
        books[number] = b;
    }
}
