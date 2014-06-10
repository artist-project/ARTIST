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

public class NumericLogic {
	
	private static EvaluationSettings settings;
	
	public static EvaluationSettings getSettings() {
		if(settings == null)
			settings = new EvaluationSettings();
		return settings;
	}

	public static void setSettings(EvaluationSettings settings) {
		NumericLogic.settings = settings;
	}
	
	public static BigDecimal log(BigDecimal value) {
		if(value == null)
			return null;
		return new BigDecimal(Math.log10(value.doubleValue()), getSettings().getMathContext());
	}
	
	public static BigDecimal ln(BigDecimal value) {
		if(value == null)
			return null;
		return new BigDecimal(Math.log(value.doubleValue()), getSettings().getMathContext());
	}
	
	public static BigDecimal abs(BigDecimal value) {
		if(value == null)
			return null;
		return value.abs();
	}
	
	public static BigDecimal pow(BigDecimal base, BigDecimal exp) {
		if(base == null || exp == null)
			return null;
		return base.pow(exp.intValue(), getSettings().getMathContext());
	}
	
	public static BigDecimal sum(List<BigDecimal> values) {
		if(values == null)
			return null;
		BigDecimal sum = zero();
		for(BigDecimal value : values)
			sum = sum.add(value, getSettings().getMathContext());
		return sum;		
	}
	
	public static BigDecimal min(List<BigDecimal> values) {
		if(values == null || values.isEmpty())
			return null;
		BigDecimal min = values.get(0);
		for(BigDecimal value : values)
			if(value.compareTo(min) < 0)
				min = value;
		return min;
	}
	
	public static BigDecimal max(List<BigDecimal> values) {
		if(values == null || values.isEmpty())
			return null;
		BigDecimal max = values.get(0);
		for(BigDecimal value : values)
			if(value.compareTo(max) > 0)
				max = value;
		return max;
	}
	
	public static BigDecimal avg(List<BigDecimal> values) {
		if(values == null || values.isEmpty())
			return null;
		BigDecimal sum = zero();
		for(BigDecimal value : values)
			sum = sum.add(value, getSettings().getMathContext());
		BigDecimal divisor = new BigDecimal(values.size(), getSettings().getMathContext());
		return sum.divide(divisor, getSettings().getMathContext());		
	}
	
	public static BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		if(dividend == null | divisor == null)
			return null;
		return dividend.divide(divisor, getSettings().getMathContext());
	}
	
	public static BigDecimal subtract(BigDecimal minuend, BigDecimal substrahend) {
		if(minuend == null | substrahend == null)
			return null;
		return minuend.subtract(substrahend, getSettings().getMathContext());
	}
	
	public static BigDecimal add(BigDecimal addend, BigDecimal augend) {
		if(addend == null | augend == null)
			return null;
		return addend.add(augend, getSettings().getMathContext());
	}
	
	public static BigDecimal multiply(BigDecimal multiplier, BigDecimal multiplicand) {
		if(multiplier == null | multiplicand == null)
			return null;
		return multiplier.multiply(multiplicand, getSettings().getMathContext());
	}
	
	public static BigDecimal modulo(BigDecimal dividend, BigDecimal divisor) {
		if(dividend == null | divisor == null)
			return null;
		return dividend.remainder(divisor, getSettings().getMathContext());
	}
	
	public static BigDecimal zero() {
		return new BigDecimal(0, getSettings().getMathContext());
	}
}
