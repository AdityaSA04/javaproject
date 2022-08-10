package com.sonata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
Calculator c = new Calculator();
	@Test
	void testAdd() {
		assertEquals(5, c.add(2, 3));
	}
	void testMultiply() {
		assertEquals(15, c.multiply(5, 3));
	}

}
