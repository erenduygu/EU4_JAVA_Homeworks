package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task093_HasAJava {

	public static void main(String[] args) {

		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() == 4 || word.length() >= 5) {

			if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}

	}
}