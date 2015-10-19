package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class CommandDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { "Stock [ Name: ABC, Quantity: 10 ] bought",
		"Stock [ Name: ABC, Quantity: 10 ] sold" };
	String[] results = AbstractMainTests.executeMain("demo.CommandDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
