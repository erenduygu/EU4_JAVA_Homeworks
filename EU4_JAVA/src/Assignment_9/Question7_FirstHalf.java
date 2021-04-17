package Assignment_9;

import java.util.Scanner;

public class Question7_FirstHalf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		String wordHalf = word.substring(0, (word.length() / 2));
		System.out.println(wordHalf + wordHalf);
		scan.close();

	}
}