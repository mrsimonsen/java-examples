/*BMI Calculator with error-checking 
but without exception-handling constructs*/

import java.util.Scanner;

public class BMINaiveErrorCheck{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int weightVal;	//User defined weight (lbs)
		int heightVal;	//User defined height (in)
		float bmiCalc;	//Resulting BMI
		char quitCmd;	//Indicated quit/continue
		
		weightVal = 0;
		heightVal = 0;
		quitCmd = 'a';

		while(quitCmd != 'q'){
			//Get user data
			System.out.println("Enter weight (in pounds):");
			weightVal = scnr.nextInt();

			//Error checking, non-negative weight
			if(weightVal < 0){
				System.out.println("Invalid weight.");
			}
			else{
				System.out.println("Enter height (in inches):");
				heightVal = scnr.nextInt();

				//Error checking, non-negative height
				if(heightVal < 0){
					System.out.println("Invalid height.");
				}
			}
			
			//Calculate BMI and print user health info if no input error
			if(weightVal <=0 || heightVal <= 0){
				System.out.println("Cannot compute info.");
			}
			else{
				bmiCalc = ((float)weightVal/(heightVal*heightVal))*703.0f;
				//Print user healt info
				//Source: http://www.cdc.gov/
				System.out.println("BMI: "+bmiCalc);
				System.out.println("(CDC: 18.6 - 24.9 normal)");
			}
			//Prompt user to continue/exit
			System.out.println("\nEnter any key ('q' to quit):");
			quitCmd = scnr.next().charAt(0);
		}
	}
}

