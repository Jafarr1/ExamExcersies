package authorandbooks;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private char gender;
    private String email;
    private List<Book> books;

    public Author(String name, char gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.books = new ArrayList<>();


    }

    public String getName() {
        return name;

    }


    public void setEmail() {
        this.email = email;
    }


    public char getGender() {
        return gender;
    }


    public void addBook(Book book) {
        books.add(book);

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}