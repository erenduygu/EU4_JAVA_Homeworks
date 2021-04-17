package repl_it_tasks.from1to50;

import java.util.Scanner;
public class Task032_SecondConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner convert=new Scanner (System.in);
		int inputSeconds,hours,minutes,seconds;
		
		System.out.println("Enter seconds:");
		
		inputSeconds= convert.nextInt();
		hours=inputSeconds/3600;
		minutes=(inputSeconds%3600)/60;
		seconds=(inputSeconds%3600)%60%60;
		
		System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
	}

}
