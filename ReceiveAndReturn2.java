/*Receive and Return
Demonstrates sending scanners and method overloading*/

import java.util.Scanner;

public class ReceiveAndReturn2{
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
		
		String answer = askYesNo("\nPlease enter 'y' or 'n':",scnr);
		System.out.println("Thanks for entering: "+answer);
	}
}

