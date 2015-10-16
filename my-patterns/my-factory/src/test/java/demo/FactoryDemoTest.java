package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class FactoryDemoTest {

	@Test
	public void testMain() {
		String[] expected = new String[] { "Inside Circle::draw() method.", "Inside Rectangle::draw() method.",
				"Inside Square::draw() method." };
		String[] results = AbstractMainTests.executeMain("demo.FactoryDemo", new String[] { "Yeah" });

		assertArrayEquals(expected, results);

	}

}
