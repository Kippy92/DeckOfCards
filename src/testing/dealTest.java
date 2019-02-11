package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class dealTest {
	@Test
	public void test() {
		Deck test = new Deck();
		test.initialize();
		test.deal();
		int count = test.getCount();
		assertEquals(51, count);
	}
}
