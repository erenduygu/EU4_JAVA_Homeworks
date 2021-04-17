package repl_it_tasks.from1to50;

import java.util.Scanner;
public class Task026_Positive_Negative {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
	
		System.out.println("Please enter your number");
		
		int num=s.nextInt();

		
		if(num==0) {
			System.out.println("Zero");
		}
		if(num<0) {
			System.out.println("Negative");
		}
		if(num>0) {
			System.out.println("Positive");
		}
	}

}
