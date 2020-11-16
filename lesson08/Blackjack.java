/*Blackjack
From 1 to 7 players compete against a dealer*/

import java.uitl.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BJ_Card extends Card{
	final public static int ACE_VALUE=1;
	public String rank;
	public String suit;
	
	public BJ_Card(String rank, String suit){
		super();
	}

	public int value(){
		int v;
		if(this.isFaceUp){
			v = BJ_Card.RANKS.get(this.rank)+1;
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

class BJ_Deck extends Deck{
	public ArrayList<BJ_Card> cards;
	public BJ_Deck(){
		cards = new ArrayList<BJ_Card>;
	}

	@override
	public populate(){
		for(String suit: BJ_Card.SUITS){
			for(String rank:BJ_Card.RANKS){
				this.cards.add(BJ_Card(rank,suit);
			}
		}
	}
}

class BJ_Hand extends Hand{
	public ArrayList<BJ_Card> cards;
	public String name;
	public BJ_Hand(String name){
		super();
		this.name = name;
	}

	@override
	public String toString(){
		String rep = this.name+": "+super.toString();
		if (this.total>0){
			rep += "("+this.total+")";
		}
		return rep;
	}

	public int total(){
		// if a card in the hand has value of 0, then total is 0
		for(Card card:cards){
			if(card.value = 0){
				return 0;
			}
		}
		// add up card values, treat each Ace as 1
		// also determine if there is an Ace
		int t = 0;
		boolean containsAce = false;
		for(Card card:cards){
			t += card.value;
			if(card.value == BJ_Card.ACE_VALUE){
				containsAce = true;
			}
		}
		// if hand contains Ace and total is low enough, treat Ace as 11
		if(containsAce && t<=11){
			//add only 10 since we're already added 1 for the Ace
			t += 10;
		}
		return t;
	}

	public boolean isBusted(){
		return self.total > 21;
	}
}

Class BJ_Player extends BJ_Hand{
	public BJ_Player(String name){
		super();
	}
	
	public boolean isHitting(){
		char response = Games.askYesNo("\n"+this.name+", do you want a hit? (y/n)");
		return response == 'y';
	}

	public void bust(){
		System.out.println(this.name+" busts.");
		this.lose();
	}

	public void lost(){
		System.out.println(this.name+" loses.");
	}

	public void win(){
		System.out.println(this.name+" wins.");
	}

	public void push(){
		System.out.println(this.name+"pushes.");
	}
}

class BJ_Dealer extends BJ_Hand{
	public BJ_Dealer(String name){
		super();
	}

	public boolean isHitting(){
		return this.total < 17;
	}
	
	public void bust(){
		System.out.println(this.name+" busts.");
	}

	public void flipFirstCard(){
		this.cards.get(0).flip();
	}
}

class BJ_Game{
	public BJ_Player[] players;
	public BJ_Dealer dealer;
	public BJ_Deck deck;

	public BJ_Game(String[] names){
		int size = names.lenth;
		this.players = new BJ_Players[size];
		for(int i=0;i<size;i++){
			this.players[i] = new BJ_Player(name[i]);
		}
		this.dealer = BJ_Dealer("Dealer");
		this.deck = BJ_Deck();
		this.deck.populate();
		this.deck.shuffle();
	}

	public ArrayList<BJ_Player> stillPlaying(){
		ArrayList<BJ_Player> sp = new ArrayList<BJ_Player>();
		for(BJ_Player player:this.players){
			if(!player.isBusted()){
				sp.append(player);
			}
		}
		return sp;
	}

	private additionalCards(BJ_Player player){
		BJ_Player[] hit;
		while(!player.isBusted() && player.isHitting()){
			hit = {player};
			this.deck.deal(hit);
			System.out.println(player);
			if (player.isBusted()){
				player.bust();
			}
		}
	}

	public void play(){
		//line 132
	}
}

