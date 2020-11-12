/*Simple Critter
Demonstrates a basic class and object*/

class Critter{
	public void talk(){
		System.out.println("Hi. I'm an instance of class Critter.");
	}
}

public class SimpleCritter{
	public static void main(String[] args){
		Critter crit = new Critter();
		crit.talk();
	}
}
