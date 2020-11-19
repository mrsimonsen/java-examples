/*Format It
Demonstrated printf() formatting*/

public class FormatIt{
	public static void main(String[] args){
		double myFloat = 12.34;
		int myInt = 301;
		String myString = "Formatting";

		//Formatting Floating-point Numbers
		//width
		System.out.printf("Value: %7.2f\n", myFloat);
		System.out.printf("%.4f\n",myFloat);
		//precision
		System.out.printf("%3.4e\n",myFloat);
		System.out.printf("%+f\n",myFloat);
		//flags
		System.out.printf("%08.2f\n",myFloat);


		//Formatting Integers
		//width
		System.out.printf("Value: %7d\n",myInt);
		System.out.printf("%+d\n",myInt);
		//flags
		System.out.printf("%08d\n",myInt);
		System.out.printf("%+08d\n",myInt);


		//Formatting Strings
		//width
		System.out.printf("%20s String\n", myString);
		//precision
		System.out.printf("%.6s\n",myString);
		//flags
		System.out.printf("%-20s String\n",myString);

	}
}

