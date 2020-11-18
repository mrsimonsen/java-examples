/*Classy Critter
Demonstrates class attributes and static methods*/

class Critter{
	static int total = 0;
	public String name;
	public static void status(){
		System.out.println("\nThe total number of critters is "+Critter.total);
	}

	public Critter(){
		name = "NoName";
	}
	public Critter(String name){
		this.name = name;
		Critter.total ++;
		System.out.println("A critter has been born!");
	}
}

public class ClassyCritter{
	public static void main(String[] args){
		System.out.println("Accessing the class attribute Critter.total: "+Critter.total);

		System.out.println("\nCreating critters.");
		Critter crit1 = new Critter("critter 1");
		Critter crit2 = new Critter("critter 2");
		Critter crit3 = new Critter("critter 3");

		Critter.status();

		System.out.println("\nAccessing the class attribute through an object: "+crit1.total);
	}
}

