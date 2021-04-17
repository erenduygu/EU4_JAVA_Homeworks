package Assignment_4;

import java.util.Scanner;

public class Question15_SwitchCaseNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scan.nextInt();

		switch (num) {

		case 0:
		case 1:
		case 2:
			System.out.println("Low number");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Medium number");
			break;

		default:
			System.out.println("Other number");
			break;

		}

	}

}
