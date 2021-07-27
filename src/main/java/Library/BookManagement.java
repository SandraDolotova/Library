package Library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BookManagement {

    //  Book book = new Book();
    LibraryList libraryList = new LibraryList();
    Scanner scanner = new Scanner(System.in);
    Map<String, String> books = new HashMap<>();

    public BookManagement() throws FileNotFoundException {
    }

    public void showBookList() throws IOException {
        System.out.println("Book id \t Book title \t Book author ");
        libraryList.getBooksFromList();
    }

    public void borrowBook() {
        System.out.println("To borrow book, enter book id number: ");
        String id = scanner.nextLine();
        books.remove(id);
    }

    public void returnBook() {
        System.out.println("To return the book, Please enter id number: ");
        int id = scanner.nextInt();
    }


    private void syncLibrary() throws IOException {
        this.books = libraryList.getBooksFromList();
        //get contacts
        //this.contact = contact from file
    }

}


// int id = 1;
//for (Book book : this.books){
//   System.out.println("\t " + book.getBookTitle() + " " + book.getAuthor());
//   id++;