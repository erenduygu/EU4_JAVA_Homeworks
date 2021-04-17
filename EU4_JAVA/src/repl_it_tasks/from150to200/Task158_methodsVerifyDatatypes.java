package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task158_methodsVerifyDatatypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numStr = scan.next();
		printDataTypes(numStr);
	}

	public static void printDataTypes(String numStr) {
		long num = 0;
		try {
			num = Long.valueOf(numStr);
			System.out.println(num + " can be fitted in:");
			if (num >= -128 && num <= 127) {
				System.out.println("* byte\n* short\n* int\n* long");
			} else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
				System.out.println("* short\n* int\n* long");
			} else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
				System.out.println("* int\n* long");
			} else if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
				System.out.println("* long");
			} else {
				System.out.println(num + " can't be fitted anywhere.");

			}

			// WRITE YOUR CODE HERE

			// DO NOT CHANGE
		} catch (Exception e) {
			System.out.println(numStr + " can't be fitted anywhere.");
		}
	}
}