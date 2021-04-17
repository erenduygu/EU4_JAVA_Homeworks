package Assignment_4;

import java.util.Scanner;

public class Question11_SoundSpeed {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter medium variable: air, water or steel");
		String medium = scan.next();

		System.out.println("Enter the distance");
		double distance = scan.nextDouble();

		double time = 0;

		switch (medium) {

		case "air":
			time = distance / 1100;
			break;
		case "water":
			time = distance / 4900;
			break;
		case "steel":
			time = distance / 16400;
		}

		System.out.println("Time: " + time);
	}

}
