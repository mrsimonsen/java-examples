/*Receive and Return
Demonstrates parameters and return values*/

import java.util.Scanner;

public class ReceiveAndReturn{
	public static void display(String message){
		System.out.println(message);
	}
	
	public static int giveMeFive(){
		int five = 5;
		return five;
	}
	public static String reportCard(int grade){
		String report = (grade >= 73) ? "passing" : "failing";
		return report;
	}

	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		display("Here's a message for you.\n");

		int number = giveMeFive();
		display("Here's what I got from giveMeFive(): "+ number);
		
		display("\nEnter a 2 digit grade value and I'll tell you if your failing or passing:");
		int grade = scnr.nextInt();
		display("You are "+reportCard(grade));
	}
}

