package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task037_VideoGameCount {

	public static void main(String[] args) {

		

		int candies, gumballs, coupons;
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter number of coupons");
		coupons=scan.nextInt();
		
		candies=coupons/10;
		gumballs=(coupons%10)/3;
		
		if (coupons<3) {
			System.out.println("Not enough coupons");
		} else {
			System.out.println("Number of Candies: "+ candies);
			System.out.println("Number of Gumballs: "+ gumballs);
		}
		
		
	}

}
