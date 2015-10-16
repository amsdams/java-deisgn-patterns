package demo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import util.AbstractMainTests;

public class BuilderDemoTest {
	@Test
	public void testMain() {
		String[] expected = new String[] { 
			"Veg Meal", 
			"Item : Veg Burger, Packing : Wrapper, Price : 25.0",
			"Item : Coke, Packing : Bottle, Price : 30.0",
			"Total Cost: 55.0",
			"",
			"",
			"Non-Veg Meal", 
			"Item : Chicken Burger, Packing : Wrapper, Price : 50.5",
			"Item : Pepsi, Packing : Bottle, Price : 35.0",
			"Total Cost: 85.5",
			
		};
		String[] results = AbstractMainTests.executeMain("demo.BuilderDemo", new String[] { "Yeah" });

		assertArrayEquals(expected, results);

	}
}
