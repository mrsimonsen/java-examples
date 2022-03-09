import java.util.Scanner;

public class BufferFlushGood{
	public static void main(String[] args){
		Scanner scnr = new Scanner("1\n2.4\nC\nString\n");

		System.out.println(scnr.nextInt());//should be 1
		System.out.println(scnr.nextDouble());//should be 2.4
		System.out.println(scnr.next().charAt(0));//should be C
		scnr.nextLine();//flush buffer
		System.out.println(scnr.nextLine());//flush buffer
	}
}
