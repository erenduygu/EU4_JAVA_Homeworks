package repl_it_tasks.from50to100;
import java.util.Scanner;
public class Task064_MiddleOne {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();

			if (word.length() % 2 == 1) {
					
					if (word.length()>=3) {
					  System.out.println(word.charAt(word.length() / 2));
					}	else if (word.length()==1) {
					  System.out.println(word+word+word);
			    	} 
			}else {if (word.length()>=4) {
					  System.out.println((word.charAt(word.length() / 2-1))+""+(word.charAt(word.length() / 2)));
					}	else if (word.length()==2) {
					  System.out.println(word+word);
			    	} 
		    
		    
			    
		  
		}
	}
}