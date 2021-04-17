package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task079_XChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		

		if (word.charAt(0) == 'x' || word.charAt(0) == 'X' || word.charAt(word.length() - 1) == 'x'
				|| word.charAt(word.length() - 1) == 'X') {
			System.out.println(word.replace("x", "").replace("X", ""));
		} else {
			System.out.println(word);
		}

	}
}