package com.indus.training.core.svc;

import com.indus.training.core.impl.Average;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Average Class
 */
public class TestAverage extends TestCase {

	private Average avgObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		avgObj = new Average();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		avgObj = null;
	}

	/**
	 * Test case for average method with two parameters
	 */
	public void testAverageDoubleDouble() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 2.5;

		// 3. Actual Result
		double actResult = avgObj.average(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for average method with three parameters
	 */
	public void testAverageDoubleDoubleDouble() {
		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;
		double param3 = 4.0;

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actResult = avgObj.average(param1, param2, param3);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for average method with four parameters
	 */
	public void testAverageDoubleDoubleDoubleDouble() {
		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;
		double param3 = 4.0;
		double param4 = 3.0;

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actResult = avgObj.average(param1, param2, param3, param4);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

}
