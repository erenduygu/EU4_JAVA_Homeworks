package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task110_printFirstLastChar {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   
		    for (int i=0;i<5;i++){
		        System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
		    }
		    
	}

}
