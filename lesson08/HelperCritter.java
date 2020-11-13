/*Helper Critter
Demonstrates Accessors/Getters, Mutators/Setters as private helper methods (similar to python's properties)*/

class Critter{
	private String name;

	public Critter(){
		name = "noName";
	}

	public Critter(String name){
		System.out.println("A new critter has been born!");
		this.name = name;
	}

	public void setName(String newName){
		name = namer(newName);
	}
	public String getName(){
		return this.name;
	}
	
	private String namer(String newName){
		if(newName.equals("")){
			System.out.println("A critter's name can't be an empty string.");
			return this.name;
		}
		else{
			System.out.println("Name change successful.");
			return newName;
		}
	}

	public void talk(){
		System.out.println("\nHi, I'm "+this.name);
	}
}

public class HelperCritter{
	public static void main(String[] args){
		Critter crit = new Critter("Poochie");
		crit.talk();

		System.out.println("\nMy Critter's name is: "+crit.getName());

		System.out.println("\nAttempting to change my critter's name to Randolph...");
		crit.setName("Randolph");
		System.out.println("\nMy critter's name is: "+crit.getName());

		System.out.println("\nAttempting to change my critter's name to an empty string...");
		crit.setName("");
		System.out.println("\nMy critter's name is: "+crit.getName());
	}

}

