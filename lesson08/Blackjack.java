/*Blackjack
From 1 to 7 players compete against a dealer*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BJ_Card extends Card{
	final public static int ACE_VALUE=1;
	public String rank;
	public String suit;
	
	public BJ_Card(String rank, String suit){
		super(rank, suit);
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

class BJ_Deck extends Deck{
	public ArrayList<BJ_Card> cards;
	public BJ_Deck(){
		cards = new ArrayList<BJ_Card>();
	}

	@Override
	public void populate(){
		for(String suit: BJ_Card.SUITS){
			for(String rank:BJ_Card.RANKS){
				this.cards.add(new BJ_Card(rank,suit));
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

	@Override
	public String toString(){
		String rep = this.name+": "+super.toString();
		if (this.total()>0){
			rep += "("+this.total()+")";
		}
		return rep;
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

class BJ_Player extends BJ_Hand{
	public BJ_Player(String name){
		super(name);
	}
	
	public boolean isHitting(Scanner scnr){
		char response = Games.askYesNo("\n"+this.name+", do you want a hit? (y/n)", scnr);
		return response == 'y';
	}

	public void bust(){
		System.out.println(this.name+" busts.");
		this.lose();
	}

	public void lose(){
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
		super(name);
	}

	public boolean isHitting(){
		return this.total() < 17;
	}
	
	public void bust(){
		System.out.println(this.name+" busts.");
	}

	public void flipFirstCard(){
		this.cards.get(0).flip();
	}
}

class BJ_Game{
	public ArrayList<BJ_Player> players;
	public BJ_Dealer dealer;
	public BJ_Deck deck;

	public BJ_Game(String[] names){
		int size = names.length;
		this.players = new ArrayList<BJ_Player>();
		for(int i=0;i<size;i++){
			this.players.add(new BJ_Player(names[i]));
		}
		this.dealer = new BJ_Dealer("Dealer");
		this.deck = new BJ_Deck();
		this.deck.populate();
		this.deck.shuffle();
	}

	public ArrayList<BJ_Player> stillPlaying(){
		ArrayList<BJ_Player> sp = new ArrayList<BJ_Player>();
		for(BJ_Player player:this.players){
			if(!player.isBusted()){
				sp.add(player);
			}
		}
		return sp;
	}

	private void additionalCards(BJ_Player player, Scanner scnr){
		while(!player.isBusted() && player.isHitting(scnr)){
			BJ_Player[] hit = {player};
			this.deck.deal(hit,1);
			System.out.println(player);
			if (player.isBusted()){
				player.bust();
			}
		}
	}

	public void play(Scanner scnr){
		//deal initial 2 cards to everyone
		BJ_Hand[] list = new BJ_Hand[this.players.size()+1];
		for(int i=0;i<this.players.size();i++){
			list[i] = this.players.get(i);
		}
		list[this.players.size()] = this.dealer;

		this.deck.deal(list,2);
		this.dealer.flipFirstCard(); //hide dealer's first card
		for(BJ_Player player:this.players){
			System.out.println(player);
		}
		System.out.println(this.dealer);

		// deal additional cards to players
		for(BJ_Player player:this.players){
			this.additionalCards(player, scnr);
		}

		// reveal dealer's first
		this.dealer.flipFirstCard();

		if(this.stillPlaying().isEmpty()){
			//since all players have busted, just show the dealer's hand
			System.out.println(this.dealer);
		}
		else{
			//deal additional cards to dealer
			System.out.println(this.dealer);
			this.additionalCards(this.dealer, scnr);

			if(this.dealer.isBusted()){
				//everyone still playing wins
				for(BJ_Player player:this.players){
					player.win();
				}
			}
			else{
				// compare each player still playing to dealer
				for(BJ_Player player:this.stillPlaying()){
					if(player.total() > this.dealer.total){
						player.win();
					}
					else if(player.total() < this.dealer.total){
						player.lose();
					}
					else{
						player.push();
					}
				}
			}
		}
		// remove everyone's cards
		for(BJ_Player player:this.players){
			player.clear();
		}
		this.dealer.clear();
	}
}

public class Blackjack{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		System.out.println("\t\tWelcome to Blackjack!\n");

		int number = Games.askNumber("How many players? (1 - 7):",1,8, scnr);
		String[] names = new String[number];
		String name;
		for(int i=0;i<number;i++){
			System.out.println("Enter player name:");
			name = scnr.nextLine();
			names[i] = name;
		}
		System.out.println();

		BJ_Game game = new BJ_Game(names);

		char again = 'y';
		while(again != 'n'){
			game.play(scnr);
			again = Games.askYesNo("\nDo you want to play again?", scnr);
		}
	}
}
