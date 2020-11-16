/*Playing Cards 2
Deomnstrates inheritance - class extension*/

import java.util.ArrayList;
import java.util.Collections;

class Card{
	static final String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static final String[] SUITS = {"c","d","h","s"};
	public String rank;
	public String suit;

	public Card(String rank, String suit){
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

class Deck extends Hand{
	public void populate(){
		for(String suit: Card.SUITS){
			for(String rank: Card.RANKS){
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
			for(Hand hand: hands){
				if(! cards.isEmpty()){
					topCard = cards.get(0);
					this.give(topCard, hand);
				}
				else{
					System.out.println("Can't continue to deal. Out of card!");
				}
			}
		}
	}
}

public class PlayingCards2{
	public static void main(String[] args){
		Deck deck1 = new Deck();
		System.out.println("Created a new deck.");
		System.out.println("Deck:");
		System.out.println(deck1);

		deck1.populate();
		System.out.println("\nPopulated the deck.");
		System.out.println("Deck:");
		System.out.println(deck1);

		deck1.shuffle();
		System.out.println("\nShuffled the deck.");
		System.out.println("Deck:");
		System.out.println(deck1);

		Hand myHand = new Hand();
		Hand yourHand = new Hand();
		Hand[] hands = {myHand, yourHand};
		deck1.deal(hands, 5);
		System.out.println("\nDealt 5 cards to my hand and your hand.");
		System.out.println("My hand:");
		System.out.println(myHand);
		System.out.println("Your Hand:");
		System.out.println(yourHand);
		System.out.println("Deck:");
		System.out.println(deck1);

		deck1.clear();
		System.out.println("\nCleared the deck.");
		System.out.println("Deck: "+deck1);
	}
}

