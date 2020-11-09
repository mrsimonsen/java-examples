/*No Vowels
Demonstrates creating new strings with a for loop*/

import java.util.Scanner;

public class NoVowels{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		final String VOWELS = "aeiou";
		String newMessage = "";

		System.out.println("Enter a message:");
		String message = scnr.nextLine();
		for(int i=0;i<message.length();i++){
			char letter = message.charAt(i);
			if(VOWELS.indexOf(Character.toLowerCase(letter))<0){
				newMessage += letter;
				System.out.println("A new string has been created: "+newMessage);
			}
		}
		System.out.println("\nYour message without vowels is: "+newMessage);
	}
}

