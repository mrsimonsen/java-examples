/*Games
Demonstrates library creation*/

import java.util.Scanner;

public class Games{
	public String name;
	public int score;

	public Games(String name, int score){
		this.name = name;
		this.score = score;
	}
	public Games(){
		name ="NoName";
		score = 0;
	}
	public String toString(){
		String rep = this.name+":\t"+this.score;
		return rep;
	}

	public static char askYesNo(String question, Scanner scnr){
		char response = 'a';
		char[] possible = {'y', 'n'};
		boolean accepted = false;
		while(!accepted){
			System.out.println(question);
			response = scnr.nextLine().charAt(0);
			for(char r:possible){
				accepted = true;
				break;
			}
		}
		return response;
	}

	public static int askNumber(String question, int low, int high, Scanner scnr){
		int response = low -1;
		while(response < low || response > high){
			System.out.println(question);
			response = scnr.nextInt();
		}
		//flush the buffer
		scnr.nextLine();
		return response;
	}

	public static void main(String[] args){
		System.out.println("You ran this library directly (and did not 'import' it).");
	}
}

