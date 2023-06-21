 public abstract class Text {
    protected String text;

    public Text(String text) {
        this.text = text;
    }

    public abstract String extractEmail();
    public abstract int countLetterFrequency(char letter);
    public abstract void reverseText();
}