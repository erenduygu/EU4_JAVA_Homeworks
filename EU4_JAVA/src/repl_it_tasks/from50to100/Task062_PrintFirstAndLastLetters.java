package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task062_PrintFirstAndLastLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		System.out.println(word.charAt(0) +""+ word.charAt(word.length() - 1));
	}
}