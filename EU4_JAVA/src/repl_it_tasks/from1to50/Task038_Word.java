package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task038_Word {

	public static void main(String[] args) {


		String word1, word2;
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("word1= ");
		word1=scan.next();
		System.out.println("word2= ");
		word2=scan.next();
		
		if ((word1).equals(word2)) {
			
			System.out.println("word1 equals word2");
		}else {
			System.out.println("word1 does not equal word2");
	
		}
	}

}
