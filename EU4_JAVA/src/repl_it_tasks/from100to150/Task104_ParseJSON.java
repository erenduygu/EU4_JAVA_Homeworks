package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task104_ParseJSON {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();

		int firstName = json.indexOf("first");
		int signFirstName = json.indexOf("\"", firstName + 15);
		int lastName = json.indexOf("last");
		int signLastName = json.indexOf("\"", lastName + 13);

		System.out.println("First name: " + json.substring(firstName + 13, signFirstName));
		System.out.println("Last name: " + json.substring(lastName + 12, signLastName));

	}
}