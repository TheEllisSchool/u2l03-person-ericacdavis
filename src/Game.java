import java.awt.*;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "Person");
	
	static Color BROWN = new Color(142, 64, 4);
	
	static Person mrsLombardi = new Person(Color.GREEN, BROWN, 300, 100,150);
	static Person leah = new Person(Color.CYAN, BROWN,250,400,150);
	static Person yumika = new Person(Color.CYAN, BROWN,250,400,150);
	
	public static void main(String[] args) {
		showGameBoard(gb);

	}
	public void draw(Graphics g) {
		mrsLombardi.show(g);
		leah.show(g);
		yumika.show(g);
	}
	
}
