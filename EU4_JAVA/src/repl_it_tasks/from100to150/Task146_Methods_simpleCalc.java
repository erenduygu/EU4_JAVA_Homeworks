package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task146_Methods_simpleCalc {

	public static void main(String[] args) {

		  plus();
	  }
	  
	  public static void plus(){
	     
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter first number:");
	    int firstNumber=scan.nextInt();
	    
	    System.out.println("enter second number:");
	    int secondNumber=scan.nextInt();
	    
	    int total=firstNumber+secondNumber;
	    System.out.println("result: "+total);
	    
	  }
	  
	}