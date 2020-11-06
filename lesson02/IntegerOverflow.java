/*
Integer Overflow
Example of an integer overflow does
*/

public class IntegerOverflow{
	public static void main(String[] args){
		Integer i = Integer.MAX_VALUE;
		int j = (int) i;

		System.out.println("min int: " + Integer.MIN_VALUE);
		System.out.println("max int: " + j);
		j++;
		System.out.println("max int + 1: " + j);

	}
}

