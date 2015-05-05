/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
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
package eu.artist.postmigration.opgml.operator;

import java.io.Serializable;

import org.moeaframework.core.comparator.AggregateConstraintComparator;
import org.moeaframework.core.comparator.ChainedComparator;

public class SumParetoDominanceComparator extends ChainedComparator implements
Serializable {

	private static final long serialVersionUID = -7790869259127456407L;

	public SumParetoDominanceComparator() {
		super(new AggregateConstraintComparator(),
				new SumParetoObjectiveComparator());
	}
}
