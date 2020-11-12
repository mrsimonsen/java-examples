/*Attribute Critter
Demonstrates creating and accessing object attributes, constructor overloading*/

class Critter{
	String name;

	public Critter(){
		name = "NoName";
	}

	public Critter(String name){
		this.name = name;
		System.out.println("A new Critter has been born!");
	}
	
	public String toString(){
		String rep = "Critter Object\n";
		rep += "name: "+this.name;
		return rep;
	}

	public void talk(){
		System.out.println("Hi. I'm "+this.name);
	}
}

public class AttributeCritter{
	public static void main(String[] args){
		Critter crit1 = new Critter("Poochie");
		crit1.talk();
		Critter crit2 = new Critter("Randolph");
		crit2.talk();
		System.out.println("Printing crit1:");
		System.out.println(crit1);
		System.out.println("Directly accessing crit1.name");
		System.out.println(crit1.name);
	}
}
