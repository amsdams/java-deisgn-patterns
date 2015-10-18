package demo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import util.AbstractMainTests;

public class FacadeDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { "Inside Circle::draw() method.", "Inside Rectangle::draw() method.",
		"Inside Square::draw() method." };
	String[] results = AbstractMainTests.executeMain("demo.FacadeDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
