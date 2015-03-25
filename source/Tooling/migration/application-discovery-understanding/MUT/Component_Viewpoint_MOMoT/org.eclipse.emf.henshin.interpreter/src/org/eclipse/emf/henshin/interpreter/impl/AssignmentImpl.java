/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Default {@link Assignment} implementation.
 * 
 * @author Christian Krause
 */
public class AssignmentImpl implements Assignment {

	// The target unit (actually final):
	protected Unit unit;
	
	// Map for storing the assigned values:
	protected final Map<Object,Object> values = new HashMap<Object,Object>();
	
	// Whether this is a result assignment:
	protected final boolean isResult; 
	
	/**
	 * Default constructor.
	 * @param rule Rule to be matched.
	 */
	public AssignmentImpl(Unit unit) {
		this (unit, false);
	}

	/**
	 * Constructor.
	 */
	public AssignmentImpl(Unit unit, boolean isResult) {
		this.isResult = isResult;
		setUnit(unit);
	}
	
	/**
	 * Constructor which copies an assignment.
	 * @param assignment Assignment to be copied.
	 */
	public AssignmentImpl(Assignment assignment, boolean isResultAssignment) {
		this.isResult = isResultAssignment;
		setUnit(assignment.getUnit());
		copyParameterValues(assignment);
	}
	
	/*
	 * Set the internal unit for this unit application.
	 */
	protected void setUnit(Unit unit) {
		if (unit==null) {
			throw new NullPointerException("Unit cannot be null");
		}
		this.unit = unit;
	}
	
	/*
	 * Copy the parameter values from an assignment into this assignment.
	 */
	protected void copyParameterValues(Assignment assignment) {
		for (Parameter param : unit.getParameters()) {
			setParameterValue(param, assignment.getParameterValue(param));
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#getUnit()
	 */
	@Override
	public Unit getUnit() {
		return unit;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#getParameterValue(org.eclipse.emf.henshin.model.Parameter)
	 */
	@Override
	public Object getParameterValue(Parameter param) {
		return values.get(param);
	}

	/*
	 * Set a value or remove a key.
	 */
	protected void setValue(Object key, Object value) {
		if (value==null) {
			values.remove(key);
		} else {
			values.put(key, value);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#setParameterValue(org.eclipse.emf.henshin.model.Parameter, java.lang.Object)
	 */
	@Override
	public void setParameterValue(Parameter param, Object value) {
		setValue(param, value);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#getParameterValues()
	 */
	@Override
	public List<Object> getParameterValues() {
		List<Object> paramValues = new ArrayList<Object>();
		for (Parameter param : unit.getParameters()) {
			if (values.containsKey(param)) {
				paramValues.add(values.get(param));
			}
		}
		return paramValues;
	}
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#clear()
	 */
	@Override
	public void clear() {
		values.clear();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return values.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return values.hashCode();
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Assignment) {
			Assignment a = (Assignment) obj;
			if (unit!=a.getUnit()) {
				return false;
			}
			if (isResult!=a.isResult()) {
				return false;
			}
			for (Parameter param : unit.getParameters()) {
				Object v1 = values.get(param);
				Object v2 = a.getParameterValue(param);
				if ((v1==null && v2!=null) || (v1!=null && !v1.equals(v2))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (isResult) {
			return "Result assignment for unit '" + unit.getName() + "':\n" + toStringWithIndent("");
		} else {
			return "Assignment for unit '" + unit.getName() + "':\n" + toStringWithIndent("");			
		}
	}
	
	/*
	 * toString helper.
	 */
	protected String toStringWithIndent(String indent) {
		if (unit.getParameters().isEmpty()) {
			return indent + "- no parameters\n";
		}
		String result = "";
		for (Parameter param : unit.getParameters()) {
			Object value = getParameterValue(param);
			if (value!=null) {
				result = result + indent + "- parameter '" + param.getName() + "' => " + 
							InterpreterUtil.objectToString(value) + "\n";
			}
		}
		return result;
		
	}
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Assignment#isResultAssignment()
	 */
	@Override
	public boolean isResult() {
		return isResult;
	}

}
