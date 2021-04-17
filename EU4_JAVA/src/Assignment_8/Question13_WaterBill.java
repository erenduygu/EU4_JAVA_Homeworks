package Assignment_8;

public class Question13_WaterBill {

	public static void main(String[] args) {
		
		System.out.println(waterTax(151));
	}

	public static double waterTax(double units) {

		double bill = 0;
		if (units <= 50) {
			bill = units * 0.6;
		}
		if (units > 50 && units <= 100) {
			bill = units * 0.9;
		}
		if (units > 100 && units <= 150) {
			bill = units * 0.9 + 50;
		}
		if (units > 150) {
			bill = units * 0.9 + 100;
		}
		return bill;
	}
}
