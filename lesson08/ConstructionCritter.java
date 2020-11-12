/*Construction Critter
Demonstrates constructors*/

class Critter{
	public Critter(){
		System.out.println("A new critter has been born!");
	}
	public void talk(){
		System.out.println("\nHi. I'm an instance of class Critter.");
	}
}

public class ConstructionCritter{
	public static void main(String[] args){
		Critter crit1 = new Critter();
		Critter crit2 = new Critter();

		crit1.talk();
		crit2.talk();
	}
}
