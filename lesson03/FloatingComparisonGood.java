/*Floating-point number Comparison Good
This program demonstrates the correct way to compare floating-point numbers.*/

public class FloatingComparisonGood{
	public static void main(String[] args){
		double x = 0.12345;
		double y = 0.000006;
		double z = 0.123456;

		System.out.println("Adding " + y + " to " + x);
		x += y;//should be 0.123456
		System.out.println("x = " + x);
		System.out.println("|z-x|<0.0001 --> " + (Math.abs(z-x)<0.0001));
	}
}



