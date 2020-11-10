/*Instructions
Demonstrates programmer-created functions*/

public class Instructions{
	public static void instructions(){
		/**
		*Displays game instructions.
		**/
		System.out.println("\nWelcome to the greatest intellectual challenge of all time: Tic-Tac-Toe.");
		System.out.println("This will be a showdown between your human branc and my silicon processor.\n");
		System.out.println("You will make your move know by entering a number, 0 - 8/. The number\n will correspond to the board position as illustrated:\n");
		System.out.println("\t\t0 | 1 | 2\n\t\t--------\n\t\t3 | 4 | 5\n\t\t---------\n\t\t6 | 7 | 8\n");
		System.out.println("Prepare yourself, human. The ultimate battle is about to begin.\n");
	}


	public static void main(String[] args){
		System.out.println("Here are the instructions to the Tic-Tac-Toe game:");
		instructions();	
		System.out.println("Here they are again:");
		instructions();
		System.out.println("You probably understand the game by now.");
	}
}

