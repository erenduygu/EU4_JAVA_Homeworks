package repl_it_tasks.from1to50;
import java.util.Scanner;
public class Task044_Blackjack {

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    	    
	    
	    System.out.println("Player: ");
	    int player = s.nextInt();
	    System.out.println("House: ");
	    int house = s.nextInt();

	    
	    if (player>=21&&player>house) {
	    	   System.out.println("bust");
	    }
	    if (house>player) {
	    	   System.out.println("player loss");
	    }
	    if (player==house) {
	    	   System.out.println("its a tie");
	    }
	    if (player>house&&player<21) {
	    	   System.out.println("player wins");
	    }
	    
	}

}
