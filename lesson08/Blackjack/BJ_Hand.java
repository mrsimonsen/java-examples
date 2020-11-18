import java.util.ArrayList;

public class BJ_Hand{
	public ArrayList<BJ_Card> cards;

	public BJ_Hand(){
		this.cards = new ArrayList<BJ_Cards>();
	}

	public String toString(){
		String rep = "";
		if(!this.cards.isEmpty()){
			for(BJ_Card card:cards){
				rep+= card.toString()+" ";
			}
		}
		else{
			rep = "<empty>";
		}
		if(this.total()>0){
			rep += "("+this.total()+")";
		}
		return rep;
	}

	public void clear(){
		this.cards.clear();
	}

	public void add(BJ_Card card){
		this.cards.add(card);
	}

	public void give(BJ_Card card, BJ_Hand otherHand){
		this.cards.remove(card);
		otherHand.add(card);
	}

	public int total(){
		// if a card in the hand has value of 0, then total() is 0
		for(BJ_Card card:this.cards){
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
		return this.total() > 21;
	}
}
