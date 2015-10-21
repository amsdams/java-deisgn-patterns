package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

/**
 * Unit test for simple App.
 */
public class StateDemoTest {
    @Test
    public void testMain() {
	String[] expected = new String[] { "Player is in start state", 
		"Start State", "Player is in stop state", "Stop State" };
	String[] results = AbstractMainTests.executeMain("demo.StateDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }
}
