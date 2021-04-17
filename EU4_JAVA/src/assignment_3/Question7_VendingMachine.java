package assignment_3;

public class Question7_VendingMachine {

	public static void main(String[] args) {

		int price, quarters, dimes, nickles;
		
		price=45;
		
		quarters= (100-price)/25;
		
		dimes=((100-price)%25)/10;
		
		nickles= (((100-price)%25)%10)/5;
		
		System.out.println("Price in cents:"+ price);
		System.out.println("Your change is "+ quarters+ " guarters, "+ dimes + " dimes, "+ nickles+ " nickles");
		
	}

}
