/*Hero's Inventory 2
Demonstrates arrays*/

import java.util.Scanner;

public class HerosInventory2{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		//initialize an array with element in it
		String[] inventory = {"sword","armor","shield","healing potion"};

		System.out.println("Your items:");
		for(String item:inventory){
			System.out.println(item);
		}

		System.out.println("\nPress the enter key to contine.");
		scnr.nextLine();

		//get the length of an array
		System.out.println("You have "+inventory.length+" items in your possession.");

		System.out.println("\nPress the enter key to contine.");
		scnr.nextLine();

		//testng for membership
		for(String item:inventory){
			if(item.equals("healing potion")){
				System.out.println("You will live to fight another day.");
			}
		}

		//display one item through an index
		System.out.println("\nEnter the index number for an item in inventory:");
		int index = scnr.nextInt();
		System.out.println("At index "+index+" is "+inventory[index]);

		//concatenate two arrays
		String[] chest = {"gold", "gems"};
		System.out.println("\nYou find a chest. It contains:");
		for(String item:chest){
			System.out.println(item);
		}
		System.out.println("You add the contents of the chest to your inventory.");
		String[] inventory2 = new String[inventory.length + chest.length];
		for(int i=0;i<inventory.length;i++){
			inventory2[i] = inventory[i];
		}
		for(int i = inventory.length;i<inventory2.length;i++){
			inventory2[i] = chest[i];
		}
		System.out.println("Your inventory is now:");
		for(String item:inventory2){
			System.out.println(item);
		}
	}
}
