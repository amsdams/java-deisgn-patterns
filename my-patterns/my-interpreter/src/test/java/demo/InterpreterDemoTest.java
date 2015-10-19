package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class InterpreterDemoTest {

    @Test
    public void testMain() {

	String[] expected = new String[] { "John is male? true", "Julie is a married women? true" };

	String[] results = AbstractMainTests.executeMain("demo.InterpreterDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
