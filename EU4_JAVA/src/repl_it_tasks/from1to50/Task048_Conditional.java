package repl_it_tasks.from1to50;
import java.util.Scanner;
public class Task048_Conditional {

	public static void main(String[] args) {

	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();
	  	
	  	if (name.equals("Chen")) {
	  		System.out.println("Teacher");
	  		
	  	}else {System.out.println("Student");}
	}

}
