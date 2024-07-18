import java.util.Scanner;
//import java.JAVA_LAB.*;
class Library{
    int n;String[] books;
    Library(){        this.n=0;        this.books = new String[50];    }
    void addBook(String book){
        this.books[n]=book;
        n++;
        System.out.println(book+" : ----------------------- This book has been added..!");
    }
    public void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i] == book){
                System.out.println("----------- "+book+" : ------------------- This book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist...!");
    }
    public void returnBook(String book){
        addBook(book);
    }
    public void showAvailableBooks(){
        System.out.println("There are "+this.n+" books in the Library"+"\nAvailable books are : ");
        for (String book:this.books){
            if ( book == null){continue;}
            System.out.println(" * "+book);
        }
    }
}
public class EX4_Library {
    public static void main(String[] args) {
        System.out.println("-- JAVA LIBRARY --");
        Library central_library = new Library();
        central_library.addBook("Think & Grow Rich");
        central_library.addBook("Power of Habits");
        central_library.addBook("Atomic Habits");
        central_library.addBook("Let us C");
        central_library.addBook("JAVA Programming");
        central_library.addBook("Computer organisation & Architecture");
        System.out.println("---------------------------------------------------------------------------------------");
        central_library.showAvailableBooks();
        central_library.issueBook("Let us C");
        central_library.issueBook("Computer organisation & Architecture");
        central_library.issueBook("Power of Habits");
        System.out.println("---------------------------------------------------------------------------------------");
        central_library.showAvailableBooks();
        central_library.returnBook("Let us C");
        central_library.returnBook("Power of Habits");
        central_library.issueBook("Computer organisation & Architecture");
        System.out.println("---------------------------------------------------------------------------------------");
        central_library.showAvailableBooks();
    }
}
