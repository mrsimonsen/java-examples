/*Password
Demonstrates the if statement and string comparison*/

import java.util.Scanner;

public class Password{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to System Security Inc.");
		System.out.println("-- where security is our middle name\n");

		System.out.println("Enter your password:");
		String password = scnr.nextLine();

		if (password.equals("secret")){
		    System.out.println("Access Granted");
		}
	}
}

