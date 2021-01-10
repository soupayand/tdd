package com.tdd.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(0, calculator.add(""));
		assertEquals(1, calculator.add("1"));
		assertEquals(3, calculator.add("1,2"));
		assertEquals(6, calculator.add("1\n2,3"));
	}

	@Test
	public void testRandomDelimiters() {
		assertEquals(6, calculator.add("//;\n1;2;3"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumbers() {
		assertEquals(6, calculator.add("//;\n-1;-2;3"));
	}

}
