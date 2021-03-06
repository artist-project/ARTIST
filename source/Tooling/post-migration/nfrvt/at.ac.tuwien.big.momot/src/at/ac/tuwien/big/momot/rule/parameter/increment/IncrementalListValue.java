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
package at.ac.tuwien.big.momot.rule.parameter.increment;

import java.util.List;

import at.ac.tuwien.big.momot.rule.parameter.AbstractListValue;
import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class IncrementalListValue<T extends Object> extends AbstractListValue<T> implements IParameterValue<T> {

	private int index = 0;
	
	public IncrementalListValue(IParameterValue<T> value, int nrValues) {
		super(value, nrValues);
	}
	
	public IncrementalListValue(List<T> values) {
		super(values);
	}

	@Override
	protected int nextIndex() {
		int curIndex = index;
		index = (index + 1) % getValues().size();
		return curIndex;
	}
}
