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
package eu.artist.postmigration.nfrvt.lang.common.eval.util;

import java.math.BigDecimal;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.xtext.EcoreUtil2;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

public class ValueUtil {
	private static ArtistCommonFactory expressionFactory = ArtistCommonFactory.eINSTANCE;
	
	public static NullLiteral createNullLiteral() {
		NullLiteral literal = expressionFactory.createNullLiteral();
		literal.setValue("null");
		return literal;
	}
	
	public static BooleanLiteral createBooleanLiteralOrNull(Boolean b) {
		if(b == null)
			return null;
		return createBooleanLiteral(b);
	}
	
	public static BooleanLiteral createBooleanLiteral(Boolean b) {
		BooleanLiteral literal = expressionFactory.createBooleanLiteral();
		literal.setValue(b);
		return literal;
	}
	
	public static NumberLiteral createNumberLiteral(BigDecimal b) {
		NumberLiteral literal = expressionFactory.createNumberLiteral();
		literal.setValue(b);
		return literal;
	}
	
	public static NumberLiteral createNumberLiteralOrNull(BigDecimal b) {
		if(b == null)
			return null;
		return createNumberLiteral(b);
	}
	
	public static NumberLiteral createNumberLiteral(double d) {
		NumberLiteral literal = expressionFactory.createNumberLiteral();
		literal.setValue(new BigDecimal(d));
		return literal;
	}
	
	public static NumberLiteral createNumberLiteral(Integer i) {
		NumberLiteral literal = expressionFactory.createNumberLiteral();
		literal.setValue(new BigDecimal(i));
		return literal;
	}
	
	public static UnlimitedLiteral createUnlimitedLiteral() {
		UnlimitedLiteral literal = expressionFactory.createUnlimitedLiteral();
		literal.setValue("*");
		return literal;
	}
	
	public static StringLiteral createStringLiteral(String s) {
		StringLiteral literal = expressionFactory.createStringLiteral();
		literal.setValue(s);
		return literal;
	}
	
	public static InstanceSpecificationExpression createInstanceSpecificationExpression(InstanceSpecification i) {
		InstanceSpecificationExpression literal = expressionFactory.createInstanceSpecificationExpression();
		literal.setValue(i);
		return literal;
	}
	
	public static <T extends ValueSpecification> T copy(T v) {
		return EcoreUtil2.copy(v);
	}
	
	
	public static Boolean valueOf(BooleanLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	public static String valueOf(StringLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	public static BigDecimal valueOf(NumberLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	public static String valueOf(UnlimitedLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	public static String valueOf(NullLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	public static boolean isBoolean(ValueSpecification value) {
		return value instanceof BooleanLiteral;
	}
	
	public static boolean isBooleanOrNull(ValueSpecification value) {
		return value == null || value instanceof BooleanLiteral;
	}
	
	public static boolean isNumber(ValueSpecification value) {
		return value instanceof NumberLiteral;
	}
	
	public static Boolean assertBoolean(ValueSpecification value) {
		if(isBoolean(value))
			return valueOf((BooleanLiteral)value);
		throw new IllegalArgumentException("Not a boolean value.");
	}
	
	public static Boolean assertBooleanOrNull(ValueSpecification value) {
		if(value == null)
			return null;
		return assertBoolean(value);
	}
	
	public static BigDecimal assertNumber(ValueSpecification value) {
		if(isNumber(value))
			return valueOf((NumberLiteral)value);
		throw new IllegalArgumentException("Not a number value.");
	}
	
	public static Boolean getBooleanOrNull(ValueSpecification e) {
		if(e == null || !ValueUtil.isBoolean(e))
			return null;
		return ValueUtil.valueOf((BooleanLiteral)e);
	}
	
	public static BigDecimal getNumberOrNull(ValueSpecification e) {
		if(e == null || !ValueUtil.isNumber(e))
			return null;
		return ValueUtil.valueOf((NumberLiteral)e);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Object> T getValueOrNull(Object obj, Class<T> clazz) {
		if(clazz.isInstance(obj))
			return (T)obj;
		return null;
	}
}
