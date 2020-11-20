/*Write It
Deomonstartes writing to a text file*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteIt{
	public static void main(String[] args){
		File file;
		Scanner reader;
		PrintWriter writer;
		FileWriter append;
		try{
			System.out.println("Creating a text file.");
			file = new File("write_it.txt");
			writer = new PrintWriter(file);
			writer.println("Line 1");
			writer.println("This is line 2");
			writer.println("That makes this line 3");
			writer.close();//closing saves the file
		
			System.out.println("\nReading the newly created file.");
			reader = new Scanner(file);
			String text = reader.nextLine();
			while(reader.hasNextLine()){
				text += "\n"+reader.nextLine();
			}
			reader.close();
			System.out.println(text);
		
			System.out.println("\nAppending to an existing file.");
			append = new FileWriter(file, true);//append = true, don't overwrite
			writer = new PrintWriter(append);
			writer.println("Another makes line 4");
			writer.close();

			System.out.println("\nReading the appended file.");
			reader = new Scanner(file);
			text = reader.nextLine();
			while(reader.hasNextLine()){
				text += "\n"+reader.nextLine();
			}
			System.out.println(text);
		}
		catch(FileNotFoundException e){
			System.out.println("Couldn't open the file\n"+e);
		}
		catch(IOException e){
			System.out.println("Couldn't append to file\n"+e);
		}
	}
}

