package demo;

import static org.junit.Assert.*;

import org.junit.Test;

import util.AbstractMainTests;

public class AdapterDemoTest {

    @Test
    public void testMain() {
	String[] expected = new String[] { 
		"Playing mp4 file. Name: alone.mp4",
		"Playing vlc file. Name: far far away.vlc", 
		"Invalid media. avi format not supported",
	};
	String[] results = AbstractMainTests.executeMain("demo.AdapterDemo", new String[] { "Yeah" });

	assertArrayEquals(expected, results);
    }

}
