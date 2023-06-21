import java.util.*;
public class Test {
    public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        Activity eat = new Eat();
        Activity rest = new Rest();
        Activity study = new Study();
		/*eat.completed();
		eat.display();
		System.out.println("-----------------");
		rest.completed();
		rest.display();
		System.out.println("-----------------");
		study.completed();
		study.display();
		*/
		while(true) {
			eat.display();
			System.out.println("1.Rest \n2.Study \n3.Eat");
			int ch = 0;
			while(true) {
				try{
					ch = inp.nextInt();
					break;
				}catch(Exception e ) {
					System.out.println("Enter a number");
					inp.nextLine();
				}
			}
			switch(ch) {
				case 1:
					rest.completed();
					break;
				case 2:
					study.completed();
					break;
				case 3:
					eat.completed();
					break;
			}
			if(eat.check()){
				break;
			}
		}
		System.out.println("Final Values");
		eat.display();
		
    }
}