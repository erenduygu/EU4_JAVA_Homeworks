package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task132_Diving {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float[] score = new float[7];

		for (int j = 0; j < score.length; j++) {
			System.out.println("Enter score for judge "+(j+1)+": ");
			score[j]=input.nextFloat();
		}
		Arrays.sort(score);
		
		float total=0;
		for (int i = 1; i < score.length-1; i++) {
			total+=score[i];
		}
		
		System.out.println("Enter difficulty");
		float difficulty=input.nextFloat();
		
		total=total*difficulty*6/10;
		
		
		System.out.printf("Total: %.2f", total);
	}
}
