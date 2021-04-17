package repl_it_tasks.from50to100;
import java.util.Scanner;

public class Task050_BurgerOrChicken {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	     String in = s.next();
	     
	     if (in.equals("chicken")||in.equals("burger")) {
	    	 System.out.println("10.0");
	     }else  if (in.equals("soda")){
	    	 System.out.println("2.0");
	     }
	     
	     
	}

}
