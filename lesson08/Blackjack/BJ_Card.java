import java.util.ArrayList;
import java.util.Arrays;

public class BJ_Card{
	final public static ArrayList<String> RANKS = new ArrayList<String>(
		Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K"));
	final public static ArrayList<String> SUITS = new ArrayList<String>(Arrays.asList("c","d","h","s"));
	final public static int ACE_VALUE = 1;
	public String rank;
	public String suit;
	public boolean isFaceUp;

	public BJ_Card(String rank, String suit){
		this.rank = rank;
		this.suit = suit;
		isFaceUp = true;
	}

	public String toString(){
		if(this.isFaceUp){
			return this.rank+this.suit;
		}
		else{
			return "XX";
		}
	}

	public void flip(){
		this.isFaceUp = ! this.isFaceUp;
	}

	public int value(){
		int v = 0;
		if(this.isFaceUp){
			v = BJ_Card.RANKS.indexOf(this.rank)+1;
			if(v > 10){
				v = 10;
			}
			else{
				v = 0;
			}
		}
		return v;
	}
}
