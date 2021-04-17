package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task029_AndroidVersion {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		double version= scanner.nextDouble();
		
		
		if(version==1.5) {
			System.out.println("Cupcake");
		}
		if(version==1.6) {
			System.out.println("Donut");
		}
		if(version==2.1) {
			System.out.println("Eclare");
		}
		if(version==2.2) {
			System.out.println("Froyo");
		}
		if(version==2.3) {
			System.out.println("Gingerbread");
		}
		if(version==3.1) {
			System.out.println("Honeycomb");
		}
		if(version==4.0) {
			System.out.println("Ice Cream Sandwich");
		}
		if(version>=4.1&&version<=4.31) {
			System.out.println("Jelly Bean");
		}
		if(version>=4.4&&version<=4.44) {
			System.out.println("KitKat");
		}
		
		if(version>=5.0&&version<=5.11) {
			System.out.println("Lollipop");
		}
		
		if(version>=8.0&&version<=8.1) {
			System.out.println("Oreo");
		}
		if(version==9.0) {
			System.out.println("Pie");
		} else {
			System.out.println("Sorry, I don't know this version!");
		}
		
		
	}

}
