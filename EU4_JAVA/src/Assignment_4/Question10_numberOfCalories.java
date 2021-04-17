package Assignment_4;

import java.util.Scanner;

public class Question10_numberOfCalories {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of Calories");
		double numberOfCalories = scan.nextDouble();

		System.out.println("Enter the fat grams in food");
		double fatGrams = scan.nextDouble();

		double caloriesFromFat = fatGrams * 9;
		double totalCalories = caloriesFromFat + numberOfCalories;
		double percentageOfCalories = caloriesFromFat / totalCalories;

		if (caloriesFromFat > totalCalories) {
			System.out.println("input is invalid");
		} else if (caloriesFromFat < percentageOfCalories * 0.3) {
			System.out.println("low in fat");
		} else
			System.out.println("high in fat");

	}

}
