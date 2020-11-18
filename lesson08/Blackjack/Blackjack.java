/*Blackjack From 1 to 7 players compete against a dealer*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Blackjack{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		System.out.println("\t\tWelcome to Blackjack!\n");

		int number = Games.askNumber("How many players? (1 - 7):",1,8, scnr);
		String[] names = new String[number];
		String name;
		for(int i=0;i<number;i++){
			System.out.println("Enter player name:");
			name = scnr.nextLine();
			names[i] = name;
		}
		System.out.println();

		BJ_Game game = new BJ_Game(names);

		char again = 'y';
		while(again != 'n'){
			game.play(scnr);
			again = Games.askYesNo("\nDo you want to play again?", scnr);
		}
	}
}
