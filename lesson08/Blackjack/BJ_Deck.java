import java.util.Collections;

public class BJ_Deck extends BJ_Hand{
	public BJ_Deck(){
		super();
	}

	public void populate(){
		for(String suit:BJ_Card.SUITS){
			for(String rank:BJ_Card.RANKS){
				add(new BJ_Card(rank,suit));
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(cards);
	}

	public void deal(BJ_Hand[] hands, int perHand){
		BJ_Card topCard;
		for(int i=0;i<perHand;i++){
			for(BJ_Hand hand:hands){
				if(! cards.isEmpty()){
					topCard = cards.get(0);
					give(topCard, hand);
				}
				else{
					System.out.println("Can't continue deal. Out of cards!");
				}
			}
		}
	}
}

