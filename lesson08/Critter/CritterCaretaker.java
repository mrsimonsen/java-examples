/*Critter Caretaker
A virtual pet to care for*/

import java.util.Scanner;

class Critter{
	public String name;
	public int hunger;
	public int boredom;

	public Critter(){
		name = "noName";
		hunger = 0;
		boredom = 0;
	}

	public Critter(String name){
		this.name = name;
		hunger = 0;
		boredom = 0;
	}
	public Critter(String name, int hunger, int boredom){
		this.name = name;
		this.hunger = hunger;
		this.boredom = boredom;
	}

	private void passTime(){
		hunger++;
		boredom++;
	}

	private String getMood(){
		int unhappiness = hunger + boredom;
		if(unhappiness < 5){
			return "happy";
		}
		else if(unhappiness <= 10){
			return "okay";
		}
		else if(unhappiness <= 15){
			return "frustrated";
		}
		else{
			return "mad";
		}
	}

	public void talk(){
		System.out.println("I'm "+name+" and I feel "+getMood()+" now.\n");
		passTime();
	}

	public void eat(){
		System.out.println("Bruuppp. Thank you.");
		hunger -= 4;
		if(hunger<0){
			hunger = 0;
		}
		passTime();
	}

	public void play(){
		System.out.println("Wheee!");
		boredom -= 4;
		if(boredom<0){
			boredom = 0;
		}
		passTime();
	}
}

public class CritterCaretaker{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int choice = -1;

		System.out.println("What do you want to name your critter?");
		String crit_name = scnr.nextLine();
		Critter crit = new Critter(crit_name);

		while(choice != 0){
			System.out.println("\tCritter Caretaker\n\n\t0 - Quit\n\t1 - Listen to your critter\n\t2 - Feed your critter\n\t3 - Play with your critter\n");
			System.out.println("Choice:");
			choice = scnr.nextInt();

			if(choice == 0){ //exit
				System.out.println("Good-bye.");
			}
			else if(choice == 1){ //listen to your critter
				crit.talk();
			}
			else if(choice == 2){ //feed your critter
				crit.eat();
			}
			else if(choice == 3){ //play with your critter
				crit.play();
			}
			else{ //some unknown choice
				System.out.println("\nSorry, but "+choice+" isn't a valid choice");
			}
		}
	}
}

