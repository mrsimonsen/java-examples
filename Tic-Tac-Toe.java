/*Tic-Tac-Toe
Plays the game of tic-tac-toe against a human opponent*/

import java.util.Scanner;

public class Tic-Tac-Toe{
	// global constatns
	static final char X = "X";
	static final char O = "O";
	static final char EMPTY = " ";
	static final String TIE = "TIE";
	static final int NUM_SQUARES = 9;

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

	public static String[] newBoard(){
		String[] board = new String[NUM_SQUARES];
		for(int i=0; i<NUM_SQUARES; i++){
			board[i] = EMPTY;
		}
		return board;
	}

	public static void displayBoard(String[] board){
		System.out.println("\n\t"+board[0]+"|"+board[1]+"|"+board[2]);
		System.out.println("\t---------");
		System.out.println("\n\t"+board[3]+"|"+board[4]+"|"+board[5]);
		System.out.println("\t---------");
		System.out.println("\n\t"+board[6]+"|"+board[7]+"|"+board[8]);
		System.out.println();
	}

	public static String[] legalMoves(String[] board){
		int[] moves = new int[NUM_SQUARES];
		for(int i=0; i<NUM_SQUARES; i++){
			if(board[i].equals(EMPTY)){
				moves[i] = i;
		}
	}
}

