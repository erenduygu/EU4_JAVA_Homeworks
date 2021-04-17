package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task080_BuiltARoute {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();

		char startC = start.charAt(0);
		char endC = end.charAt(0);
		int n = 1;
		if (startC == endC)
			System.out.println(endC + " found");
		while (startC != endC) {
			if (n != 1)
				System.out.print(" > ");
			if (startC == 'A') {
				A();
				startC++;
			} else if (startC == 'B') {
				B();
				startC++;
			} else if (startC == 'C') {
				C();
				startC++;
			} else {
				D();
				startC++;
			}
			if (startC == 'E')
				startC = 'A';
			n++;
			if (startC == endC) {
				System.out.println(": " + endC + " found");
				break;
			}
		}
	}

	public static void A() {
		System.out.print("right");
	}

	public static void B() {
		System.out.print("down");
	}

	public static void C() {
		System.out.print("left");
	}

	public static void D() {
		System.out.print("up");
	}
}
