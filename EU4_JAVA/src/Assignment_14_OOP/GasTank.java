package Assignment_14_OOP;

public class GasTank {

	double amount = 0;
	double capacity;

	public GasTank(double capacity) {
		this.capacity = capacity;
	}

	public void addGas(double x) {
		amount += x;

		if (amount > capacity)
			amount = capacity;
	}

	public void useGas(double y) {
		amount -= y;
		if (amount < 0)
			amount = 0;
	}

	public boolean isEmpty() {

		if (amount < 0.1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {

		if (amount > (capacity - 0.1)) {
			return true;
		}
		return false;
	}

	public double getGasLevel() {
		return amount;

	}

	public double fillUp() {
		return capacity - amount;

	}

	/*
	public static void main(String[] args) {

		GasTank gt= new GasTank(50);
		
		System.out.println(gt.capacity);
		gt.addGas(30);
		System.out.println(gt.amount);
		System.out.println(gt.fillUp());
		gt.useGas(15);
		System.out.println(gt.fillUp());
		
	}

	*/
}
