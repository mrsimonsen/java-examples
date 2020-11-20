/*Trivia Challenge
Trivia game that reads a plan text file*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriviaChallenge{
	public static File file;
	public static Scanner trivia;
	public static Scanner scnr;

	public static Scanner openFile(String fileName){
		trivia = null;
		try{
			file = new File(fileName);
			trivia = new Scanner(file);
		}
		catch(FileNotFoundException e){
			System.out.println("Unable to open the file"+fileName+"\ne"+"\nEnding program.");
			System.exit(0);
		}
		return trivia;
	}
	
	public static String nextLine(Scanner trivia){
		String line = trivia.nextLine();
		return line.replace('/','\n');
	}

	public static void welcome(String title){
		System.out.println("\t\tWelcome to Trivia Challenge!\n");
		System.out.println("\t\t"+title+"\n");
	}

	public static String[] block(Scanner trivia){
		String[] answers = new String[4];
		for(int i=0;i<4;i++){
			answers[i] = nextLine(trivia);
		}
		return answers;
	}
	
	public static int getNum(Scanner trivia){
		String line = nextLine(trivia);
		int num = new Scanner(line).nextInt();
		return num;
	}
	
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		trivia = openFile("trivia.txt");
		welcome(nextLine(trivia));
		int score = 0;
		int response;

		//get first block of question information
		String category = nextLine(trivia);
		String question = nextLine(trivia);
		String[] answers = block(trivia);
		int correct = getNum(trivia);
		String explanation = nextLine(trivia);

		while(trivia.hasNextLine()){
			//ask a question
			System.out.println(category);
			System.out.println(question);
			for(int i=0;i<4;i++){
				System.out.println("\t"+(i+1)+"-"+answers[i]);
			}

			//get answer
			System.out.println("What's your answer?");
			response = scnr.nextInt();
			
			//check answer
			if(response==correct){
				System.out.print("\nRight! ");
				score ++;
			}
			else{
				System.out.print("\nWrong. ");
			}
			System.out.println(explanation);
			System.out.println("Score: "+score+"\n\n");

			//get next block of question information
			category = nextLine(trivia);
			question = nextLine(trivia);
			answers = block(trivia);
			correct = getNum(trivia);
			explanation = nextLine(trivia);
		}
		trivia.close();

		System.out.println("That was the last question!");
		System.out.println("Your final score is "+score);
	}
}

