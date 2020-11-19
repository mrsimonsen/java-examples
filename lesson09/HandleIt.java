/*Handle It
Demonstrates handling exceptions*/

import java.util.Scanner;

public class HandleIt{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String response;
		Double num;
		//Basic try/catch
		try{
			System.out.println("Enter a number:");
			response = scnr.nextLine();
			num = Double.valueOf(response);
		}
		catch(Exception e){
			System.out.println("Something went wrong!");
		}

		//specifying exception type
		try{
			System.out.println("Enter a number:");
			response = scnr.nextLine();
			num = Double.valueOf(response);
		}
		catch(NumberFormatException e){
			System.out.println("That was not a number!");
		}

		//Handle multiple exception types
		String[] temp = {null,"Hi!"};
		for(String i:temp){
			try{
				System.out.println("Attempting to convert "+i+" --> "+Double.valueOf(i));
			}
			catch(NumberFormatException e){
				System.out.println("I can only convert a string of digits!");
			}
			catch(NullPointerException e){
				System.out.println("I can only convert a string or a number!");
			}
		}

		//Get an exception's argument
		try{
			System.out.println("Enter a number:");
			response = scnr.nextLine();
			num = Double.valueOf(response);
		}
		catch(NumberFormatException e){
			System.out.println("That was not a number! Or as Java would say...");
			System.out.println(e);
		}
	}
}

