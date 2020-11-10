/*Exclusive Network
Demonstrates logical operators and compound conditions*/

import java.util.Scanner;

public class ExclusiveNetwork{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int security = 0;
		String username;
		String password;

		System.out.println("\tExclusive Computer Network");
		System.out.println("\t\tMembers only!\n");

		System.out.print("Username: ");
		username = scnr.nextLine();
		System.out.print("\nPassword: ");
		password = scnr.nextLine();
		System.out.println();
		
		if(username.equals("M.Dawson") && password.equals("secret")){
			System.out.println("Hi, Mike.");
			security = 5;
		}
		else if(username.equals("S.Meier") && password.equals("civilization")){
			System.out.println("Hey, Sid.");
			security = 3;
		}
		else if(username.equals("S.Miyamoto") && password.equals("mariobros")){
			System.out.println("What's up, Shigeru?");
			security = 3;
		}
		else if(username.equals("W.Wright") && password.equals("thesims")){
			System.out.println("How goes it, Will?");
			security = 3;
		}
		else if(username.equals("guest") || password.equals("guest")){
			System.out.println("Welcome, guest.");
			security = 1;
		}
		else{
			System.out.println("Login failed. You're not so exclusive.\n");
		}
	}
}

