package demo;
import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class BridgeDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { "Drawing Circle[ color: red, radius: 10, x: 100, 100]",
		"Drawing Circle[ color: green, radius: 10, x: 100, 100]",

	};
	String[] results = AbstractMainTests.executeMain("demo.BuilderDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);

    }

}
