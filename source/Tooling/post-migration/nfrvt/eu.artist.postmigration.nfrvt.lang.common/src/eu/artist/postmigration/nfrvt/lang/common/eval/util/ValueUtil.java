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

import org.eclipse.emf.ecore.EObject;
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

/**
 * Utility class providing methods to convert between primitive type values and
 * value literals used in the ARTIST migration languages, e.g., Boolean <-> 
 * BooleanLiteral.
 * 
 * @author Martin Fleck
 *
 */
public class ValueUtil {
	private static ArtistCommonFactory factory = ArtistCommonFactory.eINSTANCE;
	
	/**
	 * Creates a new null literal
	 * @return new null literal
	 */
	public static NullLiteral createNullLiteral() {
		NullLiteral literal = factory.createNullLiteral();
		literal.setValue("null");
		return literal;
	}
	
	/**
	 * Creates a new boolean literal based on the given boolean value. 
	 * If the value is null, null is returned.
	 * 
	 * @param b boolean value
	 * @return new boolean literal or null
	 */
	public static BooleanLiteral createBooleanLiteralOrNull(Boolean b) {
		if(b == null)
			return null;
		return createBooleanLiteral(b);
	}
	
	/**
	 * Creates a new boolean literal based on the given boolean value. 
	 * 
	 * @param b boolean value
	 * @return new boolean literal
	 */
	public static BooleanLiteral createBooleanLiteral(Boolean b) {
		BooleanLiteral literal = factory.createBooleanLiteral();
		literal.setValue(b);
		return literal;
	}
	
	/**
	 * Creates a new number literal based on the given numeric value. 
	 * 
	 * @param b numeric value
	 * @return new number literal
	 */
	public static NumberLiteral createNumberLiteral(BigDecimal b) {
		NumberLiteral literal = factory.createNumberLiteral();
		literal.setValue(b);
		return literal;
	}
	
	/**
	 * Creates a new number literal based on the given numeric value. 
	 * If the value is null, null is returned.
	 * 
	 * @param b numeric value
	 * @return new number literal or null
	 */
	public static NumberLiteral createNumberLiteralOrNull(BigDecimal b) {
		if(b == null)
			return null;
		return createNumberLiteral(b);
	}
	
	/**
	 * Creates a new number literal based on the given numeric value. 
	 * 
	 * @param d numeric value
	 * @return new number literal
	 */
	public static NumberLiteral createNumberLiteral(double d) {
		NumberLiteral literal = factory.createNumberLiteral();
		literal.setValue(new BigDecimal(d));
		return literal;
	}
	
	/**
	 * Creates a new number literal based on the given numeric value. 
	 * 
	 * @param i numeric value
	 * @return new number literal
	 */
	public static NumberLiteral createNumberLiteral(Integer i) {
		NumberLiteral literal = factory.createNumberLiteral();
		literal.setValue(new BigDecimal(i));
		return literal;
	}
	
	/**
	 * Creates a new unlimited literal.
	 * 
	 * @return new unlimited literal
	 */
	public static UnlimitedLiteral createUnlimitedLiteral() {
		UnlimitedLiteral literal = factory.createUnlimitedLiteral();
		literal.setValue("*");
		return literal;
	}
	
	/**
	 * Creates a new string literal based on the given string value. 
	 * 
	 * @param s string value
	 * @return new string literal
	 */
	public static StringLiteral createStringLiteral(String s) {
		StringLiteral literal = factory.createStringLiteral();
		literal.setValue(s);
		return literal;
	}
	
	/**
	 * Creates a new instance specification expression based on the instance 
	 * specification. 
	 * 
	 * @param i instance specification
	 * @return new instance specification expression
	 */
	public static InstanceSpecificationExpression createInstanceSpecificationExpression(InstanceSpecification i) {
		InstanceSpecificationExpression literal = factory.createInstanceSpecificationExpression();
		literal.setValue(i);
		return literal;
	}
	
	/**
	 * Returns a copy of the given object using 
	 * {@link EcoreUtil2#copy(EObject)}.
	 * 
	 * @param obj object to copy
	 * @return copy of the object
	 */
	public static <T extends EObject> T copy(T obj) {
		return EcoreUtil2.copy(obj);
	}
	
