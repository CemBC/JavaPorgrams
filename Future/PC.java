package Future;
import java.util.Scanner;
public class PC {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.println("************\n"+
	    " 1 = Higher\n"+
	    "-1 = Lower\n"+
	    " O = That's it!\n"+
	    "************\n");
	    System.out.print("Enter the size = ");
	    int size = inp.nextInt();
	    int top = size;
	    int bot = 1;
	    int self = size/2;
	    System.out.print("Is it " + self + " ? = ");
	    int ans = inp.nextInt();
	    while(true) {
	        if (ans == 1) {
	            bot = self;
	            self = (top+bot)/2;
	            System.out.print("Is it " + self + " ? = ");
	            ans = inp.nextInt();
	            
	            
	        }else if(ans == -1){
	            top = self;
	            self = (top+bot)/2;
	            System.out.print("Is it " + self + " ? = ");
	            ans = inp.nextInt();
	            
	            
	            
	        }else{
	            System.out.println("I have found the number!");
	            break;
	        
	        
	        
	        }

	}
}
}