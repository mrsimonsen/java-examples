// Personal Greeter
//Demonstrated getting user input

import java.util.Scanner;

public class PersonalGreeter{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String name;
		
		System.out.println("What is your name?");
		name = scnr.nextLine();
		System.out.println(name);
		System.out.println("Hi, " + name);
	}
}

