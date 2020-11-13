/* Alien Blaster
Demonstrates object interaction*/

class Player{
	public void blast(Alien enemy){
		System.out.println("The player blasts and enemy.\n");
		enemy.die();
	}
}

class Alien{
	public void die(){
		System.out.println("The alien gasps and says, 'Oh, this is it. This is the big one.\nYes, it's getting dark now. Tell my 1.6 million larvae taht I loved them...\nGood-bye, cruel universe.");
	}
}

public class AlienBlaster{
	public static void main(String[] args){
		Player hero = new Player();
		Alien invader = new Alien();
		hero.blast(invader);
	}
}

