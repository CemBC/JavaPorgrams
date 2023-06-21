package StrinIO;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.nio.file.Path;
import java.lang.IllegalStateException;
import java.nio.file.Files;


public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        Path path = Paths.get("ckor.txt");
        try {
            sc = new Scanner(Paths.get(String.valueOf(path.toAbsolutePath())));
        } catch (IOException ioException) {
            System.err.println("Error opening file.Terminating.");
            System.exit(1);
        }
    }
    public static void readRecords() {
        System.out.println("Score");
        try {
            while(sc.hasNext()) {
                System.out.println(sc.hasNext());
            }
        } catch (NoSuchElementException elementExceptio) {
            System.err.println("File improper");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading");
        }
    }
    public static void closeFile() {
        if(sc != null) {
            sc.close();
        }
    }


}
