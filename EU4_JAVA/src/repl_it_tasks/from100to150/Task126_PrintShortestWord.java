package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task126_PrintShortestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] newStr = str.split(", ");

		int shorter = newStr[0].length();

		for (int i = 0; i < newStr.length; i++) {

			if (newStr[i].length() <= shorter) {
				shorter = newStr[i].length();
			}

		}
		int count=0;
		for (String each : newStr) {
		
			if (each.length() == shorter) {
				count++;
			}
		}
		
		
		String[] shortestWordArray=new String[count];
		
		int x=0;
		for (String newWord:newStr) {
			if (newWord.length()==shorter) {
				shortestWordArray[x]=newWord;
				x++;
			}
		}Arrays.sort(shortestWordArray);
		System.out.println(Arrays.toString(shortestWordArray));
		
	}

}