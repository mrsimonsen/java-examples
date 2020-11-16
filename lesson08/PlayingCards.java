/*Playing Cards
Deomnstrates combining objects*/

import java.util.ArrayList;

class Card{
	final String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	final char[] SUITS = {'c','d','h','s'};
	public String rank;
	public char suit;

	public Card(String rank, char suit){
		this.rank = rank;
		this.suit = suit;
	}

	public String toString(){
		String rep = this.rank+this.suit;
		return rep;
	}
}

class Hand{
	public ArrayList<Card> cards;

	public Hand(){
		cards = new ArrayList<Card>();
	}

	public String toString(){
		String rep = "";
		if(! cards.isEmpty()){
			for(Card card: cards){
				rep +=card.toString()+" ";
			}
		}
		else{
			rep = "<empty>";
		}
		return rep;
	}

	public void clear(){
		this.cards.clear();
	}

	public void add(Card card){
		this.cards.add(card);
	}

	public void give(Card card, Hand otherHand){
		this.cards.remove(card);
		otherHand.add(card);
	}
}

public class PlayingCards{
	public static void main(String[] args){
		Card card1 = new Card("A",'c');
		System.out.println("Prinitng a Card Object:");
		System.out.println(card1);

		Card card2 = new Card("2",'c');
		Card card3 = new Card("3",'c');
		Card card4 = new Card("4",'c');
		Card card5 = new Card("5",'c');
		System.out.println("\nPrinting the rest of the objects individually:");
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card4);
		System.out.println(card5);

		Hand myHand = new Hand();
		System.out.println("Printing my hand before I add any cards:");
		System.out.println(myHand);

		myHand.add(card1);
		myHand.add(card2);
		myHand.add(card3);
		myHand.add(card4);
		myHand.add(card5);
		System.out.println("\nPrinting my hand after adding 5 cards:");
		System.out.println(myHand);

		Hand yourHand = new Hand();
		myHand.give(card1,yourHand);
		myHand.give(card2,yourHand);
		System.out.println("\nGave the first two cards from my hand to your hand.");
		System.out.println("Your hand:");
		System.out.println(yourHand);
		System.out.println("My hand:");
		System.out.println(myHand);

		myHand.clear();
		System.out.println("\nMy hand after clearing it:");
		System.out.println(myHand);
	}
}

