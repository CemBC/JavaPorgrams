public class Main {
    public static void main(String[] args) {
        String plainText = "Welcome to the SE 116 course. The e-mail address of the course is the following: Se116Spring2023@ieu.edu.tr";
        PlainText plain = new PlainText(plainText);
        System.out.println("Plain Text:");
        System.out.println("Extracted email: " + plain.extractEmail());
        System.out.println("Frequency of 'e': " + plain.countLetterFrequency('e'));
        System.out.print("Reversed text: ");
        plain.reverseText();
        System.out.println();

        String htmlText = "<html><head><title>Welcome to the SE 116 course.</title></head><body><p> The e-mail address of the course is the following: Se116Spring2023@ieu.edu.tr</p> </body> </html>";
        HTMLText html = new HTMLText(htmlText);
        System.out.println("HTML Text:");
        System.out.println("Extracted email: " + html.extractEmail());
        System.out.println("Frequency of 'e': " + html.countLetterFrequency('e'));
        System.out.print("Reversed text: ");
        html.reverseText();
    }
}