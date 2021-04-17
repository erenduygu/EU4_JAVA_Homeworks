package Assignment_5_day11;

public class Question3_TotalNumberofEvenNumbers {

	public static void main(String[] args) {

		int countOfEven = 0;
		for (int i = 5; i <= 50; i++) {
			if (i % 2 == 0) {
				// System.out.println(i);
				++countOfEven;

			}

		}
		System.out.println("Count of even numbers between 5 to 50 is " + countOfEven);

	}

}
