package Assignment_9;

import java.util.Scanner;

public class Question9_SwapNamesInEmail {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		if (email.contains("_")) {

			int underscore = email.indexOf('_');
			int atSign = email.indexOf('@');

			System.out.println(email.substring(underscore + 1, atSign) + "_" + email.substring(0, underscore)
					+ email.substring(atSign));

		} else {
			System.out.println(email);
		}
		scan.close();
	}
}