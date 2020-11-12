/*Tic-Tac-Toe
Plays the game of tic-tac-toe against a human opponent*/

import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe{
	// global constatns
	static final char X = 'X';
	static final char O = 'O';
	static final char EMPTY = ' ';
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
		System.out.println(x);
	}
	
	public static char askYesNo(String question, Scanner scnr){
		char response = 'a';
		char[] possible = {'y','n'};
		boolean accepted = false;
		while(!accepted){
			System.out.println(question);
			response = scnr.nextLine().charAt(0);
			for(char r:possible){
				if(r == response){
					accepted = true;
					break;
				}
			}
		}
		return response;
	}

	public static Integer askNumber(String question, int low, int high, Scanner scnr){
		int response = low -1;
		while(response < low || response > high){
			System.out.println(question);
			response = scnr.nextInt();
		}
		//flush the buffer
		scnr.nextLine();
		return Integer.valueOf(response);
	}

	public static char[] pieces(Scanner scnr){
		char human;
		char computer;
		char goFirst;
		goFirst = askYesNo("Do you reuire the first move? (y/n)",scnr);
		if(goFirst=='y'){
			System.out.println("\nThen take the first move. You will need it.");
			human = X;
			computer = O;
		}
		else{
			System.out.println("\nYour bravery will be your undoing... I will go first.");
			computer = X;
			human = O;
		}
		char[] pieces = {human, computer};
		return pieces;
	}

	public static char[] newBoard(){
		char[] board = new char[NUM_SQUARES];
		for(int i=0; i<NUM_SQUARES; i++){
			board[i] = EMPTY;
		}
		return board;
	}

	public static void displayBoard(char[] board){
		System.out.println("\n\t "+board[0]+" | "+board[1]+" | "+board[2]);
		System.out.println("\t---------");
		System.out.println("\t "+board[3]+" | "+board[4]+" | "+board[5]);
		System.out.println("\t---------");
		System.out.println("\t "+board[6]+" | "+board[7]+" | "+board[8]);
		System.out.println();
	}

	public static ArrayList<Integer> legalMoves(char[] board){
		ArrayList<Integer> moves = new ArrayList<Integer>();
		for(int i=0; i<NUM_SQUARES; i++){
			if(board[i]==EMPTY){
				moves.add(i);
			}
		}
	return moves;
	}
	
	public static String winner(char[] board){
		char winner;
		final int[][] WAYS_TO_WIN = {
									{0,1,2},
									{3,4,5},
									{6,7,8},
									{0,3,6},
									{1,4,7},
									{2,5,8},
									{0,4,8},
									{2,4,6}
									};
		for(int[] row: WAYS_TO_WIN){
			if(board[row[0]]==board[row[1]] && board[row[1]]==board[row[2]] && board[row[0]]!=EMPTY){
				winner = board[row[0]];
				return String.valueOf(winner);
			}
		}
		boolean isTie = true;
		for(char c: board){
			if(c == EMPTY){
				isTie = false;
			}
		}
		if(isTie){
			return TIE;
		}
		return "none";
	}

	public static Integer humanMove(char[] board, char human, Scanner scnr){
		ArrayList<Integer> legal = legalMoves(board);
		Integer move = Integer.valueOf(-1);
		while(!legal.contains(move)){
			move = askNumber("Where will you move? (0 - 8):",0,NUM_SQUARES, scnr);
			if(!legal.contains(move)){
				System.out.println("\nThat quare is already occupied, foolish human. Choose another.\n");
			}
		}
		System.out.println("Fine...");
		return move;
	}

	public static Integer computerMove(char[] board, char computer, char human){
		//make a copy to work with since function will be changing list
		char[] temp = board.clone();
		//the best positions to have, in order
		int[] BEST_MOVES = {4,0,2,6,8,1,3,5,7};
		System.out.print("I shall take square number ");
		
		//if computer can win, take that move
		for(Integer move:legalMoves(temp)){
			temp[move] = computer;
			if(winner(temp).equals(computer)){
				System.out.println(move);
				return move;
			}
			//done checking this move, undo it
			temp[move] = EMPTY;
		}
		
		//if human can win, block that move
		for(Integer move:legalMoves(temp)){
			temp[move] = human;
			if(winner(temp).equals(human)){
				System.out.println(move);
				return move;
			}
			//done checking this move, undo it
			temp[move] = EMPTY;
		}

		//since no once can win on next move, pick best open square
		for(Integer move:BEST_MOVES){
			if(legalMoves(temp).contains(move)){
				System.out.println(move);
				return move;
			}
		}
		return Integer.valueOf(-1);
	}

	public static char nextTurn(char turn){
		if(turn==X){
			return O;
		}
		else{
			return X;
		}
	}

	public static void congratWinner(String theWinner, char computer, char human){
		if(! theWinner.equals(TIE)){
			System.out.println(theWinner+" won!\n");
		}
		else{
			System.out.println("It's a tie!\n");
		}
		if(theWinner.equals(String.valueOf(computer))){
			System.out.println("As I predicted, human, I am triumphant once more.\nProof that computers are superior to humans in all regards.");
		}
		else if(theWinner.equals(String.valueOf(human))){
			System.out.println("No, no! It cannot be! Somehow you tricked me, human.\nBut never again! I, the computer, so swear it!");
		}
		else if(theWinner.equals(TIE)){
			System.out.println("You were most lucky, human, and somhow managed to tie me.\nCelebrate today... for this is the best you will ever achieve.");
		}
	}

	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		displayInstructions();
		
		char[] p = pieces(scnr);
		char human = p[0];
		char computer = p[1];
		char turn = X;
		char[] board = newBoard();
		displayBoard(board);
		Integer move;
		
		while(winner(board).equals("none")){
			if(turn == human){
				move = humanMove(board, human, scnr);
				board[move] = human;
			}
			else{
				move = computerMove(board, computer, human);
				board[move] = computer;
			}
			displayBoard(board);
			turn = nextTurn(turn);
		}
		String theWinner = winner(board);
		congratWinner(theWinner, computer, human);
	}
}

