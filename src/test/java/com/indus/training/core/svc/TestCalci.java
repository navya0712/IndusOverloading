package com.indus.training.core.svc;

import com.indus.training.core.impl.Calci;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Calci Class
 */
public class TestCalci extends TestCase {

	private Calci calObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		calObj = new Calci();
	}

	/**
	 * Tears down the Test environment
	 */
	protected void tearDown() throws Exception {
		calObj = null;
	}

	/**
	 * Test case for addition method with two parameters
	 */
	public void testAdditionDoubleDouble() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 5.0;

		// 3. Actual Result
		double actResult = calObj.addition(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for addition method with three parameters
	 */
	public void testAdditionDoubleDoubleDouble() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;
		double param3 = 3.0;

		// 2. Expected Result
		double expResult = 8.0;

		// 3. Actual Result
		double actResult = calObj.addition(param1, param2, param3);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for subtract method
	 */
	public void testSubtract() {

		// 1. Inputs
		double param1 = 5.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actResult = calObj.subtract(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for multiply method with two parameters
	 */
	public void testMultiplyDoubleDouble() {

		// 1. Inputs
		double param1 = 5.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 15.0;

		// 3. Actual Result
		double actResult = calObj.multiply(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for addition method with three parameters
	 */
	public void testMultiplyDoubleDoubleDouble() {

		// 1. Inputs
		double param1 = 5.0;
		double param2 = 3.0;
		double param3 = 2.0;

		// 2. Expected Result
		double expResult = 30.0;

		// 3. Actual Result
		double actResult = calObj.multiply(param1, param2, param3);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for division method
	 */
	public void testDivision() {

		// 1. Inputs
		double param1 = 6.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actResult = calObj.division(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

}
