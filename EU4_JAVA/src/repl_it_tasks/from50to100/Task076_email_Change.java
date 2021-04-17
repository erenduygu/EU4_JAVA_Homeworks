package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task076_email_Change {

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

	}
}