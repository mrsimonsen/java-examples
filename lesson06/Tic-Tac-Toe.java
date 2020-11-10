/*Tic-Tac-Toe
Plays the game of tic-tac-toe against a human opponent*/

import java.util.Scanner;

public class Tic-Tac-Toe{
	// global constatns
	static final char X = "X";
	static final char O = "O";
	static final char EMPTY = " ";
	static final String TIE = "TIE";
	static final int NUM_SQUARWES = 9;

	public static void displayInstructions(){
		String x = "\nWelcome to the greatest intellectual challenge of all time: Tic-Tac-Toe.\n";
		x += "This will be a showdown between your human brain and my silicon processor.\n";
		x += "\nYou will make your move known by entering a number, 0 - 8.  The number \n";
		x += "will correspond to the board position as illustrated:\n\n";
		x += "\t\t0 | 1 | 2\n";
		x += "\t\t---------\n";
		x += "\t\t3 | 4 | 5\n";
		x += "\t\t---------\n";
		x += "\t\t6 | 7 | 8\n";
		x += "\nPrepare yourself, human. The ultimate battle is about to begin.\n";
		return x;
	}
	
	public static String askYesNo(String question, Scanner scnr){
		String response;
		String[] possible = {"y","n"};
		boolean accepted = false;
		while(!accepted){
			System.out.println(question);
			response = 

			for(String r: possible){
				if(r.equals(possible)){
					accepted = true;
					break;
				}
			}
		}
		return response;
	}
}

