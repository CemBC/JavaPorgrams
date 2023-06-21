package A;

public class arg {
    public static void main(String [] args) {
        if(args.length == 0) {
            return;
        }
        int count = 0;
        for(String p : args) {
            String[] splitted = p.split("");
            String a = "a";
            for(String c : splitted) {
                if(a.equals(c)) {
                    count += 1;
                }
            }
        }
     }

}
