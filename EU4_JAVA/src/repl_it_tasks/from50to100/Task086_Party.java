package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task086_Party {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String selection = "";
		String guestList = "";
		String name = "";

		do {
			System.out.println("Please enter guest name:");
			name = input.next();

			guestList += name;

			System.out.println("Do you want to enter new guest name:");
			selection = input.next();

			if (selection.equalsIgnoreCase("yes")) {
				guestList += ", ";
			}

		} while (selection.equalsIgnoreCase("yes"));
		System.out.println("Guest's list: " + guestList);
	}
}