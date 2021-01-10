package com.tdd;

import static org.junit.Assert.assertEquals;

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
	}

}
