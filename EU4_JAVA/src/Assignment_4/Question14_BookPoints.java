package Assignment_4;

import java.util.Scanner;

public class Question14_BookPoints {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of books that you read");
		int num = scan.nextInt();

		switch (num) {

		case 0:
			System.out.println("Your awarded point is 0 points for this month");
			break;
		case 1:
			System.out.println("Your awarded point is 5 points for this month");
			break;
		case 2:
			System.out.println("Your awarded point is 15 points for this month");
			break;
		case 3:
			System.out.println("Your awarded point is 30 points for this month");
			break;
		default:
			System.out.println("Your awarded point is 60 points for this month");
			break;

		}

	}

}
