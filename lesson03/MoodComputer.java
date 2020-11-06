/*Mood Computer
Deomnstrates switch statements.*/

import java.util.Random;

public class MoodComputer{
	public static void main(String[] args){
		Random rand = new Random();
		System.out.println("I sense your energy.  Your true emotions are coming across my screen.");
		System.out.println("You are...");

		int mood = rand.nextInt(3);

		switch(mood){
		case 0:
			// happy
			System.out.println("-----------");
			System.out.println("|         |");
			System.out.println("| O    O  |");
			System.out.println("|   <     |");
			System.out.println("|         |");
			System.out.println("| .     . |");
			System.out.println("|  `...`  |");
			System.out.println("-----------");
			break;
		case 1:
			// neutral
			System.out.println("-----------");
			System.out.println("|         |");
			System.out.println("| O    O  |");
			System.out.println("|   <     |");
			System.out.println("|         |");
			System.out.println("| ------  |");
			System.out.println("|         |");
			System.out.println("-----------");
			break;
		case 2:
		// sad
			System.out.println("-----------");
			System.out.println("|         |");
			System.out.println("| O    O  |");
			System.out.println("|   <     |");
			System.out.println("|         |");
			System.out.println("|  .'.    |");
			System.out.println("| '   '   |");
			System.out.println("-----------");
			break;
		default:
			System.out.println("Illegal mood value!  (You must be in a really bad mood).");
			break;
		}
		System.out.println("...today.");
	}
}

