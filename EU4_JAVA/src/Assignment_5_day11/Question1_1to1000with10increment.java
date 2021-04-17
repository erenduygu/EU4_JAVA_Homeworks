package Assignment_5_day11;

public class Question1_1to1000with10increment {

	public static void main(String[] args) {

		String comma = "";

		for (int i = 0; i <= 1000; i += 10) {
			System.out.print(comma + i);
			comma = ",";

		}
	}

}