package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task023_forLoopsVowels {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();

		String word1 = word.toLowerCase();
		word1 = word.trim();

		int i = 0;
		for (i = 0; i < word1.length(); i++) {
			char letter = word1.charAt(i);

			if (word1.charAt(i) == 'a' || word1.charAt(i) == 'e' || word1.charAt(i) == 'i' || word1.charAt(i) == 'o'
					|| word1.charAt(i) == 'u') {
				System.out.print(word.charAt(i));
			}
		}

	}
}