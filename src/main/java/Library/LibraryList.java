package Library;

import java.io.*;
import java.util.*;

public class LibraryList {

    private static final String libraryBookListFile = "Library_list";
    private static final String borrowedBooks = "Borrow_Books_list";
    // FileReader fileReader = new FileReader(libraryBookListFile);
    Scanner scanner = new Scanner(System.in);
   // public static Map<String, String> books = new HashMap<>();
   public static Properties properties = new Properties();

    public LibraryList() {
    }

    public Properties getBooksFromList() throws IOException {
        properties.load(new FileInputStream(libraryBookListFile));

        for (Map.Entry entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
            System.out.println(properties.size());
            // System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
        }
        return properties;
    }


    public void showBorrowList() throws IOException {



    }


}


