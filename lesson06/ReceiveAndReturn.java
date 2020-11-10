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

	public static String askYesNo(String question, Scanner scnr){
		String response = null;
		String[] possible  = {"y", "n"};
		boolean accepted = false;
		while(!accepted){
			System.out.println(question);
			response = scnr.nextLine();
			for(String r:possible){
				if (response.equals(r)){
					accepted = true;
					break;
				}
			}
		}
		return response;
	}

	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		display("Here's a message for you.\n");

		int number = giveMeFive();
		display("Here's what I got from giveMeFive(): "+ number);

		String answer = askYesNo("\nPlease enter 'y' or 'n':",scnr);
		display("Thanks for entering: "+answer);
	}
}

