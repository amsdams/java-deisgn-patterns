package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class IteratorDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { "Name : Robert", 
		"Name : John",
		"Name : Julie",
		"Name : Lora"};
	String[] results = AbstractMainTests.executeMain("demo.IteratorDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
