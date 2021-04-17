package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task157_Methods_TimeConversions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {

		/*
		 * INPUT: 07:05:45PM OUTPUT: 19:05:45
		 * 
		 * 
		 * INPUT: 07:05:45PM OUTPUT: 07:05:45
		 * 
		 * 
		 * INPUT: 12:00:00AM OUTPUT: 00:00:00
		 * 
		 * INPUT: 12:00:00PM OUTPUT: 12:00:00
		 */

		if (s.equals("12:00:00AM")) {
			System.out.println("00:00:00");
		} else if (s.equals("12:00:00PM")) {
			System.out.println("12:00:00");
		} else if (s.endsWith("AM")) {

			s = s.replace("AM", "");
			int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
			if (hour == 12) {
				s = "00" + s.substring(s.indexOf(":"));
			}
			System.out.println(s);
		} else if (s.endsWith("PM")) {

			int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
			hour += 12;

			String newTime = hour + s.substring(s.indexOf(":")).replace("PM", "");
			System.out.println(newTime);
		}
	}
}