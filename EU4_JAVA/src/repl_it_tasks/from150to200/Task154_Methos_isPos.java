package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task154_Methos_isPos {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	        isPos(arr[i]);
	    }
	    //#2 Your code here
	
	  
	  }
	  
	  public static void isPos(int num) {
	     if(num>0){
	       System.out.println("positive");
	     }else{
	        System.out.println("not positive");
	     }   
	  }
	  
	}