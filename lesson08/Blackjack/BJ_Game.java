import java.util.Scanner;
import java.util.ArrayList;

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

	private void additionalCards(BJ_Hand player, Scanner scnr){
		while(!player.isBusted() && player.isHitting(scnr)){
			BJ_Hand[] hit = {player};
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
					if(player.total() > this.dealer.total()){
						player.win();
					}
					else if(player.total() < this.dealer.total()){
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
