/*Hangman

 The classic game of Hangman.  The computer picks a random word
 and the player wrong to guess it, one letter at a time.  If the player
 can't guess the word in time, the little stick figure gets hanged.*/

// imports
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Hangman{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		// constants
		final String[] HANGMAN = {
		"\n ------\n |    |\n |\n |\n |\n |\n |\n |\n |\n----------\n",
		"\n ------\n |    |\n |    O\n |\n |\n |\n |\n |\n |\n----------\n",
		"\n ------\n |    |\n |    O\n |   -+-\n |\n |\n |\n |\n |\n----------\n",
		"\n ------\n |    |\n |    O\n |  /-+-\n |\n |\n |\n |\n |\n----------\n",
		"\n ------\n |    |\n |    O\n |  /-+-/\n |\n |\n |\n |\n |\n----------\n",
		"\n ------\n |    |\n |    O\n |  /-+-/\n |    |\n |\n |\n |\n |\n----------\n",
		"\n ------\n |    |\n |    O\n |  /-+-/\n |    |\n |    |\n |   | \n |   | \n |\n----------\n",
		"\n ------\n |    |\n |    O\n |  /-+-/\n |    |\n |    |\n |   | |\n |   | |\n |\n----------\n"};
		final int MAX_WRONG = HANGMAN.length - 1;
		final String[] WORDS = {"OVERUSED", "CLAM", "GUAM", "TAFFETA", "JAVA"};

		//initialize variables
		String word = WORDS[rand.nextInt(WORDS.length)]; // the word to be guessed
		String soFar = "-".repeat(word.length()); // one dash for each letter in word to be guessed
		int wrong = 0; // number of wrong guesses player has made
		ArrayList<String> used = new ArrayList<String>(); // letters already guessed
		String guess;
		int index;
		int next;
		boolean another = false;

		System.out.println("Welcome to Hangman.  Good luck!");

		while(wrong < MAX_WRONG && !soFar.equals(word)){
			System.out.println(HANGMAN[wrong]);
			System.out.println("\nYou've used the following letters:\n"+used);
			System.out.println("\nSo far, the word is:\n"+soFar);

			System.out.println("\n\nEnter your guess:");
			guess = scnr.nextLine().toUpperCase();

			while(used.contains(guess)){
				System.out.println("You've already guessed the letter "+guess);
				System.out.println("Enter your guess:");
				guess = scnr.nextLine().toUpperCase();
			}

			used.add(guess);

			index = word.indexOf(guess);
			if(index>=0){
				System.out.println("\nYes! "+guess+" is in the word!");
				another = true;
			}
			else{
				System.out.println("\nSorry, "+guess+" isn't in the word.");
				wrong++;
			}
			while(another){
				// create a new soFar to include guess
				soFar = soFar.substring(0,index)+guess+soFar.substring(index+1,word.length());
				next = word.indexOf(guess,index+1);
				if(next>0){
					index = next;
				}
				else{
					another = false;
				}
			}
		}
		if(wrong == MAX_WRONG){
			System.out.println(HANGMAN[wrong]);
			System.out.println("\nYou've been hanged!");
		}
		else{
			System.out.println("\nYou guessed it!");
			System.out.println("\nThe word was "+word);
		}
	}
}

