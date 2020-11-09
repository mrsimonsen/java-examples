/*Hero's Inventory
Demonstrates array creation and enhanced for loops/for-each loop*/

public class HerosInventory{
	public static void main(String[] args){
		//creates and empty array with 4 index locations
		String[] inventory = new String[4];
		
		//add items to the array
		inventory[0] = "sword";
		inventory[1] = "armor";
		inventory[2] = "shield";
		inventory[3] = "healing potion";

		//print each element in the array
		System.out.println("Your items:");
		for (String item: inventory){
			System.out.println(item);
		}
	}
}
