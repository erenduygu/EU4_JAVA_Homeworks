package repl_it_tasks.from50to100;
import java.util.Scanner;
public class Task059_FindAUser {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);

		    String user1="Max Payne";
		    String user2="Alan Wake";

		    System.out.println("Enter full name:");
		    String fullName= scan.nextLine();

		      if (fullName.equalsIgnoreCase(user1) || fullName.equalsIgnoreCase(user2)){
		            System.out.println ("User found!");
		      } else {System.out.println ("User not found!");
		        
		        }


	}

}
