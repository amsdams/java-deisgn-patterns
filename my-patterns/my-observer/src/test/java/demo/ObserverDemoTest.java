package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class ObserverDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { 
		"First state change: 15", 
		"Hex String: F", 
		"Octal String: 17", 
		"Binary String: 1111",
		
		"Second state change: 10", 
		"Hex String: A", 
		"Octal String: 12", 
		"Binary String: 1010",
		
	};
	String[] results = AbstractMainTests.executeMain("demo.ObserverDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
