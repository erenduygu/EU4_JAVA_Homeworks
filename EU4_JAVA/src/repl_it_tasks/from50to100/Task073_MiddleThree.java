package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task073_MiddleThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();


		if (word.length() % 2 == 1 & word.length() >= 5) {
			String word1 = word.substring((word.length() / 2 - 1), (word.length() / 2 + 2));

			System.out.println(word1);

		} else {
			System.out.println("invalid");

		}

	}
}