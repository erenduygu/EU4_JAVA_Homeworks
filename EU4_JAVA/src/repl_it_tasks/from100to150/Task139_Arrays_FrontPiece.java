package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task139_Arrays_FrontPiece {

	public static void main(String[] args) {

		int[] num = {1,2,4,5,6,9,8};

		 
		
		
	      int[] newArr ;
	      
	      if(num.length>1){
	        newArr= new int [] {num[0],num[1]};
	      }else{
	        newArr=new int [] {num[0]};
	      }
	      System.out.println(Arrays.toString(newArr));
	    
	  }
	}