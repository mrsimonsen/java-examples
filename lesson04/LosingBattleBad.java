/*Losing Battle - bad
Demonstrates the dreaded infinite loop */

public class LosingBattleBad{
	public static void main(String[] args){
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life.\n");
		
		int health = 10;
		int trolls = 0;
		int damage = 3;
		
		while (health != 0){
			trolls += 1;
			health -= damage;
		    System.out.print("Your hero swings and defeats an evil troll, ");
			System.out.println("but takes " + damage + "damage points.\n");
		}
		System.out.println("Your hero fought valiantly and defeated "+trolls+" trolls.");
		System.out.println("But alas, your hero is no more.");
	}
}

