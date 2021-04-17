package repl_it_tasks.from1to50;
import java.util.Scanner;
public class Task042_OddEven {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	    
	    if (number==0) {
		    System.out.println(number+" is even");

	    }else if (number%2==0) {
		    System.out.println(number+" is even");

	    }else {
		    System.out.println(number+" is odd");

	    }
	    
	}

}
