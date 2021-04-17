package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task113_Arrays_FindMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= max) {
				max = nums[i];

			}

		}
		System.out.println(max);
	}
}
