/*Private Critter
Demonstrate private variables and methods*/

class Critter{
	public String name; //public attribute
	private String mood; //private attribute

	public Critter(){
		name = "noName";
		mood = "noMood";
	}

	public Critter(String name, String mood){
		this.name = name;
		this.mood = mood;
	}

	public void talk(){
		System.out.println("\nI'm "+name+"\nRight now I feel "+mood);
	}

	private void privateMethod(){
		System.out.println("This is a private method");
	}

	public void publicMethod(){
		System.out.println("This is a public method.");
		privateMethod();
	}
}

class PrivateCritter{
	public static void main(String[] args){
		Critter crit = new Critter("Poochie", "happy");
		crit.talk();
		crit.publicMethod();
	}
}

