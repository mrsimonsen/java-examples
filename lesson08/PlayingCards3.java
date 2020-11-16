/* Playing Cards 3
Demonstrates inheritance - overriding methods*/

class Card{
	final static String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	final static String[] SUITS = {"c","d","h","s"};
	public String rank;
	public String suit;

	public Card(String rank, String suit){
		this.rank = rank;
		this.suit = suit;
	}
	@Override
	public String toString(){
		String rep = this.rank+this.suit;
		return rep;
	}
}

class UnprintableCard extends Card{
	public UnprintableCard(String rank, String suit){
		super(rank, suit);
	}
	public String toString(){
		return "<unprintable>";
	}
}

class PositionableCard extends Card{
	public boolean isFaceUp;

	public PositionableCard(String rank, String suit){
		super(rank, suit);
		this.isFaceUp = true;
	}

	@Override
	public String toString(){
		String rep;
		if(isFaceUp){
			rep = super.toString();
		}
		else{
			rep = "XX";
		}
		return rep;
	}

	public void flip(){
		this.isFaceUp = !this.isFaceUp;
	}
}

public class PlayingCards3{
	public static void main(String[] args){
		Card card1 = new Card("A","c");
		UnprintableCard card2 = new UnprintableCard("A","d");
		PositionableCard card3 = new PositionableCard("A","h");

		System.out.println("Printing a card object:");
		System.out.println(card1);

		System.out.println("\nPrinting an UnprintableCard object:");
		System.out.println(card2);


		System.out.println("\nPrinting a PositionableCard object:");
		System.out.println(card3);
		System.out.println("Flipping the PositionableCard object.");
		card3.flip();
		System.out.println("Printing the PositionableCard object:");
		System.out.println(card3);
	}
}

