package Assignment_4;

import java.util.Scanner;

public class Question1_BMI {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your weight in pounds:");
		double weightPounds = scan.nextDouble();
		double mass = weightPounds / 2.2;

		System.out.println("Enter your height in feet:");
		double heightFeet = scan.nextDouble();
		double heightInches1 = heightFeet * 12;

		System.out.println("Enter your additional inches:");
		double heightInches = scan.nextDouble();
		double height = (heightInches1 + heightInches) * 0.0254;

		double BMI = mass / (height * height);

		System.out.println();

		System.out.println("Your weight in pounds: " + weightPounds);
		System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " + heightInches);
		System.out.println("Your BMI is: " + BMI);

		if (BMI < 18.5) {
			System.out.println("Your risk factory is Underweight");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("Your risk factory is Normal Weight");
		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("Your risk factory is Overweight");
		} else if (BMI >= 30) {
			System.out.println("Your risk factory is Obese");
		}

	}

}
