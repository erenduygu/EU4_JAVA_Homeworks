package Assignment_4;

import java.util.Scanner;

public class Question7_ManySeconds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number in seconds");
		int numberInSeconds = scan.nextInt();

		int days = 0, hours = 0, minutes = 0, seconds = 0;

		if (numberInSeconds >= 86400) {

			days = numberInSeconds / 86400;

		}
		if ((numberInSeconds < 86400 && numberInSeconds >= 3600) || numberInSeconds % 84600 >= 3600) {

			hours = numberInSeconds % 86400 / 3600;

		}
		if ((numberInSeconds < 3600 && numberInSeconds >= 60) || numberInSeconds % 84600 % 3600 >= 60) {

			minutes = numberInSeconds % 86400 % 3600 / 60;

		}
		if ((numberInSeconds < 60 && numberInSeconds >= 0) || numberInSeconds % 84600 % 3600 % 60 >= 0) {

			seconds = numberInSeconds % 86400 % 3600 % 60;

		}

		System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");

	}

}
