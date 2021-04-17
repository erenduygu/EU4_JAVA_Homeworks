package repl_it_tasks.from1to50;

import java.util.Scanner;
public class Task034_VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int itemPrice, quarters,dimes, nickels;
		
		System.out.println("Enter price in cents:");
		
		Scanner scan=new Scanner (System.in);
		itemPrice=scan.nextInt();
		quarters=(100-itemPrice)/25;
		dimes=(100-itemPrice)%25/10;
		nickels=(100-itemPrice)%25%10/5;
		
		if((100-itemPrice)%25%10%5!=0) {System.out.println("Invalid price!"); }
		else if (itemPrice<25){System.out.println("Invalid price!"); }
		else {
		System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+ nickels+" nickels.");}

		
	}

}
