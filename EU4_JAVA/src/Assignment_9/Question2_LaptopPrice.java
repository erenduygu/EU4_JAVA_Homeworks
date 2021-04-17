package Assignment_9;

import java.util.Scanner;

public class Question2_LaptopPrice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double price = 0;

		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();
		scan.nextLine();

		if (screenSize == 13.3)
			price += 200;
		if (screenSize == 15)
			price += 300;
		if (screenSize == 17.3)
			price += 400;

		System.out.println("Select CPU type:");
		String CPUtype = scan.nextLine();

		if (CPUtype.equals("i3"))
			price += 150;
		if (CPUtype.equals("i5"))
			price += 250;
		if (CPUtype.equals("i7"))
			price += 350;

		scan.nextLine();
		System.out.println("Select RAM size:");
		int RAMsize = scan.nextInt();
		scan.nextLine();

		price += (RAMsize / 4) * 50;

		System.out.println("Select storage type:");
		String storageType = scan.nextLine();
		System.out.println("Enter memory size:");
		int memorySize = scan.nextInt();
		scan.nextLine();
		
		if (storageType.equals("SSD"))
			price += (memorySize / 500) * 100;
		else if (storageType.equals("HDD"))
			price += (memorySize / 500) * 50;

		System.out.println("Enter screen resolution:");
		String screenResolution = scan.nextLine();

		if (screenResolution.equals("FULLHD"))
			price += 100;
		else if (screenResolution.equals("4K"))
			price += 200;

		System.out.println("Laptop price is: " + price+" $");

	}

}
