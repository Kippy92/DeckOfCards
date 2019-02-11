package testing;

public class DeckTest {
	public static void main(String[] args) {
		Deck x = new Deck();
		Player y = new Player();
		Player z = new Player();
		y.setName("y");
		z.setName("z");
		x.initialize();
		System.out.println(x.getCount());
		x.shuffle();
		y.draw(x);
		z.draw(x);
		y.draw(x);
		z.draw(x);
		y.draw(x);
		z.draw(x);
		System.out.println(x.getCount());
		y.showHand();
		z.showHand();
		z.remove(0);
		z.showHand();
		System.out.println(x.getCount());
	}
}
