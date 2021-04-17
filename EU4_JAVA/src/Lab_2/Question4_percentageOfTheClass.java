package Lab_2;

import java.util.Scanner;

public class Question4_percentageOfTheClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the males number: ");
		int numberOfMales = scan.nextInt();

		System.out.println("Enter the females number: ");
		int numberOfFemales = scan.nextInt();

		int total = numberOfFemales + numberOfMales;

		double perOfFemales =( double)numberOfFemales / total*100;
		double perOfMales = (( double)numberOfMales / total)*100;
		
		System.out.println(total);

		System.out.println("Percentage of Males is " + perOfMales);
		System.out.println("Percentage of Females is " + perOfFemales);

	}

}
