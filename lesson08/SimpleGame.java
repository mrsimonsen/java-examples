/*Simple Game
Demonstrates importing libraries*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGame{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		char again = 'y';
		ArrayList<Games> players = new ArrayList<Games>();
		int num;
		int score;
		String name;

		while(again != 'n'){
			players.clear();
			num = Games.askNumber("How many players? (2 - 5):", 2, 5, scnr);

			for(int i=0; i<num; i++){
				System.out.println("Player name:");
				name = scnr.nextLine();
				score = rand.nextInt(100)+1;
				players.add(new Games(name, score));
			}
			System.out.println("\nHere are the game results:");
			for(Games player:players){
				System.out.println(player);
			}
			again = Games.askYesNo("\nDo you want to play again? (y/n):", scnr);
		}
		System.out.println("Goodbye");
	}
}

