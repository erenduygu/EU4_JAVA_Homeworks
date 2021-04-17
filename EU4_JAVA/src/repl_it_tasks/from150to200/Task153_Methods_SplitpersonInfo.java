package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task153_Methods_SplitpersonInfo {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			
		
		String parts[]=info.split(",");

		System.out.println("person name: "+parts[0]+" last name: "+parts[1]+" age: "+parts[2]);
			
			}//end person
		  
		}