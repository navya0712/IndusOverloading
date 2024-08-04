package com.indus.training.core.impl;

import com.indus.training.core.svc.IAverage;

/**
 * Implements the {@link IAverage} interface
 */
public class Average implements IAverage {

	/**
	 * Calculates the average of two numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @return the average of the two numbers
	 */
	@Override
	public double average(double param1, double param2) {
		double result = 0.0;
		{
			result = (param1 + param2) / 2;

		}
		return result;
	}

	/**
	 * Calculates the average of three numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @param param3 the third number
	 * @return the average of the three numbers
	 */
	@Override
	public double average(double param1, double param2, double param3) {
		double result = 0.0;
		{
			result = (param1 + param2 + param3) / 3;

		}
		return result;
	}

	/**
	 * Calculates the average of four numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @param param3 the third number
	 * @param param4 the fourth number
	 * @return the average of the four numbers
	 */
	@Override
	public double average(double param1, double param2, double param3, double param4) {
		double result = 0.0;
		{
			result = (param1 + param2 + param3 + param4) / 4;

		}
		return result;
	}

}
