package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task062_FindTheLength {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the text:");
		String response = scan.nextLine();

		System.out.println("Length is: " + response.length());

	}

}
