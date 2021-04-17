package repl_it_tasks.from200to250;

public class Task212_CurrencyConversion {

	public static void main(String[] args) {

		String[][] test_money = { { "mark", "5" }, { "shekel", "30.5" }, };

		String[][] test_convert = { { "mark", "1" }, { "shekel", "0.5" }, };

		double res = Task212_CurrencyConversion.convertC(test_money, test_convert);
		System.out.print(res);

	}

	public static double convertC(String[][] money, String[][] convertionRate) {

		double sum = 0;
		for (int i = 0; i < money.length; i++) {
			double amount = Double.parseDouble(money[i][1]);
			double rate = Double.parseDouble(convertionRate[i][1]);
			sum += amount * rate;

		}

		return sum;

	}

}