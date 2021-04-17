package repl_it_tasks.from100to150;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task109_FiveStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].substring(0,3));
		}

	}

}
