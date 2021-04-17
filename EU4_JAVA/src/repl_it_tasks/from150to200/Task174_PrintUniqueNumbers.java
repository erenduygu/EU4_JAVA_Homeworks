package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task174_PrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){

		  for (int each : nums) {
				int count = 0;
				for (int eachInner : nums) {

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
