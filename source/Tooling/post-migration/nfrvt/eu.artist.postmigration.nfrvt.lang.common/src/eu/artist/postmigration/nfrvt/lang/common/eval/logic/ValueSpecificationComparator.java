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
import java.util.Comparator;

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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;

public class ValueSpecificationComparator implements Comparator<ValueSpecification> {
	
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
//			return ValueSpecificationCreator.createNullLiteral();
		return evaluate(expression.getValue());
	}

	@SuppressWarnings("unchecked")
	public int compare(InstanceSpecificationExpression first, InstanceSpecificationExpression second) {
		Object firstObj = evaluate(first);
		Object secondObj = evaluate(second);
		
		if(!(firstObj instanceof Comparable))
			throw new IllegalArgumentException("LHS of condition is not comparable: " + firstObj);
		if(!(secondObj instanceof Comparable))
			throw new IllegalArgumentException("RHS of condition is not comparable: " + secondObj);
			
		Comparable<Object> firstComparable = (Comparable<Object>)firstObj;
		Comparable<Object> secondComparable = (Comparable<Object>)secondObj;
			
		return firstComparable.compareTo(secondComparable);
	}
		
	public int compare(BooleanLiteral first, BooleanLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public int compare(UnlimitedLiteral first, UnlimitedLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public int compare(StringLiteral first, StringLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public int compare(NumberLiteral first, NumberLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	public int compare(NullLiteral first, NullLiteral second) {
		return first.getValue().compareTo(second.getValue());
	}
	
	@Override
	public int compare(ValueSpecification first, ValueSpecification second) {
		if(first instanceof InstanceSpecificationExpression && second instanceof InstanceSpecificationExpression)
			return compare((InstanceSpecificationExpression)first, (InstanceSpecificationExpression)second);
		
		if(first instanceof BooleanLiteral && second instanceof BooleanLiteral)
			return compare((BooleanLiteral)first, (BooleanLiteral)second);
		
		if(first instanceof NullLiteral && second instanceof NullLiteral)
			return compare((NullLiteral)first, (NullLiteral)second);
		
		if(first instanceof NumberLiteral && second instanceof NumberLiteral)
			return compare((NumberLiteral)first, (NumberLiteral)second);
		
		if(first instanceof StringLiteral && second instanceof StringLiteral)
			return compare((StringLiteral)first, (StringLiteral)second);
		
		if(first instanceof UnlimitedLiteral && second instanceof UnlimitedLiteral)
			return compare((UnlimitedLiteral)first, (UnlimitedLiteral)second);
		
		throw new IllegalArgumentException("Not comparable.");
	}
	
}