/*Useless Trivia
Gets personal information from the user and then
prints true but useless information about them*/

import java.util.Scanner;

public class UselessTrivia{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String name;
		int age;
		double weight;

		System.out.println("Hi. What's your name?");
		name = scnr.nextLine();
		System.out.println("How old are you?");
		age = scnr.nextInt();
		System.out.println("Okay, last question. How many pounds do you weight?");
		weight = scnr.nextDouble();

		System.out.println("\nIf poet ee cummings were to email you, he'd address you as " + name.toLowerCase());
		System.out.println("But if ee were mad, he'd call you " + name.toUpperCase());

		String called = name.repeat(5);
		System.out.println("\nIf a small child were trying to get your attention your name would become: " + called);

		int seconds = age * 365 * 24 * 60 * 60;
		System.out.println("\nYou're over " + seconds + " seconds old.");

		double moonWeight = weight / 6;
		System.out.println("\nDid you know that on the moon you would weigh only " + moonWeight + " pounds?");
		double sunWeight = weight * 27.1;
		System.out.println("On the sun, you'd weight " + sunWeight + " (but, ah... not for long).");
	}
}

