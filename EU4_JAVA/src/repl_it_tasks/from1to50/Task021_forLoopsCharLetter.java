package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task021_forLoopsCharLetter {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();

		int i = 0;
		for (i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			System.out.println(word.charAt(i));
		}

	}
}