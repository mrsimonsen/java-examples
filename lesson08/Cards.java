/*Cards Library
Basic classes for a game with playing cards*/

import java.util.ArrayList;
import java.util.Collections;

class Card{
	final static String[] RANKS ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	final static String[] SUITS ={"c","d","h","s"};
	public String rank;
	public String suit;
	public boolean isFaceUp;

	public Card(String rank, String suit, boolean faceUp){
		this.rank = rank;
		this.suit = suit;
		this.isFaceUp = faceUp;
	}
	public Card(String rank, String suit){
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
}

class Hand{
	public ArrayList<Card> cards;

	public Hand(){
		this.cards = new ArrayList<Card>();
	}

	public String toString(){
		String rep = "";
		if(!this.cards.isEmpty()){
			for(Card card:cards){
				rep+= card.toString()+" ";
			}
		}
		else{
			rep = "<empty>";
		}
		return rep;
	}

	public void add(Card card){
		this.cards.add(card);
	}

	public void give(Card card, Hand otherHand){
		this.cards.remove(card);
		otherHand.add(card);
	}
}

class Deck extends Hand{
	public ArrayList<Card> cards;

	public Deck(){
		super();
	}

	public void populate(){
		for(String suit:Card.SUITS){
			for(String rank:Card.RANKS){
				this.add(new Card(rank,suit));
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(this.cards);
	}

	public void deal(Hand[] hands, int perHand){
		Card topCard;
		for(int i=0;i<perHand;i++){
			for(Hand hand:hands){
				if(! this.cards.isEmpty()){
					topCard = this.cards.get(0);
					this.give(topCard, hand);
				}
				else{
					System.out.println("Can't continue deal. Out of cards!");
				}
			}
		}
	}
}

public class Cards{
	public static void main(String[] args){
		System.out.println("This is a library with classes for playing cards.");
	}
}

