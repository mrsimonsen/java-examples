import java.util.Scanner;

public class BJ_Player extends BJ_Hand{
	public String name;
	public BJ_Player(String name){
		super();
		this.name = name;
	}
	@Override
	public boolean isHitting(Scanner scnr){
		char response = Games.askYesNo("\n"+name+", do you want a hit? (y/n)", scnr);
		return response == 'y';
	}
	@Override
	public void bust(){
		System.out.println(name+" busts.");
		this.lose();
	}

	public void lose(){
		System.out.println(name+" loses.");
	}

	public void win(){
		System.out.println(name+" wins.");
	}

	public void push(){
		System.out.println(name+"pushes.");
	}
}

