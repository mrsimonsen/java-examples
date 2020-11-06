/* Message Analyzer
Demonstrates the length() and indexOf() methods*/

import java.util.Scanner;

public class MessageAnalyzer{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a message:");
		String message = scnr.nextLine();

		System.out.println("\nThe length of your message is: " + message.length());

		System.out.print("\nThe most common letter in the English language, 'e', ");
		if (message.indexOf('e')>=0){
			System.out.println("is in your message.");
		}
		else{
			System.out.println("is not in your message.");
		}
	}
}

