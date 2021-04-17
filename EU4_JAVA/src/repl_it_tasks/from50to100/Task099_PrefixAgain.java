package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task099_PrefixAgain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		int wordlength = str.length();
		int count = 0;

		for (int i = 0; i <= wordlength - n; i++) {

			String targetWord = str.substring(i, n + i);
			System.out.println(targetWord);

			if (str.contains(targetWord)) {
				count++;
			}
		}System.out.println(count);
	}
}
