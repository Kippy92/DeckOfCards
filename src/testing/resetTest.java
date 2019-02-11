package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class resetTest {
	@Test
	public void test() {
		Deck test = new Deck();
		test.initialize();
		test.deal();
		test.reset();
		int count = test.getCount();
		assertEquals(52, count);
	}

}
