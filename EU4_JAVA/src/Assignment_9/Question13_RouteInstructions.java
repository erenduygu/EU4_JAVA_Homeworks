package Assignment_9;

import java.util.Scanner;

public class Question13_RouteInstructions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();

		char startChar = start.charAt(0);
		char endChar = end.charAt(0);
		int n = 1;
		if (startChar == endChar)
			System.out.println(endChar + " found");
		while (startChar != endChar) {
			if (n != 1)
				System.out.print(" > ");
			if (startChar == 'A') {
				System.out.print("right");
				startChar++;
			} else if (startChar == 'B') {
				System.out.print("down");
				startChar++;
			} else if (startChar == 'C') {
				System.out.print("left");
				startChar++;
			} else {
				System.out.print("up");
				startChar++;
			}
			if (startChar == 'E')
				startChar = 'A';
			n++;
			if (startChar == endChar) {
				System.out.println(": " + endChar + " found");
				break;
			}
		}
	}

}
