/*Simple Game
Demonstrates importing libraries*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import Games;

public class SimpleGame{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		char again = 'y';
		ArrayList<Integer> players = new ArrayList<Integer>;
		int num;
		int score;

		while(again != 'n'){
			players.clear();
			num = Games.askNumber("How many players? (2 - 5):", 2, 5);

		}

	}
}

