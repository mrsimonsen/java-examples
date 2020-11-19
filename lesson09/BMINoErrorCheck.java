//BMI Claculator with no error checking

import java.util.Scanner;

public class BMINoErrorCheck{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int weightVal;	//User defined weight (lbs)
		int heightVal;	//User defined height (in)
		float bmiCalc;	//Resulting BMI
		char quitCmd;	//Indicated quit/continue

		quitCmd = 'a';

		while(quitCmd != 'q'){
			//Get user data
			System.out.println("Enter weight (in pounds):");
			weightVal = scnr.nextInt();
			System.out.println("Enter height (in inches):");
			heightVal = scnr.nextInt();

			//Calculate BMI
			bmiCalc = ((float)weightVal/(heightVal*heightVal))*703.0f;

			//Print user healt info
			//Source: http://www.cdc.gov/
			System.out.println("BMI: "+bmiCalc);
			System.out.println("(CDC: 18.6 - 24.9 normal)");

			//Prompt user to continue/exit
			System.out.println("\nEnter any key ('q' to quit):");
			quitCmd = scnr.next().charAt(0);
		}
	}
}

