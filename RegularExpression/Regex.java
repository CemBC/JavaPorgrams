package RegularExpression;
import java.sql.SQLSyntaxErrorException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        String pattern = "[abc]def";   //adef   bdef   cdef
        System.out.println("adef".matches(pattern)); //true
        System.out.println("bdef".matches(pattern));  //true
        System.out.println("cdef".matches(pattern)); //true
        System.out.println("sdef".matches(pattern)); //false
        System.out.println("ddef".matches(pattern)); //false

        System.out.println("----------------------------------------");

        Pattern pattern1 = Pattern.compile("[^abc]def");  //adef bdef ya da cdef olursa false verir ancad ddef fdef gdef de true verir

        Matcher matcher = pattern1.matcher("adef");  //false
        Matcher matcher1 = pattern1.matcher("cdef"); //false
        Matcher matcher2 = pattern1.matcher("gdef"); //true
        Matcher matcher3 = pattern1.matcher("fdef"); //true

        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());

        System.out.println("----------------------------------------");

        System.out.println(Pattern.matches("[0-9]","2"));
        System.out.println(Pattern.matches("[0-9]","22"));
        System.out.println(Pattern.matches("[0-9]","a"));

        System.out.println("----------------------------------------");

        String regex = "evet|hayır|çıkış";
        System.out.println("evet".matches(regex));
        System.out.println("hayır".matches(regex));
        System.out.println("asdasdasd".matches(regex));

        String regex1 = "Hi (John|Jane)";
        System.out.println("Hi John".matches(regex1));
        System.out.println("Hi Jane".matches(regex1));
    }

    //The dot character "." in a regular expression matches any single character except a newline character.
    //Quantifiers , yinelenen kalıpları tanımlamak için kullanılır. “\\d {5,7}” herhangi bir beş ila yedi basamaklı sayıyla eşleşir.

    /*
        ? = Matches zero or one occurrences of the pattern  [0,1]
        * = Matches zero or more occurrences of the pattern [0,infinite)
        + = Matches one or more occurrences of the pattern  [1,infinite)
        {n}   = exactly n times
        {n,}  = at least n times
        {n,m} = at least n , no more than m
     */


    /* Example
       matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");          123-456-7890

       Unutma = ilk slash(\) ikinci slashı stringe ekleyebilmek içindir. Normal bir String de ters slash excape character olduğu için iki \\d{n} patternini
                kullanırsın


       How to match a parenthesis?
            Use “\\(|”
                First slash is used to insert a slash in the string; and having a slash before
                the parenthesis prevents it from being interpreted as a special char for regex.
     */


    // https://www.youtube.com/watch?v=LoxLZH-5PAQ
}
