import java.util.Scanner;

public class BJ_Player extends BJ_Hand{
	public String name;
	public BJ_Player(String name){
		super();
		this.name = name;
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
