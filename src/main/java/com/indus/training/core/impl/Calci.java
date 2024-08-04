package com.indus.training.core.impl;

import com.indus.training.core.svc.ICalci;

/**
 * Provides methods for basic arithmetic operations.
 */
public class Calci implements ICalci {

	/**
	 * Performs addition of two double values
	 */
	@Override
	public double addition(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 + param2;

		}
		return result;
	}

	/**
	 * Performs addition of three double values
	 */
	@Override
	public double addition(double param1, double param2, double param3) {
		double result = 0.0;
		{
			result = param1 + param2 + param3;

		}
		return result;
	}

	@Override
	public double subtract(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 - param2;
		}
		return result;
	}

	/**
	 * Performs multiplication of two double values
	 */
	@Override
	public double multiply(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 * param2;

		}
		return result;
	}

	/**
	 * Performs multiplication of three double values
	 */
	@Override
	public double multiply(double param1, double param2, double param3) {
		double result = 0.0;
		{
			result = param1 * param2 * param3;

		}
		return result;
	}

	/**
	 * Divides one number by another and returns the quotient
	 */
	@Override
	public double division(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 / param2;

		}
		return result;
	}

}
