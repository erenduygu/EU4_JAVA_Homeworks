package Assignment_8;

import java.util.Scanner;

public class Question2_CubeOfNumbers {

	public static void main(String[] args) {
		cube();
	}

	public static void cube() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");
		int num1 = scan.nextInt();

		int cube = num1 * num1 * num1;

		System.out.println("Cube= " + cube);
	}

}
