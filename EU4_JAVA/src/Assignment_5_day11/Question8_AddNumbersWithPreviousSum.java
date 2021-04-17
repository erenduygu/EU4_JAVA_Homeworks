package Assignment_5_day11;

public class Question8_AddNumbersWithPreviousSum {

	public static void main(String[] args) {

		int upperLimit = 10;
		int sum = 0;
		int i = 0;
		while (i <= upperLimit) {
			sum = sum + i;
			i++;
		}

		System.out.println(sum);

	}

}
