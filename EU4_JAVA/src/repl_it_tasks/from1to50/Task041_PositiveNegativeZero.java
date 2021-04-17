package repl_it_tasks.from1to50;

import java.util.Scanner;
public class Task041_PositiveNegativeZero {

	public static void main(String[] args) {

		   Scanner input = new Scanner(System.in);
		   
		    System.out.println("Enter a number:");
		    int number = input.nextInt();
		    
		    	    
		    if (number==0) {
			    System.out.println("it is zero");

		    }
		    if (number<0) {
			    System.out.println(number+" is negative");

		    }
		    if (number>0) {
			    System.out.println(number+" is positive");

		    }
	}

}
