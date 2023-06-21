package counter;

public class GrowingArray {
    private int size;
    private WordCount[] words;

    public GrowingArray() {

        words = new WordCount[10];

        size = 0;
    }

    public void addWord(String w) {

        if(words.length == size) {

            WordCount[] old = words;
            words = new WordCount[size * 2];

            System.arraycopy(old, 0, words, 0, size);
        }


        boolean exists = false;
        for(WordCount word : words) {

            if(word != null && word.getWord().compareToIgnoreCase(w) == 0) {

                word.incrementCounter();
                exists = true;
                break;
            }
        }
        if(!exists) {
            words[size++] = new WordCount(w);
        }

    }

    public void printList() {
        for(WordCount word : words) {
            if(word != null) {
                System.out.println(word.getWord() + ": " + word.getCounter());
            }
        }
    }
}
