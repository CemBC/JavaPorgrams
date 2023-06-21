import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLText extends Text {
    public HTMLText(String text) {
        super(text);
    }

  
    public String extractEmail() {
    Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    Matcher matcher = pattern.matcher(text);

    if (matcher.find()) {
        return matcher.group();
    }

    return null;
}

 
    public int countLetterFrequency(char letter) {
        int count = 0;
        boolean flag = false;
        for (char c : text.toCharArray()) {
            if (c == '<') {
                flag = true;
            } else if (c == '>') {
                flag = false;
            } else if (!flag && Character.toLowerCase(c) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }


    public void reverseText() {
        StringBuilder reversed = new StringBuilder();
        boolean flag = false;
        for (int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);
            if (c == '<') {
                flag = true;
                reversed.append(c);
            } else if (c == '>') {
                flag = false;
                reversed.append(c);
            } else if (!flag) {
                reversed.append(c);
            }
        }
        System.out.println(reversed);
    }
}