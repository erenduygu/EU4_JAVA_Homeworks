package Assignment_8;

import java.util.Scanner;

public class Question7_isPalindrom {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int nums = scan.nextInt();

		isPalindrome(nums);
	}

	public static void isPalindrome(int num) {
		int temp = num;
		int newNum = 0;

		while (temp != 0) {
			newNum = newNum * 10 + temp % 10;
			temp = temp / 10;
		}
		System.out.println(newNum);

		if (num == newNum)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
