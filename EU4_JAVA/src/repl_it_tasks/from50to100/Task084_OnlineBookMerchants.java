package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task084_OnlineBookMerchants {

	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Are you a Premium customer?");
		boolean isPremiumCustomer = scan.nextBoolean();

		System.out.println("Enter your number of books:");
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer == true) {
			if (nbooksPurchased >= 5&&nbooksPurchased<8) {
				freeBooks += 1;
			} else if (nbooksPurchased >= 8) {
				freeBooks += 2;
			}
		} else {
			if (nbooksPurchased >= 7&&nbooksPurchased<12) {
				freeBooks += 1;
			} else if (nbooksPurchased >= 12) {
				freeBooks += 2;
			}
		} System.out.println(freeBooks);
	}
}