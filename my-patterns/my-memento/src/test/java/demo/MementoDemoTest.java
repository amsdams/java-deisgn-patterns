package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class MementoDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { "Current State: State #4", "First saved State: State #2",
		"Second saved State: State #3" };
	String[] results = AbstractMainTests.executeMain("demo.MementoDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
