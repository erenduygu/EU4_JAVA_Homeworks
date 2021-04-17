package assignment_6_day11;

public class Question3_SandGlassNumbers {

	public static void main(String[] args) {

		label1:

		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.print(j + " ");
			}

			System.out.println(" ");

			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
				if (i == 6) {
					break label1;
				}
			}

		}
		System.out.print("    ");

		for (int i = 1; i < 7; i++) {
			for (int j = 7 - i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
		}

	}

}

/*
for (int i = 1; i <= 7; i++) {
	for (int j1 = 1; j1 < i; j1++)
		System.out.print(" ");

	for (int j = i; j <= 7; j++) {

		System.out.print(j + " ");

	}

	System.out.println();

}

for (int i = 2; i <= 7; i++) {
	for (int j1 = 1; j1 < 8-i; j1++)
		System.out.print(" ");
	for (int j = 8 - i; j < 8; j++) {
		System.out.print(j + " ");

	}
	System.out.println();

}

}
*/