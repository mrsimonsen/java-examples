/*String Methods
Demonstrates come common string methods*/

public class StringMethods{
	public static void main(String[] args){
		String str = "May the Force be with you.";
		System.out.println(str);
		System.out.print("\nIndex of 'b': ");
		System.out.println(str.indexOf('b'));
		System.out.print("\nIndex of 't': ");
		System.out.println(str.indexOf('t'));
		System.out.print("\nIndex of 'z': ");
		System.out.println(str.indexOf('z'));
		System.out.print("\nIndex of \"or\": ");
		System.out.println(str.indexOf("or"));
		System.out.print("\nNext index of 't' after index 5: ");
		System.out.println(str.indexOf('t', 5));
		System.out.print("\nLast Index of 'o': ");
		System.out.println(str.lastIndexOf('o'));
		System.out.print("\nSubstring from 4 to 7: ");
		System.out.println(str.substring(4,7));
		System.out.print("\nSubstring of the last 4 characters: ");
		System.out.println(str.substring(str.length()-4,str.length()));
	}
}

