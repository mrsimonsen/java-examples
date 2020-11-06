/*Craps Roller 
Demonstrates random number generation*/

import java.util.Random;

public class CrapsRoller{
	public static void main(String[] args){
		Random rand = new Random();
		//generate random numbers 1 - 6
		int die1 = rand.nextInt(6) + 1;
		int die2 = rand.nextInt(6) + 1;
		
		int total = die1 + die2;
		System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + total);
	}
}

