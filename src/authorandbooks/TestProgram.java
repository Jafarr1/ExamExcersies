package authorandbooks;
import authorandbooks.Author;
import authorandbooks.Book;

public class TestProgram {
    public static void main(String[] args) {
        new TestProgram().run();

    }

    private void run() {
        Author author1 = new Author("John", 'M', "jc@hej.dk");

        Author author2 = new Author("Emmi", 'F', "hello.dk");

        Book book1 = new Book("The centipede", author1, 200);
        System.out.println("Book author1:" + book1.getAuthor());
        System.out.print("Book title:" + book1.getTitle());
        System.out.println("Book numPages:" + book1.getNumPages());

        System.out.println("");

        Book book2 = new Book("Fishy Fish", author2, 350);
        System.out.println("Book author2:" + book2.getAuthor());
        System.out.print("Book title:" + book2.getTitle());
        System.out.print("Book numPages:" + book2.getNumPages());

        author1.addBook(book1);
        author1.addBook(book2);

        System.out.println(author1);
        System.out.println(author1.getBooks());







    }
}