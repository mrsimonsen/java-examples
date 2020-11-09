/*Counter
Demonstrates the for loop*/

public class Counter{
	public static void main(String[] args){
		System.out.println("Counting:");
		for (int i=0;i<10;i++){
			System.out.print(i + " ");
		}
		System.out.println("\n\nCounting by fives:");
		for(int i=0;i<50;i+=5){
			System.out.print(i+" ");
		}
		System.out.println("\n\nCounting backwards:");
		for(int i=10; i>0; i--){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
