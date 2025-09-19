package Assignment4;


class Game
{

	public Game() {
		System.out.println("I am Game Constructor");
	}
	
}
class BoardGame extends Game
{

	public BoardGame() {
		System.out.println("I am BoardGame Constructor");
	}
	
}
class Chess extends BoardGame
{

	public Chess() {
		System.out.println("I am Chess Constructor");
	}
	
}

public class Gamedemo {
	
	public static void main(String[] args) {
		Chess ch=new Chess();
	}

}
