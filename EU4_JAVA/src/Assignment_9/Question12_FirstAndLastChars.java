package Assignment_9;

import java.util.Scanner;

public class Question12_FirstAndLastChars {

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