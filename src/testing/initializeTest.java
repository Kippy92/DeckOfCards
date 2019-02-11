package testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class initializeTest {
	
	@Test
	public void test() {
		Deck test = new Deck();
		test.initialize();
		int count = test.getCount();
		assertEquals(52, count);
	}
}
