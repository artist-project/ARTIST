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
package eu.artist.postmigration.nfrvt.lang.util;

import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.RelationalLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.ValueSpecificationComparator;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;

public class MigrationComparator implements Comparator<Object> {
	
	private ValueSpecificationComparator valueSpecificationComparator = new ValueSpecificationComparator();
	
	private PolymorphicDispatcher<Integer> doCompareDispatcher = new PolymorphicDispatcher<>(
			"doCompare", 2, 2, Collections.singletonList(this));
	
	protected Integer compareFQN(EObject first, EObject second) {
		String firstFQN = MigrationResourceUtil.getFullyQualifiedName(first);
		String secondFQN = MigrationResourceUtil.getFullyQualifiedName(second);
		if(firstFQN == null || secondFQN == null)
			throw new IllegalArgumentException("No FQN for both objects generatable: " + first + ", " + second); 
		return compare(firstFQN, secondFQN);
	}
	
	@Override
	public int compare(Object first, Object second) {
		if(first == null && second == null)
			return 0;
		if(first == null || second == null)
			throw new IllegalArgumentException("Not comparable: " + first + ", " + second);
		Integer result = doCompareDispatcher.invoke(first, second); // delegate
		if(result == null)
			throw new IllegalArgumentException("Not comparable: " + first + ", " + second);
		return result;
	}
	
	public boolean equals(Object first, Object second) {
		return RelationalLogic.equals(compare(first, second));
	}
	
	@SuppressWarnings("unchecked")
	public Integer doCompare(Object first, Object second) {
		if(!(first instanceof Comparable))
			throw new IllegalArgumentException(first + " is not comparable.");
		if(!(second instanceof Comparable))
			throw new IllegalArgumentException(second + " is not comparable.");
		
		Comparable<Object> firstComparable = (Comparable<Object>)first;
		Comparable<Object> secondComparable = (Comparable<Object>)second;
		
		return firstComparable.compareTo(secondComparable);
	}
	
	/**
	 * Compares the first given value specification with the second one.
	 * 
	 * @param first
	 * @param second
	 * @return value according to {@link #compare(Object, Object)}
	 */
	public Integer doCompare(ValueSpecification first, ValueSpecification second) {
		return valueSpecificationComparator.compare(first, second);
	}
	
	/**
	 * Compares the first given applied property with the second one.
	 * 
	 * @param first
	 * @param second
	 * @return value according to {@link #compare(Object, Object)}
	 */
	public Integer doCompare(AppliedProperty first, AppliedProperty second) {
		return compareFQN(first.getProperty(), second.getProperty());
	}

	/**
	 * Compares the first given eobjects with the second one.
	 * 
	 * @param first
	 * @param second
	 * @return value according to {@link #compare(Object, Object)}
	 */
	public Integer doCompare(EObject first, EObject second) {
		return compareFQN(first, second);
	}
	
	/**
	 * Compares the first given applied quantitative property expression with 
	 * the second one.
	 * 
	 * @param first
	 * @param second
	 * @return value according to {@link #compare(Object, Object)}
	 */
	public Integer doCompare(AppliedQuantitativePropertyExpression first, AppliedQuantitativePropertyExpression second) {
		return doCompare(first.getValue(), second.getValue());
	}
}
