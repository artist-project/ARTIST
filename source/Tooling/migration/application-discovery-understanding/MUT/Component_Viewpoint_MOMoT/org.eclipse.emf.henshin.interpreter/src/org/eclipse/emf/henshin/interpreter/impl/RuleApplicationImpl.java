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

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.Change;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Default {@link RuleApplication} implementation.
 * 
 * @author Enrico Biermann, Gregor Bonifer, Christian Krause
 */
public class RuleApplicationImpl extends AbstractApplicationImpl implements RuleApplication {

	// Used matches:
	protected Match partialMatch, completeMatch, resultMatch;
	
	// Whether the complete match was derived from the partial match:
	protected boolean isCompleteMatchDerived;
	
	// Used change object:
	protected Change change;
	
	// Flag indicating whether the rule application was executed:
	protected boolean isExecuted, isUndone;
	
	/**
	 * Default constructor.
	 * @param engine Engine to be used.
	 */
	public RuleApplicationImpl(Engine engine) {
		super(engine);
		isExecuted = false;
		isUndone = false;
		isCompleteMatchDerived = false;
	}

	/**
	 * Default constructor.
	 * @param engine Engine to be used.
	 * @param graph Object graph to be transformed.
	 * @param rule Rule to be applied.
	 * @param partialMatch Partial match or assignment.
	 */
	public RuleApplicationImpl(Engine engine, EGraph graph, Rule rule, Assignment partialMatch) {
		this(engine);
		setEGraph(graph);
		setRule(rule);
		setAssignment(partialMatch);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#execute(org.eclipse.emf.henshin.interpreter.ApplicationMonitor)
	 */
	@Override
	public boolean execute(ApplicationMonitor monitor) {
		if (unit==null) {
			throw new NullPointerException("No transformation unit set");
		}
		// Already executed?
		if (isExecuted) {
			if (isCompleteMatchDerived) {
				completeMatch = null;  // reset the complete match if it was derived
				isCompleteMatchDerived = false;				
			}
			isExecuted = false;
			isUndone = false;
			change = null;
			resultMatch = null;
		}
		// Do we need to derive a complete match?
		if (completeMatch==null) {
			completeMatch = engine.findMatches((Rule) unit, graph, partialMatch).iterator().next();
			isCompleteMatchDerived = true;
		}
		if (completeMatch==null) {
			if (monitor!=null) {
				monitor.notifyExecute(this, false);
			}
			return false;
		}
		resultMatch = new MatchImpl((Rule) unit, true);
		change = engine.createChange((Rule) unit, graph, completeMatch, resultMatch);
		if (change==null) {
			if (monitor!=null) {
				monitor.notifyExecute(this, false);
			}
			return false;
		}
		change.applyAndReverse();
		isExecuted = true;
		if (monitor!=null) {
			monitor.notifyExecute(this, true);
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#undo()
	 */
	@Override
	public boolean undo(ApplicationMonitor monitor) {
		boolean success = false;
		if (isExecuted && !isUndone) {
			change.applyAndReverse();
			isUndone = true;
			success = true;
		}
		if (monitor!=null) {
			monitor.notifyUndo(this, success);
		}
		return success;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#redo(org.eclipse.emf.henshin.interpreter.ApplicationMonitor)
	 */
	public boolean redo(ApplicationMonitor monitor) {
		boolean success = false;
		if (isExecuted && isUndone) {
			change.applyAndReverse();
			isUndone = false;
			success = true;
		}
		if (monitor!=null) {
			monitor.notifyUndo(this, success);
		}
		return success;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#getRule()
	 */
	@Override
	public Rule getRule() {
		return (Rule) unit;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#setRule(org.eclipse.emf.henshin.model.Rule)
	 */
	@Override
	public void setRule(Rule rule) {
		setUnit(rule);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.AbstractApplicationImpl#setUnit(org.eclipse.emf.henshin.model.Unit)
	 */
	@Override
	public void setUnit(Unit unit) {
		if (unit!=null && !(unit instanceof Rule)) {
			throw new IllegalArgumentException("Unit must be a rule");
		}
		if (this.unit!=unit){
			this.unit = unit;
			this.partialMatch = null;
			this.completeMatch = null;
			this.resultMatch = null;
			this.change = null;
			this.isExecuted = false;
			this.isUndone = false;
			this.isCompleteMatchDerived = false;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getAssignment()
	 */
	@Override
	public Assignment getAssignment() {
		return partialMatch;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#setAssignment(org.eclipse.emf.henshin.interpreter.Assignment)
	 */
	@Override
	public void setAssignment(Assignment assignment) {
		if (assignment==null) {
			partialMatch = null;
		}
		else if (assignment instanceof Match) {
			partialMatch = (Match) assignment;
		}
		else {
			partialMatch = new MatchImpl(assignment, false);
		}
		this.completeMatch = null;
		this.resultMatch = null;
		this.change = null;
		this.isExecuted = false;
		this.isUndone = false;
		this.isCompleteMatchDerived = false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getParameterValue(java.lang.String)
	 */
	@Override
	public Object getResultParameterValue(String paramName) {
		if (unit==null) {
			throw new RuntimeException("Rule not set");
		}
		Parameter param = unit.getParameter(paramName);
		if (param==null) {
			throw new RuntimeException("No parameter \"" + paramName + "\" in rule \"" + unit.getName() + "\" found" );
		}
		if (resultMatch!=null) {
			return resultMatch.getParameterValue(param);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#setParameterValue(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setParameterValue(String paramName, Object value) {
		if (unit==null) {
			throw new RuntimeException("Rule not set");
		}
		Parameter param = unit.getParameter(paramName);
		if (param==null) {
			throw new RuntimeException("No parameter \"" + paramName + "\" in rule \"" + unit.getName() + "\" found" );
		}
		if (partialMatch==null) {
			partialMatch = new MatchImpl((Rule) unit);
		}
		partialMatch.setParameterValue(param, value);
		completeMatch = null;
		isCompleteMatchDerived = false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#getPartialMatch()
	 */
	@Override
	public Match getPartialMatch() {
		return partialMatch;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#setPartialMatch(org.eclipse.emf.henshin.interpreter.Match)
	 */
	@Override
	public void setPartialMatch(Match partialMatch) {
		this.partialMatch = partialMatch; 
		this.completeMatch = null;
		this.resultMatch = null;
		this.change = null;
		this.isExecuted = false;
		this.isUndone = false;
		this.isCompleteMatchDerived = false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#getCompleteMatch()
	 */
	@Override
	public Match getCompleteMatch() {
		return completeMatch;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#setCompleteMatch(org.eclipse.emf.henshin.interpreter.Match)
	 */
	@Override
	public void setCompleteMatch(Match completeMatch) {
		// don't change the partial match
		this.completeMatch = completeMatch;
		this.resultMatch = null;
		this.change = null;
		this.isExecuted = false;
		this.isUndone = false;
		this.isCompleteMatchDerived = false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.RuleApplication#getResultMatch()
	 */
	@Override
	public Match getResultMatch() {
		return resultMatch;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getResultAssignment()
	 */
	@Override
	public Assignment getResultAssignment() {
		return resultMatch;
	}
	
}