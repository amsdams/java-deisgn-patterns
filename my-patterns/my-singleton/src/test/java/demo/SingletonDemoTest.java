package demo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import util.AbstractMainTests;

public class SingletonDemoTest {
	@Test
	public void testMain() {
		String[] expected = new String[] { "amsdams", "amsdams"};
		String[] results = AbstractMainTests.executeMain("demo.SingletonDemo", new String[] { "Yeah" });

		assertArrayEquals(expected, results);

	}
}
