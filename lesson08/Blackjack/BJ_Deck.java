import java.util.Collections;

public class BJ_Deck extends BJ_Hand{
	public BJ_Deck(){
		super();
	}

	public void populate(){
		for(String suit:BJ_Card.SUITS){
			for(String rank:BJ_Card.RANKS){
				this.add(new BJ_Card(rank,suit));
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(this.cards);
	}

	public void deal(BJ_Hand[] hands, int perHand){
		Card topCard;
		for(int i=0;i<perHand;i++){
			for(BJ_Hand hand:hands){
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
