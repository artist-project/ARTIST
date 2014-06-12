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
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralReal;
import org.eclipse.uml2.uml.LiteralSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;

public class ValueSpecificationComparator implements Comparator<Object> {
	
	private PolymorphicDispatcher<Integer> doCompareDispatcher = new PolymorphicDispatcher<>(
			"doCompare", 2, 2, Collections.singletonList(this));
	
	@Override
	public int compare(Object first, Object second) {
		if(first == null && second == null)
			return 0;
		if(first == null || second == null)
			throw new IllegalArgumentException("Not comparable.");
		Integer result = doCompareDispatcher.invoke(first, second);
		if(result == null)
			throw new IllegalArgumentException("Not comparable.");
		return result;
	}
	
	public Object evaluate(InstanceSpecification instance) {
		if(instance == null)
			return null;
		if(instance instanceof EnumerationLiteral)
			return evaluate((EnumerationLiteral) instance);
		return evaluate(instance.getSpecification());
	}
	
	public String evaluate(EnumerationLiteral literal) {
		return literal.getQualifiedName();
	}
	
	public Object evaluate(org.eclipse.uml2.uml.ValueSpecification valueSpecification) {
		if(valueSpecification instanceof org.eclipse.uml2.uml.Expression)
			throw new IllegalArgumentException("Expression not supported.");
		if(valueSpecification instanceof OpaqueExpression)
			throw new IllegalArgumentException("OpaqueExpression not supported.");
		
		if(valueSpecification instanceof LiteralSpecification)
			return evaluate((LiteralSpecification) valueSpecification);
		if(valueSpecification instanceof InstanceValue)
			return evaluate((InstanceValue) valueSpecification);
		return "";
	}
	
	public Object evaluate(LiteralSpecification literalSpec) {
		if(literalSpec instanceof LiteralBoolean)
			return literalSpec.booleanValue();
		if(literalSpec instanceof LiteralInteger)
			return new BigDecimal(Integer.toString(literalSpec.integerValue()));
		if(literalSpec instanceof LiteralReal)
			return new BigDecimal(Double.toString(literalSpec.realValue()));
		if(literalSpec instanceof LiteralString)
			return literalSpec.stringValue();
		if(literalSpec instanceof LiteralUnlimitedNatural)
			return ValueUtil.createUnlimitedLiteral();
		
		return ValueUtil.createNullLiteral();
	}
	
	public Object evaluate(InstanceValue instanceValue) {
		return evaluate(instanceValue.getInstance());
	}
	
	public Object evaluate(InstanceSpecificationExpression expression) {
		if(expression == null)
			return null;
		return evaluate(expression.getValue());
	}

	public Integer doCompare(InstanceSpecificationExpression first, InstanceSpecificationExpression second) {
		return doCompare(evaluate(first), evaluate(second));		
	}
	
	@SuppressWarnings("unchecked")
	public Integer doCompare(Object first, Object second) {
		if(!(first instanceof Comparable))
			throw new IllegalArgumentException("LHS of condition is not comparable: " + first);
		if(!(second instanceof Comparable))
			throw new IllegalArgumentException("RHS of condition is not comparable: " + second);
			
		Comparable<Object> firstComparable = (Comparable<Object>)first;
		Comparable<Object> secondComparable = (Comparable<Object>)second;
			
		return firstComparable.compareTo(secondComparable);
	}
		
	public Integer doCompare(BooleanLiteral first, BooleanLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public Integer doCompare(UnlimitedLiteral first, UnlimitedLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public Integer doCompare(StringLiteral first, StringLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public Integer doCompare(NumberLiteral first, NumberLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public Integer doCompare(NullLiteral first, NullLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public Integer doCompare(ObjectSpecificationExpression first, ObjectSpecificationExpression second) {
		Integer typeCompare = doCompare(first.getType(), second.getType());
		if(typeCompare != 0)
			return typeCompare; // not same type
		return compare(first.getValue(), second.getValue());
	}
	
	public Integer doCompare(Tuple first, Tuple second) {
		int compareSize = Integer.compare(first.getTuples().size(), second.getTuples().size());
		if(compareSize != 0)
			return compareSize; // not same number of values
		
		int compareValue;
		for(int i = 0; i < first.getTuples().size(); i++) {
			compareValue = compare(first.getTuples().get(i), second.getTuples().get(i));
			if(compareValue != 0)
				return compareValue; // not the same value
		}
		return 0;
	}
	
	public Integer doCompare(PropertyValuePair first, PropertyValuePair second) {
		Integer propertyCompare = compare(first.getProperty(), second.getProperty());
		if(propertyCompare != 0)
			return propertyCompare;
		return compare(first.getValue(), second.getValue());
	}
	
	public Integer doCompare(Property first, Property second) {
		return first.getQualifiedName().compareTo(second.getQualifiedName());
	}
	
	public Integer doCompare(Collection first, Collection second) {
		int compareSize = Integer.compare(first.getValues().size(), second.getValues().size());
		if(compareSize != 0)
			return compareSize; // not same number of values
		
		int compareValue;
		for(int i = 0; i < first.getValues().size(); i++) {
			compareValue = compare(first.getValues().get(i), second.getValues().get(i));
			if(compareValue != 0)
				return compareValue; // not the same value
		}
		return 0;
	}
	
	public Integer doCompare(DataType first, DataType second) {
		return first.getQualifiedName().compareTo(second.getQualifiedName());
	}
}