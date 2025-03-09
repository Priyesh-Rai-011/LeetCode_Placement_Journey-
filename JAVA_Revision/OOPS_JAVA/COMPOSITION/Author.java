package OOPS_JAVA.COMPOSITION;

import java.util.ArrayList;
import java.util.List;

// Author class (HAS-A relationship inside Book)
class Author2 {
    private String name, nationality;

    public Author2(String name, String nationality) {
        this.name = name; this.nationality = nationality;
    }

    public String getDetails() {
        return name + " (" + nationality + ")";
    }
}

// Book class (HAS-A relationship with Author)
class Book {
    private String title;  private Author2 author; // Composition: Book HAS-A Author

    public Book(String title, Author2 author) {
        this.title = title;  this.author = author;
    }
    public void displayBookDetails() {
        System.out.println("Book: " + title + " | Author: " + author.getDetails());
    }
}

// Library class (HAS-A relationship with a list of Books)
class Library {
    private List<Book> books; // Composition: Library HAS-A List of Books

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("Library Collection:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
    
// Main class to test composition
public class Author {
        public static void main(String[] args) {
        // Creating authors
        Author2 author1 = new Author2("J.K. Rowling", "British");
        Author2 author2 = new Author2("George Orwell", "British");

        // Creating books with authors
        Book book1 = new Book("Harry Potter", author1);
        Book book2 = new Book("1984", author2);

        // Creating library and adding books
        Library myLibrary = new Library();
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Displaying library books
        myLibrary.showLibraryBooks();
    }
}
