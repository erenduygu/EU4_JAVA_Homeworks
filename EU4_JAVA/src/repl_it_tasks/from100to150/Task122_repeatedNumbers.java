package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task122_repeatedNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		
		
		
				// TODO: write your code below

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++)
				if (nums[i] == nums[j]) {
					count++;

				}
			if (count == 1) {
				System.out.println(nums[i]);
			}

		}

	}

}
