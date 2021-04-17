package Assignment_14_OOP;

public class ParkingMeter {

	int timeLeft = 25;
	int maxTime;

	public ParkingMeter(int maxTime) {

		this.maxTime = maxTime;
	}

	public boolean add(int x) {
		if (x == 25 && timeLeft < maxTime) {
			timeLeft += 30;
			return true;
		}
		return false;
	}

	public void tick() {
		if (timeLeft > 0)
			timeLeft += 1;

	}

	public boolean isExpired() {
		if (timeLeft == 0) {
			return true;
		}
		return false;
	}

	/*
	 * public static void main(String [] args) {
	 * 
	 * ParkingMeter pm= new ParkingMeter(30); System.out.println(pm.add(26));
	 * System.out.println(pm.timeLeft); }
	 */

}
