import java.util.Scanner;
import java.util.ArrayList;

class BJ_Game{
	public ArrayList<BJ_Player> players;
	public BJ_Dealer dealer;
	public BJ_Deck deck;

	public BJ_Game(String[] names){
		int size = names.length;
		players = new ArrayList<BJ_Player>();
		for(int i=0;i<size;i++){
			players.add(new BJ_Player(names[i]));
		}
		dealer = new BJ_Dealer("Dealer");
		deck = new BJ_Deck();
		deck.populate();
		deck.shuffle();
	}

	public ArrayList<BJ_Player> stillPlaying(){
		ArrayList<BJ_Player> sp = new ArrayList<BJ_Player>();
		for(BJ_Player player:players){
			if(!player.isBusted()){
				sp.add(player);
			}
		}
		return sp;
	}

	private void additionalCards(BJ_Hand player, Scanner scnr){
		while(!player.isBusted() && player.isHitting(scnr)){
			BJ_Hand[] hit = {player};
			deck.deal(hit,1);
			System.out.println(player);
			if (player.isBusted()){
				player.bust();
			}
		}
	}

	public void play(Scanner scnr){
		//deal initial 2 cards to everyone
		BJ_Hand[] list = new BJ_Hand[players.size()+1];
		for(int i=0;i<players.size();i++){
			list[i] = players.get(i);
		}
		list[players.size()] = dealer;

		deck.deal(list,2);
		dealer.flipFirstCard(); //hide dealer's first card
		for(BJ_Player player:players){
			System.out.println(player);
		}
		System.out.println(dealer);

		// deal additional cards to players
		for(BJ_Player player:players){
			additionalCards(player, scnr);
		}

		// reveal dealer's first
		dealer.flipFirstCard();

		if(stillPlaying().isEmpty()){
			//since all players have busted, just show the dealer's hand
			System.out.println(dealer);
		}
		else{
			//deal additional cards to dealer
			System.out.println(dealer);
			additionalCards(dealer, scnr);

			if(dealer.isBusted()){
				//everyone still playing wins
				for(BJ_Player player:players){
					player.win();
				}
			}
			else{
				// compare each player still playing to dealer
				for(BJ_Player player:stillPlaying()){
					if(player.total() > dealer.total()){
						player.win();
					}
					else if(player.total() < dealer.total()){
						player.lose();
					}
					else{
						player.push();
					}
				}
			}
		}
		// remove everyone's cards
		for(BJ_Player player:players){
			player.clear();
		}
		dealer.clear();
	}
}

