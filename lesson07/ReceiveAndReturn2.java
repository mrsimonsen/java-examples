/*Receive and Return
Demonstrates sending scanners and method overloading*/

import java.util.Scanner;

public class ReceiveAndReturn2{
	public static char askYesNo(String question, Scanner scnr){
		char response = 'a';
		char[] possible  = {'y','n'};
		boolean accepted = false;
		while(!accepted){
			System.out.println(question);
			response = scnr.nextLine().charAt(0);
			for(char r:possible){
				if (response==r){
					accepted = true;
					break;
				}
			}
		}
		return response;
	}

	public static String askYesNo(Scanner scnr){
		String response = "a";
		String[] possible = {"yes","no"};
		boolean accepted = false;
		while(!accepted){
			System.out.println("yes or no?");
			response = scnr.nextLine();
			for(String r:possible){
				if(response.equals(r)){
					accepted = true;
					break;
				}
			}
		}
		return response;
	}

	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		char a = askYesNo("\nPlease enter 'y' or 'n':",scnr);
		System.out.println("Thanks for entering: "+a);
		String answer = askYesNo(scnr);
		System.out.println("Thanks for entering: "+answer);
	}
}

