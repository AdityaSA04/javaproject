package com.sonata.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(5, c.add(2, 3));
	}

}
