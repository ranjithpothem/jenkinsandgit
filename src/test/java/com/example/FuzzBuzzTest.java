package com.example;

import junit.framework.TestCase;

public class FuzzBuzzTest extends TestCase {
	
	private FuzzBuzz fuzzBuzz;
	
	public FuzzBuzzTest() {
		this.fuzzBuzz=new FuzzBuzz();
	}
	
	public void testPlayFuzz() {
		assertEquals(fuzzBuzz.play(3), "Fuzz");
	}
	
	public void testPlayBuzz() {
		assertEquals(fuzzBuzz.play(5),"Buzz");
	}
	
	public void testPlayNotFuzzAndNotBuzz() {
		assertEquals(fuzzBuzz.play(2), "2");
	}

}
