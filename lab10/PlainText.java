import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PlainText extends Text {
    public PlainText(String text) {
        super(text);
    }

    public int countLetterFrequency(char letter) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }

    public String extractEmail() {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }

        return null;
    }
	
	public void reverseText() {
        StringBuilder reversed = new StringBuilder(text);
        System.out.println(reversed.reverse());
    }
	
	


	

}
