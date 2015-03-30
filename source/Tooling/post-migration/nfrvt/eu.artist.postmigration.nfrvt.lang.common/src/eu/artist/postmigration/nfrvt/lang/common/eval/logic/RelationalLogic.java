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

import java.util.Comparator;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

/**
 * A class with static methods to evaluate relational expressions.
 * This class makes use of the {@link ValueSpecificationComparator} to
 * compare objects.
 * 
 * @author Martin Fleck
 */
public class RelationalLogic {
	
	private static Comparator<Object> valueComparator;
	
	/**
	 * Returns the comparator used for comparing objects. Defaults
	 * to {@link ValueSpecificationComparator}.
	 * 
	 * @return comparator
	 */
	public static Comparator<Object> getComparator() {
		if(valueComparator == null)
			valueComparator = new ValueSpecificationComparator();
		return valueComparator;
	}
	
	/**
	 * Sets the comparator used for comparing objects.
	 * 
	 * @param comparator comparator to be used
	 */
	public static void setComparator(Comparator<Object> comparator) {
		RelationalLogic.valueComparator = comparator;
	}
	
	/**
	 * Compares two value specifications using the comparator. If either
	 * value is null, null is returned.
	 * 
	 * @param left left value
	 * @param right right value
	 * @return compare value indicating order
	 */
	public static Integer compare(ValueSpecification left, ValueSpecification right) {
		if(left == null || right == null)
			return null;
		return getComparator().compare(left, right);
	}
	
	/**
	 * Returns true if the given compare value indicates an order where the
	 * first value is greater than the second value. If the value is null, null
	 * is returned.
	 * 
	 * @param compare compare value
	 * @return true if first value is greater than the second, false otherwise
	 * (may be null)
	 */
	public static Boolean greater(Integer compare) {
		if(compare == null)
			return null;
		return compare > 0;
	}
	
	/**
	 * Returns true if the given compare value indicates an order where the
	 * first value is greater than or equal to the second value. If the value 
	 * is null, null is returned.
	 * 
	 * @param compare compare value
	 * @return true if first value is greater than or equal to the second, false 
	 * otherwise (may be null)
	 */
	public static Boolean greaterOrEqual(Integer compare) {
		if(compare == null)
			return null;
		return compare >= 0;
	}
	
	/**
	 * Returns true if the given compare value indicates an order where the
	 * first value is less than the second value. If the value is 
	 * null, null is returned.
	 * 
	 * @param compare compare value
	 * @return true if first value is less than the second, false otherwise
	 * (may be null)
	 */
	public static Boolean less(Integer compare) {
		if(compare == null)
			return null;
		return compare < 0;
	}
	
	/**
	 * Returns true if the given compare value indicates an order where the
	 * first value is less than or equal to the second value. If the value is 
	 * null, null is returned.
	 * 
	 * @param compare compare value
	 * @return true if first value is less than or equal to the second, false 
	 * otherwise (may be null)
	 */
	public static Boolean lessOrEqual(Integer compare) {
		if(compare == null)
			return null;
		return compare <= 0;
	}
	
	/**
	 * Returns true if the given compare value indicates an order where the
	 * first value is equal to the second value. If the value is 
	 * null, null is returned.
	 * 
	 * @param compare compare value
	 * @return true if first value is equal to the second, false 
	 * otherwise (may be null)
	 */
	public static Boolean equals(Integer compare) {
		if(compare == null)
			return null;
		return compare == 0;
	}
	

	/**
	 * Returns true if the given compare value indicates an order where the
	 * first value is not equal to the second value. If the value is 
	 * null, null is returned.
	 * 
	 * @param compare compare value
	 * @return true if first value is not equal to the second, false 
	 * otherwise (may be null)
	 */
	public static Boolean notEquals(Integer compare) {
		if(compare == null)
			return null;
		return compare != 0;
	}
	
	/**
	 * Returns true if the first value is greater than the second 
	 * value. If either value is null, null is returned.
	 * <p/>
	 * Relational Expression: first > second
	 * 
	 * @param left first value
	 * @param right second value
	 * @return true if first value is greater than the second, false 
	 * otherwise (may be null)
	 */
	public static Boolean greater(ValueSpecification left, ValueSpecification right) {
		return greater(compare(left, right));
	}
	
	/**
	 * Returns true if the first value is greater than or equal to the second 
	 * value. If either value is null, null is returned.
	 * <p/>
	 * Relational Expression: first >= second
	 * 
	 * @param left first value
	 * @param right second value
	 * @return true if first value is greater than or equal to the second, 
	 * false otherwise (may be null)
	 */
	public static Boolean greaterOrEqual(ValueSpecification left, ValueSpecification right) {
		return greaterOrEqual(compare(left, right));
	}
	
	/**
	 * Returns true if the first value is less than the second 
	 * value. If either value is null, null is returned.
	 * <p/>
	 * Relational Expression: first < second
	 * 
	 * @param left first value
	 * @param right second value
	 * @return true if first value is less than the second, false 
	 * otherwise (may be null)
	 */
	public static Boolean less(ValueSpecification left, ValueSpecification right) {
		return less(compare(left, right));
	}
	
	/**
	 * Returns true if the first value is less than or equal to the second 
	 * value. If either value is null, null is returned.
	 * <p/>
	 * Relational Expression: first <= second
	 * 
	 * @param left first value
	 * @param right second value
	 * @return true if first value is less than or equal to the second, 
	 * false otherwise (may be null)
	 */
	public static Boolean lessOrEqual(ValueSpecification left, ValueSpecification right) {
		return lessOrEqual(compare(left, right));
	}
	
	/**
	 * Returns true if the first value is equal to the second 
	 * value. If either value is null, null is returned.
	 * <p/>
	 * Relational Expression: first == second
	 * 
	 * @param left first value
	 * @param right second value
	 * @return true if first value is equal to the second, 
	 * false otherwise (may be null)
	 */
	public static Boolean equals(ValueSpecification left, ValueSpecification right) {
		return equals(compare(left, right));
	}
	
	/**
	 * Returns true if the first value is not equal to the second 
	 * value. If either value is null, null is returned.
	 * <p/>
	 * Relational Expression: first != second
	 * 
	 * @param left first value
	 * @param right second value
	 * @return true if first value is not equal to the second, 
	 * false otherwise (may be null)
	 */
	public static Boolean notEquals(ValueSpecification left, ValueSpecification right) {
		return notEquals(compare(left, right));
	}
}