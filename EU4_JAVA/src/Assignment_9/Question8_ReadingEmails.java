package Assignment_9;

import java.util.Scanner;

public class Question8_ReadingEmails {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine().toLowerCase();

		if (email.contains("alejandro")) {
			System.out.println("read this mail");
		} else {
			System.out.println("don't read");
		}
		scan.close();

	}
}