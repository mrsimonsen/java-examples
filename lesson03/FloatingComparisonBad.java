/*Floating-point number Comparison Bad
This program demonstrates the problem with comparing floating-point
numbers directly.*/

public class FloatingComparisonBad{
	public static void main(String[] args){
		double x = 0.12345;
		double y = 0.000006;
		double z = 0.123456;

		System.out.println("Adding " + y + " to " + x);
		x += y;//should be 0.123456
		System.out.println("x = " + x);
		System.out.println("x == z --> " + (x==z));
	}
}

