package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task161_method16_Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {

		int newNum=0;
		int temp=num;
		int count=0;
		while(temp!=0){
			newNum=newNum*10+temp%10;
			temp=temp/10;
			count++;
		}System.out.println(newNum==num);
		System.out.println(count);
		
		
	}

}
