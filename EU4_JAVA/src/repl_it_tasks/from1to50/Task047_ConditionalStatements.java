package repl_it_tasks.from1to50;
import java.util.Scanner;

public class Task047_ConditionalStatements {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();	
	  	
	
	if(num%2==0) {
		System.out.println(num+" is even");
	}
	
	if(num%2!=0) {
		System.out.println(num+" is odd");
	}
	
	
	}

}
