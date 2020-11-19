import java.util.ArrayList;
import java.util.Scanner;

public class BJ_Hand{
	public ArrayList<BJ_Card> cards;

	public BJ_Hand(){
		this.cards = new ArrayList<BJ_Card>();
	}

	public String toString(){
		String rep = "";
		if(!cards.isEmpty()){
			for(BJ_Card card:cards){
				rep+= card.toString()+" ";
			}
		}
		else{
			rep = "<empty>";
		}
		if(total()>0){
			rep += "("+total()+")";
		}
		return rep;
	}

	public void clear(){
		cards.clear();
	}

	public void add(BJ_Card card){
		cards.add(card);
	}

	public void give(BJ_Card card, BJ_Hand otherHand){
		cards.remove(card);
		otherHand.add(card);
	}

	public int total(){
		// if a card in the hand has value of 0, then total() is 0
		for(BJ_Card card:cards){
			if(card.value() == 0){
				return 0;
			}
		}
		// add up card values, treat each Ace as 1
		// also determine if there is an Ace
		int t = 0;
		boolean containsAce = false;
		for(BJ_Card card:cards){
			t += card.value();
			if(card.value() == BJ_Card.ACE_VALUE){
				containsAce = true;
			}
		}
		// if hand contains Ace and total() is low enough, treat Ace as 11
		if(containsAce && t<=11){
			//add only 10 since we're already added 1 for the Ace
			t += 10;
		}
		return t;
	}

	public boolean isBusted(){
		return total() > 21;
	}

	public boolean isHitting(Scanner scnr){
		System.out.println("I exist to be ovveridden.");
		return false;
	}

	public void bust(){
		System.out.println("I exist to be overridden.");
	}
}

