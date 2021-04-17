package assignment_6_day11;

public class Question6_iSumTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
			int sum = i;

			for (int j = 1; j < i; j++) {
				sum = sum + (5 - j);
				System.out.print(+sum + " ");
			}

			System.out.println(" ");
		}

	}
}
