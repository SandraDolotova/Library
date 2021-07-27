package Library;
import java.io.*;
import java.util.*;

public class BookManagement extends LibraryList {

    private static final String libraryBookListFile = "Library_list";
    private static final String borrowedBooks = "Borrow_Books_list";
    LibraryList libraryList = new LibraryList();
    Scanner scanner = new Scanner(System.in);
   // public static Map<String, String> books = new HashMap<>(Collections.emptyMap());
   public static Map<String, String> books = new HashMap<>();



    public BookManagement() throws IOException {
    }

    public void showBookList() throws IOException {
        System.out.println("Book id \t Book title \t Book author ");
        libraryList.getBooksFromList();
    }

    public void borrowBook() throws IOException {
        System.out.println("To borrow book, enter book id number: ");
        System.out.println(properties.size());
        int id = Integer.parseInt(scanner.next());
        properties.getProperty(String.valueOf(id));
        System.out.println("You have chosen id: " +  properties.getProperty(String.valueOf(id)));
    }

    public void returnBook() {
        System.out.println("To return the book, Please enter id number: ");
        int id = scanner.nextInt();

    }


    private void syncLibrary() throws IOException {
        //get contacts
        //this.contact = contact from file
    }

}
