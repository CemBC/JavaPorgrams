package counter;
import java.util.Scanner;
import java.nio.file.Paths;
public class WordProgram {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please enter a path to run the program");
            return;
        }
        Scanner reader = null;
        // we will store the words in the growing array
        GrowingArray g = new GrowingArray();
        for(String p : args) {
            // for each file passed as an argument...
            reader = null;
            try {
                reader = new Scanner(Paths.get(p));
                System.out.println("Working on file: " + p);
                while(reader.hasNextLine()) {
                    String[] list = reader.nextLine().split(" ");
                    for(String word : list) {
                        g.addWord(word);
                    }
                }
                System.out.println("DONE!");
                System.out.println("-------------------");
            } catch(Exception e) {
                System.out.println("Could not read file: " + p);
            } finally {
                if(reader != null) reader.close();
            }
        }
        g.printList();
    }
}
