package repl_it_tasks.from1to50;

import java.util.Scanner ; 

public class Task023_PhoneNumber {
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    //YOUR CODE HERE 
    
    int areaCode=scan.nextInt();
    int localNumber=scan.nextInt();
    
    String phoneNumber="Calling number ("+areaCode+")-"+localNumber;
    
    
    System.out.println(phoneNumber);
    
    
  }
  
  
  
}