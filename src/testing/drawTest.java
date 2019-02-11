package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class drawTest {
	@Test
	public void test() {
		Deck test = new Deck();
		Player tester = new Player();
		test.initialize();
		Card x = test.getCards().get(51);
		tester.draw(test);
		Card y = tester.getHand().get(0);
		assertEquals(x, y);
	}
}
