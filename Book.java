package ChapterFour;

public class Book
{
    private Author bookAuthor;
    private String title;
    public Book(Author auth, String bknm) {
        this.bookAuthor = auth;
        this.title = bknm;
    }
    
    public String toString() {
        return "The book is written by " + this.bookAuthor + " and is titled " + this.title;
    }
}
