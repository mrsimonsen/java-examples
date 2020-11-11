/*Hero's Inventory 3.0
Demonstate ArrayLists*/

import java.util.Scanner;
import java.util.ArrayList;

public class HerosInventory3{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		//create an arraylist some some items and display with a for loop
		ArrayList<String> inventory = new ArrayList<String>();
		inventory.add("sword");
		inventory.add("armor");
		inventory.add("shield");
		inventory.add("healing potion");
		System.out.println("Your items:");
		for(String item:inventory){
			System.out.println(item);
		}
		System.out.println("\nPress the enter key to continue.");
		scnr.nextLine();

		// get the lengh of an arraylist
		System.out.println("You have "+inventory.size()+" items in your possession.");

		System.out.println("\nPress the enter key to contine.");
		scnr.nextLine();

		//test for membership with contains
		if(inventory.contains("healing potion")){
			System.out.println("You will live to fight another day.");
		}

		//display one item though an index
		System.out.println("\nEnter the index number for an item in inventory:");
		int index = scnr.nextInt();
		System.out.println("At index "+index+" is "+inventory.get(index));

		//display a slice
		System.out.println("\nEnter the index number to begin a slice:");
		int start = scnr.nextInt();
		System.out.println("Enter the index number to ed the slice:");
		int finish = scnr.nextInt();
		//flush buffer
		scnr.nextLine();
		System.out.println("inventory["+start+":"+finish+"] is "+inventory.subList(start,finish));

		System.out.println("\nPress the enter key to continue...");
		scnr.nextLine();

		//concatenate two arraylists
		ArrayList<String> chest = new ArrayList<String>();
		chest.add("gold");
		chest.add("gems");
		System.out.println("You find a chest which contains:");
		System.out.println(chest);
		System.out.println("You add the contents of the chest to your inventory.");
		inventory.addAll(chest);
		System.out.println("Your inventory is now:");
		System.out.println(inventory);
		
		System.out.println("\nPress the enter key to continue...");
		scnr.nextLine();

		//assign by index
		System.out.println("You trade your sword for a crossbow.");
		inventory.set(0,"crossbow");
		System.out.println("Your inventory is now:");
		System.out.println(inventory);

		System.out.println("\nPress the enter key to contine...");
		scnr.nextLine();

		//remove by index and by object
		System.out.println("You use your gold and gems to buy an orb of future telling.");
		for(int i=0;i<2;i++){
			inventory.remove(inventory.size()-1);
		}
		inventory.add("orb of future telling");
		System.out.println("Your inventory is now:");
		System.out.println(inventory);

		System.out.println("\nPress the enter key to contine...");
		scnr.nextLine(); 
		System.out.println("In a great battle, your shield is destroyed.");
		inventory.remove("shield");
		System.out.println("Your inventory is now:");
		System.out.println(inventory);

		System.out.println("\nPress the enter key to contine...");
		scnr.nextLine(); 
		System.out.println("Your crossbow and armor are stolen by thieves.");
		inventory.remove("crossbow");
		inventory.remove("armor");
		System.out.println("Your inventory is now:");
		System.out.println(inventory);
	}
}

