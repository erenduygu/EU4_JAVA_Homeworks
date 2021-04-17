package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task137_Arrays_ReverseSentence {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    System.out.println(reverse(sentence));

		  }public static String reverse(String sent){
		    
		    String[] reverseArray=sent.split(" ");
		    String reverse="";
		    
		    for(int i=reverseArray.length-1;i>=0;i--){
		      reverse+=reverseArray[i]+"\n";
		    }return reverse.trim();
		    
		  }
		}