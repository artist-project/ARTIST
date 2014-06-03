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

public class RelationalLogic {
	
	private static Comparator<ValueSpecification> valueSpecificationComparator;
	
	public static Comparator<ValueSpecification> getComparator() {
		if(valueSpecificationComparator == null)
			valueSpecificationComparator = new ValueSpecificationComparator();
		return valueSpecificationComparator;
	}
	
	public static void setComparator(Comparator<ValueSpecification> comparator) {
		RelationalLogic.valueSpecificationComparator = comparator;
	}
	
	public static Integer compare(ValueSpecification left, ValueSpecification right) {
		if(left == null || right == null)
			return null;
		return getComparator().compare(left, right);
	}
	
	public static Boolean greater(Integer compare) {
		if(compare == null)
			return null;
		return compare > 0;
	}
	
	public static Boolean greaterOrEqual(Integer compare) {
		if(compare == null)
			return null;
		return compare >= 0;
	}
	
	public static Boolean less(Integer compare) {
		if(compare == null)
			return null;
		return compare < 0;
	}
	
	public static Boolean lessOrEqual(Integer compare) {
		if(compare == null)
			return null;
		return compare <= 0;
	}
	
	public static Boolean equals(Integer compare) {
		if(compare == null)
			return null;
		return compare == 0;
	}
	
	public static Boolean notEquals(Integer compare) {
		if(compare == null)
			return null;
		return compare != 0;
	}
	
	public static Boolean greater(ValueSpecification left, ValueSpecification right) {
		return greater(compare(left, right));
	}
	
	public static Boolean greaterOrEqual(ValueSpecification left, ValueSpecification right) {
		return greaterOrEqual(compare(left, right));
	}
	
	public static Boolean less(ValueSpecification left, ValueSpecification right) {
		return less(compare(left, right));
	}
	
	public static Boolean lessOrEqual(ValueSpecification left, ValueSpecification right) {
		return lessOrEqual(compare(left, right));
	}
	
	public static Boolean equals(ValueSpecification left, ValueSpecification right) {
		return equals(compare(left, right));
	}
	
	public static Boolean notEquals(ValueSpecification left, ValueSpecification right) {
		return notEquals(compare(left, right));
	}
}