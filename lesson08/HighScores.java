/*High Scores
Deomstrates ArrayList methods*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HighScores{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int choice = -1;
		int score;

		while(choice != 0){
			System.out.println("\tHigh Scores\n");
			System.out.println("\t0 - Exit");
			System.out.println("\t1 - Show Scores");
			System.out.println("\t2 - Add a Score");
			System.out.println("\t3 - Remove a Score");
			System.out.println("\t4 - Sort Scores\n");

			System.out.println("Choice:");
			choice = scnr.nextInt();
			System.out.println();
			switch(choice){
				case 0: //exit
					System.out.println("Goodbye.");
					break;
			
				case 1: //list high-score table
					System.out.println("High Scores");
					for(int s:scores){
						System.out.println(s);
					}
					break;
				case 2: //add a score
					System.out.println("What score did you get?");
					score = scnr.nextInt();
					scores.add(score);
					break;
				case 3: //remove a score
					System.out.println("Remove which score?");
					score = scnr.nextInt();
					Integer s = Integer.valueOf(score);
					if(scores.contains(s)){
						scores.remove(s);
					}
					else{
						System.out.println(score+" isn't in the high scores list.");
					}
					break;
				case 4: //sort scores
					Collections.sort(scores);
					Collections.reverse(scores);
					break;
				default: //some unknown choice
					System.out.println("Sorry, but "+choice+" isn't a valid choice.");
					break;
			}
		}
	}
}

