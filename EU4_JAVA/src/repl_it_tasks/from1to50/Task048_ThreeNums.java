package repl_it_tasks.from1to50;
import java.util.Scanner;

public class Task048_ThreeNums {

	public static void main(String[] args) {


	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Enter three numbers");

	    int n1 = s.nextInt();
	    int n2 = s.nextInt();
	    int n3 = s.nextInt();
	    
	    
	    System.out.println("n1= "+n1+"\nn2= "+n2+"\nn3= "+n3);
	    
	    if (n1>n2&&n1>n3) {System.out.println("n1 is bigger");}
	    else if (n2>n1&&n2>n3) {System.out.println("n2 is bigger"); }
	    else if (n3>n2&&n3>n1) {System.out.println("n3 is bigger"); 	
	    }
	    }
	    
	}


