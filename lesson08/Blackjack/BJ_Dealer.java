import java.util.Scanner;

public class BJ_Dealer extends BJ_Hand{
	public String name;
	public BJ_Dealer(String name){
		super();
		this.name = name;
	}
	@Override
	public boolean isHitting(Scanner scnr){
		return this.total() < 17;
	}

	public void flipFirstCard(){
		this.cards.get(0).flip();
	}
	@Override
	public void bust(){
		System.out.println(this.name+" busts.");
	}
}

