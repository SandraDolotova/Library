package Library;

import java.io.*;
import java.util.*;

public class LibraryList {

    private static final String libraryBookListFile = "Library_list";
    // FileReader fileReader = new FileReader(libraryBookListFile);
    // Scanner scanner = new Scanner(fileReader);
    Map<String, String> books = new HashMap<>();

    public LibraryList() throws FileNotFoundException {
    }

    public Map<String, String> getBooksFromList() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(libraryBookListFile));

        for (Map.Entry entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
            // System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
        }
        return books;
    }

    


}


