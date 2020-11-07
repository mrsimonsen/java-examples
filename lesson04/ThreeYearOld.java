/*Three Year-Old Simulator
Demonstrates the while loop*/

import java.util.Scanner;

public class ThreeYearOld{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		System.out.println("\tWelcome to the 'Three-Year-Old Simulator'\n");
		System.out.println("This program simulates a conversation with a three-year-old child.");
		System.out.println("Try to stop the madness.\n");

		String response = "";
		while (! response.equals("Because.")){
		    System.out.println("Why?");
			response = scnr.nextLine();
		}
		System.out.println("Oh.  Okay.");
	}
}

