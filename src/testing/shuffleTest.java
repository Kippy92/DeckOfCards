package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class shuffleTest {
	@Test
	public void test() {
		Deck test = new Deck();
		test.initialize();
		Card x = test.getCards().get(0);
		Card y = test.getCards().get(51);
		test.shuffle();
		Card a = test.getCards().get(0);
		Card b = test.getCards().get(51);
		boolean c = false;
		if (x == a && y == b){
			c = true;
		}
		assertFalse(c);
	}

}
