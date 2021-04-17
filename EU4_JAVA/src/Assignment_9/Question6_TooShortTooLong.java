package Assignment_9;

import java.util.Scanner;

public class Question6_TooShortTooLong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() > 5) {
			System.out.println("Too long!");
		} else if (word.length() < 5) {
			System.out.println("Too short!");
		} else {
			for (int i = word.length() - 1; i >= 0; i--) {
				char reverse = word.charAt(i);
				System.out.print(reverse);
			}
		}scan.close();

	}

}
