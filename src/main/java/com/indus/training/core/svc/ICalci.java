package com.indus.training.core.svc;

/**
 * Provides methods for basic arithmetic operations.
 */
public interface ICalci {
	/**
	 * Performs addition of two numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @return the sum of the two numbers
	 */
	public double addition(double param1, double param2);

	/**
	 * Performs addition of three numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @param param3 the third number
	 * @return the sum of the three numbers
	 */
	public double addition(double param1, double param2, double param3);

	/**
	 * Performs subtraction of two numbers.
	 * 
	 * @param param1 the minuend
	 * @param param2 the subtrahend
	 * @return the result of subtracting the second number from the first
	 */
	public double subtract(double param1, double param2);

	/**
	 * Performs multiplication of two numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * @return the product of the two numbers
	 */
	public double multiply(double param1, double param2);

	/**
	 * Performs multiplication of three numbers.
	 * 
	 * @param param1 the first number
	 * @param param2 the second number
	 * 
	 * @param param3 the third number
	 * @return the product of the three numbers
	 */
	public double multiply(double param1, double param2, double param3);

	/**
	 * Performs division of two numbers.
	 * 
	 * @param param1 the dividend
	 * @param param2 the divisor
	 * @return the result of dividing the first number by the second
	 */
	public double division(double param1, double param2);

}
