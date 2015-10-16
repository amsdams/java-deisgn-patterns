package demo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import util.AbstractMainTests;

public class PrototypeDemoTest {
	@Test
	public void testMain() {
		String[] expected = new String[] { 
			"Shape : Circle",
			"Shape : Square",
			"Shape : Rectangle"
		};
		String[] results = AbstractMainTests.executeMain("demo.PrototypeDemo", new String[] { "Yeah" });

		assertArrayEquals(expected, results);

	}
}
