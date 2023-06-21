package counter;

public class WordCount {
    private String word;
    private int counter;

    public WordCount(String w) {

        word = w;
        counter = 1;
    }

    public String getWord() { return word; }
    public int getCounter() { return counter; }

    public void incrementCounter() { counter++; }
}
