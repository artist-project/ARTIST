/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.common.eval.logic;

import java.math.BigDecimal;
import java.util.List;

import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;

/**
 * A class with static methods to evaluate numeric expressions.
 * 
 * @author Martin Fleck
 */
public class NumericLogic {
	
	private static EvaluationSettings settings = new EvaluationSettings();
	
	/**
	 * Returns the {@link EvaluationSettings} used for numeric operations
	 * containing, e.g., the rounding mode.
	 */
	public static EvaluationSettings getSettings() {
		return settings;
	}

	/**
	 * Specifies the {@link EvaluationSettings} used for numeric operations
	 * containing, e.g., the rounding mode.
	 * @param settings
	 */
	public static void setSettings(EvaluationSettings settings) {
		NumericLogic.settings = settings;
	}
	
	public static BigDecimal scale(BigDecimal value) {
		if(value.scale() < 0 || (value.precision() != getSettings().getPrecision()))
			value = value.setScale(0, getSettings().getRoundingMode());
		return value;
	}
	
	/***
	 * Common Logarithm function: log10(value). 
	 * <p/>
	 * Example: log(100) = 2 (10^2 = 100)
	 * 
	 * @param value
	 * @return value after applying the function
	 */
	public static BigDecimal log(BigDecimal value) {
		if(value == null)
			return null;
		return scale(new BigDecimal(Math.log10(value.doubleValue()), getSettings().getMathContext()));
	}
	
	/***
	 * Natural Logarithm function: ln(value). 
	 * <p/>
	 * Example: ln(10) = 2.3024... (e^2.3024... = 10)
	 * 
	 * @param value
	 * @return value after applying the function
	 */
	public static BigDecimal ln(BigDecimal value) {
		if(value == null)
			return null;
		return scale(new BigDecimal(Math.log(value.doubleValue()), getSettings().getMathContext()));
	}
	
	/***
	 * Absolute function: abs(value). 
	 * <p/>
	 * Example: abs(-10) = 10
	 * 
	 * @param value
	 * @return value after applying the function
	 */
	public static BigDecimal abs(BigDecimal value) {
		if(value == null)
			return null;
		return value.abs();
	}
	
	/***
	 * Power function (exponentiation): base^exp. 
	 * <p/>
	 * Example: 2^3 = 2 * 2 * 2 = 8
	 * 
	 * @param base base 
	 * @param exp exponent
	 * @return value after applying the function
	 */
	public static BigDecimal pow(BigDecimal base, BigDecimal exp) {
		if(base == null || exp == null)
			return null;
		return scale(base.pow(exp.intValue(), getSettings().getMathContext()));
	}
	
	/**
	 * Summation function: +(v1, v2, v3)
	 * <p/>
	 * Example: sum([2, 3, 4, 2]) = 11
	 * 
	 * @param values list of values to sum up
	 * @return sum of values or null if list is null
	 */
	public static BigDecimal sum(List<BigDecimal> values) {
		if(values == null)
			return null;
		BigDecimal sum = zero();
		for(BigDecimal value : values)
			sum = sum.add(value);
		return scale(sum);		
	}
	
	/**
	 * Minimum function: min(v1, v2, v3)
	 * <p/>
	 * Example: min([2, 3, 4, 2]) = 2
	 * 
	 * @param values list of values for which to get the minimum
	 * @return minimum of values or null if list is null
	 */
	public static BigDecimal min(List<BigDecimal> values) {
		if(values == null || values.isEmpty())
			return null;
		BigDecimal min = values.get(0);
		for(BigDecimal value : values)
			if(value.compareTo(min) < 0)
				min = value;
		return min;
	}
	
	/**
	 * Maximum function: max(v1, v2, v3)
	 * <p/>
	 * Example: max([2, 3, 4, 2]) = 4
	 * 
	 * @param values list of values for which to get the maximum
	 * @return maximum of values or null if list is null
	 */
	public static BigDecimal max(List<BigDecimal> values) {
		if(values == null || values.isEmpty())
			return null;
		BigDecimal max = values.get(0);
		for(BigDecimal value : values)
			if(value.compareTo(max) > 0)
				max = value;
		return max;
	}
	
	/**
	 * Average function: avg(v1, v2, v3)
	 * <p/>
	 * Example: avg([2, 3, 4, 2]) = 2.75
	 * 
	 * @param values list of values for which to get the average
	 * @return maximum of values or null if list is null
	 */
	public static BigDecimal avg(List<BigDecimal> values) {
		if(values == null || values.isEmpty())
			return null;
		BigDecimal sum = zero();
		for(BigDecimal value : values)
			sum = sum.add(value);

		BigDecimal divisor = new BigDecimal(values.size());
		return scale(sum.divide(divisor, getSettings().getPrecision(), getSettings().getMathContext().getRoundingMode()));		
	}
	
	/**
	 * Division function: dividend / divisor
	 * <p/>
	 * Example: 10 / 2 = 5
	 * 
	 * @param dividend dividend
	 * @param divisor divisor
	 * @return quotient
	 */
	public static BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		if(dividend == null | divisor == null)
			return null;
		return scale(dividend.divide(divisor, getSettings().getMathContext().getPrecision(), getSettings().getMathContext().getRoundingMode()));
	}
	
	/**
	 * Substraction function: minuend - substrahend
	 * <p/>
	 * Example: 10 - 2 = 8
	 * 
	 * @param minuend minuend
	 * @param substrahend substrahend
	 * @return difference
	 */
	public static BigDecimal subtract(BigDecimal minuend, BigDecimal substrahend) {
		if(minuend == null | substrahend == null)
			return null;
		return scale(minuend.subtract(substrahend));
	}
	
	/**
	 * Addition function: augend - addend
	 * <p/>
	 * Example: 10 + 2 = 12
	 * 
	 * @param augend augend
	 * @param addend addend
	 * @return sum
	 */
	public static BigDecimal add(BigDecimal augend, BigDecimal addend) {
		if(augend == null | addend == null)
			return null;
		return scale(augend.add(addend));
	}
	
	/**
	 * Multiplication function: multiplicand x multiplier
	 * <p/>
	 * Example: 10 x 2 = 20
	 * 
	 * @param multiplicand multiplicand
	 * @param multiplier multiplier
	 * @return product
	 */
	public static BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier) {
		if(multiplier == null | multiplicand == null)
			return null;
		return scale(multiplicand.multiply(multiplier, getSettings().getMathContext()));
	}
	
	/**
	 * Modulation function: dividend mod divisor
	 * <p/>
	 * Example: 10 % 3 = 1
	 * 
	 * @param dividend dividend
	 * @param divisor divisor
	 * @return remainder
	 */
	public static BigDecimal modulo(BigDecimal dividend, BigDecimal divisor) {
		if(dividend == null | divisor == null)
			return null;
		return scale(dividend.remainder(divisor, getSettings().getMathContext()));
	}
	
	/**
	 * Creates a new zero value.
	 * @return new zero value
	 */
	public static BigDecimal zero() {
		return new BigDecimal(0);
	}
}
