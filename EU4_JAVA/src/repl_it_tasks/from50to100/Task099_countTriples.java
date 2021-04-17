package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task099_countTriples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;

		int wordLength = str.length();
		int countOfLetter = 3;

		for (int i = 0; i <= wordLength - countOfLetter; i++) {
			char letter = str.charAt(i);
						//System.out.println(letter);
			String triple = str.substring(i,i+countOfLetter);
						//System.out.println(triple);
			
			if (triple.equals(letter +""+ letter + letter)) {
				count++;

			}

		}System.out.println(count);
	}
}