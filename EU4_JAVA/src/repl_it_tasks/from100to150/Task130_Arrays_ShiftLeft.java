package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task130_Arrays_ShiftLeft {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();

		}

		
		/*int temp=nums[0];
		 * 
		 * for (int i=0;i<=size-1;i++) { 
		 * nums[i]=nums[i+1];
		 * } nums[size-1]=temp;
		 * System.out.println(Arrays.toString(nums));*/
		 

		int[] shifted = new int[size];
		for (int i = 0; i < size - 1; i++) {

			shifted[i] = nums[i + 1];
		}

			shifted[size - 1] = nums[0];
			System.out.println(Arrays.toString(shifted));

		
	}
}