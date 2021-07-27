package Library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
 BookManagement bookManagement = new BookManagement();
    Scanner scanner = new Scanner(System.in);

    public Menu() throws FileNotFoundException {
    }


    public void menu() throws IOException {
        System.out.println("Welcome to the Library! \n1. See book list   \n2. Borrow book    \n3. Return book   ");
        switch (scanner.nextLine()){
            case "1":
                bookManagement.showBookList();
                break;
            case "2":
                bookManagement.borrowBook();
                break;
            case "3":
                bookManagement.returnBook();
                break;
            case "4":
               //
                break;
            case "5": System.exit(0);
            break;
            default:
                break;
        }
        menu();
    }


}
