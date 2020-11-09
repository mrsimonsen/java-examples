/*Guess My Number
The computer picks a random number between 1 and 100
The player tries to guess it and the computer les the player know if the guess is too high, too low or right on the money
*/

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner scnr = new Scanner(System.in);

		System.out.println("\tWelcome to 'Guess My Number!'");
		System.out.println("\nI'm thinking of a number between 1 and 100.");
		System.out.println("Try to guess it in as few tries as possible.\n");
		
		// set the initial values
		int theNumber = rand.nextInt(100)+1;
		System.out.println("Take a guess:");
		int guess = scnr.nextInt();
		int tries = 1;
		
		//guessing loop
		while(guess != theNumber){
			if(guess > theNumber){
				System.out.println("Lower...");
			}
			else{
				System.out.println("Higher...");
			}
			System.out.println("Take a guess:");
			guess = scnr.nextInt();
			tries ++;
		}

		System.out.println("You guess it! The number was "+theNumber+"!");
		System.out.println("And it only took you "+tries+" tries!");
	}
}
