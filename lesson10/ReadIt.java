/*Read It
Demonstrates reading from a text file*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadIt{

	public static void main(String[] args){
		Scanner reader;
		File file;
		String f = "read_it.txt"; //file name

		System.out.println("Opening and closing the file.");
		try{
			file = new File(f);
			reader = new Scanner(file);
			reader.close();

			System.out.println("\nReading words from a line.");
			reader = new Scanner(file);
			System.out.println(reader.next());
			System.out.println(reader.next());
			reader.close();

			System.out.println("\nReading one line at a time.");
			reader = new Scanner(file);
			System.out.println(reader.nextLine());
			System.out.println(reader.nextLine());
			reader.close();

			System.out.println("\nReading the entire file at once.");
			reader = new Scanner(file);
			reader.useDelimiter("\\Z");
			System.out.println(reader.next());
			reader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Can't find"+f);
		}
	}
}

