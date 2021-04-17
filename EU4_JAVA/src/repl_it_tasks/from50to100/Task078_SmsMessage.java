package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task078_SmsMessage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String sender;
		String phoneNumber;
		String messageBody;

		sender = message.substring(message.indexOf("<"), message.indexOf(">") + 1);
		phoneNumber = message.substring(message.indexOf("["), message.indexOf("]") + 1);
		messageBody = message.substring(message.indexOf("{"), message.indexOf("}") + 1);

		System.out.println("Sender: " + sender);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Message body: " + messageBody);

	}

}
