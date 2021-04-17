package repl_it_tasks.from1to50;
import java.util.Scanner;

public class Task035_GiftCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Input:");
		
		  Scanner scan = new Scanner(System.in);
		    String item = scan.next();
		
		   		    
		    if (item.equals("Charger")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 85$");

		    }  else  if (item.equals("USB cable")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 90$");

		    }    else if (item.equals("Headphones")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 70$");

		    }    else if (item.equals("Pants")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 50$");

		    }    else if (item.equals("Hat")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 75$");

		    }    else if (item.equals("Socks")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 95$");
		    }    else if (item.equals("Blanket")) {
			    	System.out.println("Output: Thank you for your purchase!");
			    	System.out.println("Output: Your current balance is 40$");

			  }    else if (item.equals("Pillow")) {
		    	System.out.println("Output: Thank you for your purchase!");
		    	System.out.println("Output: Your current balance is 60$");
			  } else     if (item.equals("Smartphone")) {
			    	System.out.println("Output: Sorry, not enough funds on your gift card!");
			    	

			  }    else if (item.equals("Laptop")) {
			    	System.out.println("Output: Sorry, not enough funds on your gift card!");
			  }			  
			  
		  else    {
			    	System.out.println("Output: Invalid item!");
			    

			    }

	}}
		    
	