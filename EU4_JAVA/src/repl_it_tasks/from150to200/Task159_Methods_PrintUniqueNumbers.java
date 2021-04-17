package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task159_Methods_PrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {

		  for (int i=0;i<nums.length;i++){
		        int count=0;
		        for (int j=0;j<nums.length;j++){
		          if(nums[i]==nums[j]){
		            count++;
		            
		          }
		          }if (count==1){
		            System.out.println(nums[i]);
		        }
		      }
		    
		  }
		}

/*
for (int each : arr) {
int count = 0;
for (int eachInner : arr) {

	if (each == eachInner) {
		count++;
	}
}
if (count == 1) {
	System.out.println(each);
}

}

}

}
*/