package com.indus.training.core.svc;

/**
 * Provides methods for calculating the average of numbers.
 */
public interface IAverage {

	/**
	 * Calculates the average of two numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @return the average of the two numbers
	 */
	public double average(double param1, double param2);

	/**
	 * Calculates the average of three numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @param param3 the third number
	 * @return the average of the three numbers
	 */
	public double average(double param1, double param2, double param3);

	/**
	 * Calculates the average of four numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @param param3 the third number
	 * @param param4 the average of the four numbers
	 * @return
	 */
	public double average(double param1, double param2, double param3, double param4);

}
