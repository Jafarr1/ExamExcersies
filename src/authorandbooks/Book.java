package authorandbooks;
public class Book {
    private String title;
    private Author author;
    private int numPages;


    public Book(String title, Author author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;

    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;

    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", numPages=" + numPages +
                '}';
    }
}
