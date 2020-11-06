/*Quotation Manipulation
Demonstartes string methods*/

public class QuotationManipulation{
	public static void main(String[] args){
		//Quote from IBM Chairman, Thomas Watson, in 1943
		String quote = "I think there is a world market for maybe five computers.";

		System.out.println("Orifinal quote:");
		System.out.println(quote);

		System.out.println("\nIn uppercase:");
		System.out.println(quote.toUpperCase());

		System.out.println("\nIn lowercase:");
		System.out.println(quote.toLowerCase());

		System.out.println("\nWith a minor replacement:");
		System.out.println(quote.replace("five","millions of"));

		System.out.println("\nOriginal quote is still:");
		System.out.println(quote);
	}
}

