package repl_it_tasks.from100to150;
import java.util.Scanner;
public class Task107_SliceNumber {

	public static void main(String[] args) {
		  int num, digit1, digit2, digit3, digit4, digit5;
		    //WRITE YOUR CODE HERE
		  
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter your number");

		    num=scan.nextInt();
		    
		    digit1=num/10000;
		    digit2=num%10000/1000;
		    digit3=num%10000%1000/100;
		    digit4=num%10000%1000%100/10;
		    digit5=num%10000%1000%100%10;
		    
		    System.out.println(digit1+"\n"+digit2+"\n"+digit3+"\n"+digit4+"\n"+digit5);
	}

}
