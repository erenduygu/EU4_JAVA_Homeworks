package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task087_ZombieAttack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();

		int day=0;
		
		while(inhabitants>0) {
			
			System.out.println("Day " + day+ " [" + inhabitants + "]");
			
			inhabitants=inhabitants/2;
			day++;
		}
		
		System.out.println("---- EXTINCT ----");

				
		
		/*	if (inhabitants == 0) {
			System.out.println("---- EXTINCT ----");
		} else {

			System.out.println("Day " + 0 + " [" + inhabitants + "]");

			for (int i = 1; i <= 100; i++) {

				System.out.println("Day " + i + " [" + inhabitants / 2 + "]");
				inhabitants = inhabitants / 2;

				if (inhabitants == 1 || inhabitants == 0) {
					break;
				}
			}
			System.out.println("---- EXTINCT ----");
		}*/

	}
}