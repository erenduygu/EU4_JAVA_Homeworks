package assignment_6_day11;

public class Question5_1andiPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 7 - i; j >= 1; j--) {
				System.out.print(1);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}

			System.out.println(" ");
		}

	}
}
