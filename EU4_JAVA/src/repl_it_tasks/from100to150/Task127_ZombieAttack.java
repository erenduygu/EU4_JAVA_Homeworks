package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task127_ZombieAttack {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        int[] inhabitants = new int[8];
	        for (int i = 0; i < inhabitants.length; i++) {
	            inhabitants[i] = input.nextInt();
	        }
	        //TODO. Write you code below this line.
	        int[] inhabitantsTemp = new int[8];
	        System.arraycopy(inhabitants, 0, inhabitantsTemp, 0, 8);
	        for (int i = 0; i < 10; i++) {
	            boolean flag = true;
	            if (i == 0) {
	                System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
	            } else {
	                for (int city = 0; city < inhabitantsTemp.length; city++) {
	                    if (city == 0) {
	                        if (inhabitantsTemp[city + 1] < 1) {
	                            inhabitants[city] = inhabitants[city] / 2;
	                        }
	                    } else if (city == inhabitantsTemp.length - 1) {
	                        if (inhabitantsTemp[city - 1] < 1) {
	                            inhabitants[city] = inhabitants[city] / 2;
	                        }
	                    } else {
	                        if (inhabitantsTemp[city + 1] < 1) {
	                            inhabitants[city] = inhabitants[city] / 2;
	                        } else if (inhabitantsTemp[city - 1] < 1) {
	                            inhabitants[city] = inhabitants[city] / 2;
	                        }
	                    }
	                }
	                System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
	            }
	            for (int j = 0; j < inhabitants.length; j++) {
	                if (inhabitants[j] != 0) {
	                    flag = false;
	                    break;
	                } else {
	                    flag = true;
	                }
	            }
	            if (flag) {
	                System.out.println("---- EXTINCT ----");
	                break;
	            }
	            System.arraycopy(inhabitants, 0, inhabitantsTemp, 0, 8);
	        }
	    }
	}