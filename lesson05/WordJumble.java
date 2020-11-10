/*Word Jumble
The computer picks a random word and then "jumbles" it
The player has to guess the original word*/

import java.util.Scanner;
import java.util.Random;

public class WordJumble{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

		//create a sequence of words to choose from
		String[] WORDS = {"java", "jumble", "easy", "difficult", "answer", "xylophone"};
		//pick one word randomly from the sequence
		int index = rand.nextInt(WORDS.length);
		String word = WORDS[index];
		//create a variable to use later to see if the guess is correct
		String correct = word;
		
		//create a jumbled version of the word
		String jumble = "";
		while(word.length()>0){ //while there are letters left in the word
			index = rand.nextInt(word.length()); // get a random index position
			jumble += word.charAt(index); //add that letter to the jumble
			word = word.substring(0,index) + word.substring(index+1,word.length()); // remove that letter from the word
		}
		//start the game
		System.out.println("\t\tWelcome to Word Jumble!\n");
		System.out.println("\tUnscramble the letters to make a word.");
		System.out.println("(Press the enter key at the prompt to quit.)");

		System.out.println("The jumble is: "+jumble);
		System.out.println("\nYour guess:");
		String guess = scnr.nextLine();

		while(!guess.equals(correct) && !guess.equals("")){
			System.out.println("Sorry, that's not it.");
			System.out.println("Your guess:");
			guess = scnr.nextLine();
		}
		if(guess.equals(correct)){
			System.out.println("That's it! You guessed it!\n");
		}
		System.out.println("Thanks for playing.");
	}
}

