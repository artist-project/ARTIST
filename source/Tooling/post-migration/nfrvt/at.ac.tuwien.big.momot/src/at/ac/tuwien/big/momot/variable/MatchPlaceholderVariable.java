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
package at.ac.tuwien.big.momot.variable;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Unit;

import at.ac.tuwien.big.moea.variable.IPlaceholderVariable;

public class MatchPlaceholderVariable implements IMatchVariable , IPlaceholderVariable {

	private static final long serialVersionUID = -3254092590689885677L;

	@Override
	public Unit getUnit() {
		return null;
	}

	@Override
	public Object getParameterValue(Parameter param) {
		return null;
	}

	@Override
	public void setParameterValue(Parameter param, Object value) {
	}

	@Override
	public List<Object> getParameterValues() {
		return new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void clear() {		
	}

	@Override
	public boolean isResult() {
		return false;
	}

	@Override
	public MatchPlaceholderVariable copy() {
		return new MatchPlaceholderVariable();
	}
	
	@Override
	public String toString() {
		return "-EmptyMatch-\n";
	}

	@Override
	public int compareTo(IMatchVariable other) {
		if(other instanceof MatchPlaceholderVariable)
			return 0;
		return -1;
	}

}
