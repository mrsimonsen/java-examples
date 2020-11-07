/*Finicky Counter
Demonstrates the break and continue statements*/

public class FinickyCounter{
	public static void main(String[] args){
		int count = 0;
		while (true){
			count ++;
			//end loop if count greater than 10
			if (count > 10){
				break;
			}
			//skip 5
			if (count == 5){
				continue;
			}
			System.out.println(count);
		}
	}
}

