package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task136_ArraysHas55 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    System.out.println(array(nums));

		}    public static boolean array(int[] nums){
		      for(int i=0;i<nums.length-1;i++){
		        if(nums[i]==5 && nums[i+1]==5){
		          return true;
		          
		  
		        }
		        
		      }return false;
		  }
		}