/*Word Problems
Demonstrates numbers and math*/

import java.util.Scanner;

public class WordProblems{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		System.out.println("If a 2000 pound pregnant hippo gives birth to a 100 pound calf but then eats 50 pounds of food, how much does she weigh?");
		System.out.println("Press the enter key to find out.");
		scnr.nextLine();
		System.out.println("2000 - 100 + 50 = " + (2000 - 100 + 50));

		System.out.println("\nIf an adventurer returns from a successful quest and buys each of 6 companions 3 bottles of ale, how many bottles are purchased?");
		System.out.println("Press the enter key to find out.");
		scnr.nextLine();
		System.out.println("6 * 3 = " + (6 * 3));

		System.out.println("\nIf a restaurant check comes to 19 dollars with tip, and you and your friends split it evenly 4 ways, how much do you each throw in?");
		System.out.println("Press the enter key to find out.");
		scnr.nextLine();
		System.out.println("19 / 4 = " + (19 / 4.0));

		System.out.println("\nIf a group of 4 pirates finds a chest full of 107 gold coins, and they divide the booty evenly, how many whole coins does each get?");
		System.out.println("Press the enter key to find out.");
		scnr.nextLine();
		System.out.println("107 // 4 = " + (107 / 4));

		System.out.println("\nIf that same group of 4 pirates evenly divides the chest full of 107 gold coins, how many coins are left over?");
		System.out.println("Press the enter key to find out.");
		scnr.nextLine();
		System.out.println("107 % 4 = " + (107 % 4));
	}
}

