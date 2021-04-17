package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task033_CafeineOverDose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int numOfMilligrams; 
		
		System.out.println("Enter number of milligrams in drink:");
		Scanner scan=new Scanner(System.in);
		numOfMilligrams=scan.nextInt();
		int drinks=10*1000/numOfMilligrams;
		
		System.out.println("It would take about " +drinks+ " drinks for a lethal overdose.");
		
	}

}
