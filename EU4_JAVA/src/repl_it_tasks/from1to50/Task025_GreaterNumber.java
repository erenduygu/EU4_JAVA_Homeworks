package repl_it_tasks.from1to50;

import java.util.Scanner;
public class Task025_GreaterNumber {

  public static void main(String[] args) {
  
	  
	  
	Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    
    //WRITE YOUR CODE HERE:
   if (a>b) {
     System.out.println(a+" is greater");
   }
      if (b>a) {
     System.out.println(b+" is greater");
   }
    
  }
}