	/**
	 * Returns the boolean value of the given boolean literal.
	 * 
	 * @param l literal
	 * @return value of the literal or null if literal is null
	 * 
	 * @see {@link #assertBoolean(ValueSpecification)}
	 */
	public static Boolean valueOf(BooleanLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	/**
	 * Returns the string value of the given string literal.
	 * 
	 * @param l literal
	 * @return value of the literal or null if literal is null
	 */
	public static String valueOf(StringLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	/**
	 * Returns the numeric value of the given number literal.
	 * 
	 * @param l literal
	 * @return value of the literal or null if literal is null
	 */
	public static BigDecimal valueOf(NumberLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	/**
	 * Returns the value of the given unlimited literal.
	 * 
	 * @param l literal
	 * @return value of the literal or null if literal is null
	 */
	public static String valueOf(UnlimitedLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	/**
	 * Returns the value of the given null literal.
	 * 
	 * @param l literal
	 * @return value of the literal or null if literal is null
	 */
	public static String valueOf(NullLiteral l) {
		if(l == null)
			return null;
		return l.getValue();
	}
	
	/**
	 * Returns the value of the given instance specification expression.
	 * 
	 * @param e instance specification expression
	 * @return value of the expression or null if expression is null
	 */
	public static InstanceSpecification valueOf(InstanceSpecificationExpression e) {
		if(e == null)
			return null;
		return e.getValue();
	}
	
	/**
	 * True if the given value is an instance of {@link BooleanLiteral}.
	 * 
	 * @param value value to check
	 * @return true if value is a boolean literal, false otherwise
	 * 
	 * @see {@link #assertBoolean(ValueSpecification)}
	 */
	public static boolean isBoolean(ValueSpecification value) {
		return value instanceof BooleanLiteral;
	}
	
	/**
	 * True if the given value is an instance of {@link BooleanLiteral} or 
	 * null.
	 * 
	 * @param value value to check
	 * @return true if value is a boolean literal or is null, false 
	 * otherwise
	 */
	public static boolean isBooleanOrNull(ValueSpecification value) {
		return value == null || value instanceof BooleanLiteral;
	}
	
	/**
	 * True if the given value is an instance of {@link NumberLiteral}.
	 * 
	 * @param value value to check
	 * @return true if value is a number literal, false otherwise.
	 */
	public static boolean isNumber(ValueSpecification value) {
		return value instanceof NumberLiteral;
	}
	
	/**
	 * Returns the boolean value of the given specification, if value
	 * is an instance of boolean literal. Otherwise an exception is 
	 * thrown.
	 * 
	 * @param value specification to be checked
	 * @return value of specification or null
	 * @throws IllegalArgumentException
	 * 
	 * @see {@link #isBoolean(ValueSpecification)}
	 * @see {@link #valueOf(BooleanLiteral)}
	 */
	public static Boolean assertBoolean(ValueSpecification value) {
		if(isBoolean(value))
			return valueOf((BooleanLiteral)value);
		throw new IllegalArgumentException("Not a boolean value.");
	}
	
	/**
	 * Returns the boolean value of the given specification, if value
	 * is an instance of boolean literal or null. Otherwise an exception is 
	 * thrown.
	 * 
	 * @param value specification to be checked
	 * @return value of specification
	 * @throws IllegalArgumentException
	 * 
	 * @see {@link #assertBoolean(ValueSpecification)}
	 */
	public static Boolean assertBooleanOrNull(ValueSpecification value) {
		if(value == null)
			return null;
		return assertBoolean(value);
	}
	
	/**
	 * Returns the numeric value of the given specification, if value
	 * is an instance of number literal. Otherwise an exception is 
	 * thrown.
	 * 
	 * @param value specification to be checked
	 * @return value of specification or null
	 * @throws IllegalArgumentException
	 * 
	 * @see {@link #isNumber(ValueSpecification)}
	 * @see {@link #valueOf(NumberLiteral)}
	 */
	public static BigDecimal assertNumber(ValueSpecification value) {
		if(isNumber(value))
			return valueOf((NumberLiteral)value);
		throw new IllegalArgumentException("Not a number value.");
	}
	
	/**
	 * Returns the boolean value of the given specification, if value
	 * is an instance of boolean literal or null. 
	 * 
	 * @param value specification to be checked
	 * @return value of specification or null
	 * 
	 * @see {@link #assertBooleanOrNull(ValueSpecification)}
	 */
	public static Boolean getBooleanOrNull(ValueSpecification e) {
		if(e == null || !ValueUtil.isBoolean(e))
			return null;
		return ValueUtil.valueOf((BooleanLiteral)e);
	}
	
	/**
	 * Returns the numeric value of the given specification, if value
	 * is an instance of number literal or null. 
	 * 
	 * @param value specification to be checked
	 * @return value of specification or null
	 * 
	 * @see {@link #assertNumber(ValueSpecification)}
	 */
	public static BigDecimal getNumberOrNull(ValueSpecification e) {
		if(e == null || !ValueUtil.isNumber(e))
			return null;
		return ValueUtil.valueOf((NumberLiteral)e);
	}
	
	/**
	 * Returns the given value specification as number literal if possible,
	 * null otherwise
	 * @param e value specification
	 * @return number literal or null
	 */
	public static NumberLiteral asNumberLiteral(ValueSpecification e) {
		if(e instanceof NumberLiteral)
			return (NumberLiteral) e;
		return null;
	}
}
