package Assignment_14_OOP;

public class TV {

	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args-constructor");
	}

	public TV(String brand) {

		System.out.println("Creating TV object using 1 Args-constructor");

		this.brand = brand;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (on && channel >= 1 && channel <= 120) {
			this.channel = channel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (on && volumeLevel >= 1 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}

	public void channelDown() {
		if (on && channel > 1) {
			channel--;
		}

	}

	public boolean isOn() {
		return on;
	}

	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}

	}

	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}

	}

	public void turnOn() {
		if (on == true) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}
	}

	public void turnOff() {
		if (on == false) {
			System.out.println("TV is already OFF");
		} else {
			on = false;
		}

	}

	/*
	 * public static void main(String[] args) { TV television= new TV();
	 * System.out.println(television.getBrand()); }
	 */
}
