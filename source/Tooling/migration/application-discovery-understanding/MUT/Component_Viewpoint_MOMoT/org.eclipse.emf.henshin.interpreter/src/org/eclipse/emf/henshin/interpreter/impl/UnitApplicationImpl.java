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
import java.util.List;
import java.util.Random;
import java.util.Stack;

import javax.script.ScriptEngine;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.ConditionalUnit;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.IteratedUnit;
import org.eclipse.emf.henshin.model.LoopUnit;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.PriorityUnit;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.SequentialUnit;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Default {@link UnitApplication} implementation.
 * 
 * @author Enrico Biermann, Gregor Bonifer, Christian Krause
 */
public class UnitApplicationImpl extends AbstractApplicationImpl {
	
	// Parameter assignments:
	protected Assignment assignment, resultAssignment;
	
	// Applied and undone rules:
	protected final Stack<RuleApplication> appliedRules, undoneRules;
	
	/**
	 * Default constructor.
	 * @param engine Engine to be used.
	 */
	public UnitApplicationImpl(Engine engine) {
		super(engine);
		appliedRules = new Stack<RuleApplication>();
		undoneRules = new Stack<RuleApplication>();
	}

	/**
	 * Convenience constructor.
	 * @param engine Engine to be used.
	 * @param graph Target graph.
	 * @param unit Unit to be used.
	 * @param assignment Assignment.
	 */
	public UnitApplicationImpl(Engine engine, EGraph graph, Unit unit, Assignment assignment) {
		this(engine);
		setEGraph(graph);
		setUnit(unit);
		setAssignment(assignment);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#execute(org.eclipse.emf.henshin.interpreter.ApplicationMonitor)
	 */
	@Override
	public boolean execute(ApplicationMonitor monitor) {
		if (monitor==null) {
			monitor = InterpreterFactory.INSTANCE.createApplicationMonitor();
		}
		appliedRules.clear();
		undoneRules.clear();
		resultAssignment = (assignment!=null) ? 
				new AssignmentImpl(assignment, true) : 
				new AssignmentImpl(unit, true);
		return doExecute(monitor);
	}

	/*
	 * Do execute a unit. Assumes that the monitor and the result assignment is set.
	 */
	protected boolean doExecute(ApplicationMonitor monitor) {
		if (unit.isActivated()) {
			switch (unit.eClass().getClassifierID()) {
				case HenshinPackage.RULE:
					return executeRule(monitor);
				case HenshinPackage.INDEPENDENT_UNIT:
					return executeIndependentUnit(monitor);
				case HenshinPackage.SEQUENTIAL_UNIT:
					return executeSequentialUnit(monitor);
				case HenshinPackage.CONDITIONAL_UNIT:
					return executeConditionalUnit(monitor);
				case HenshinPackage.PRIORITY_UNIT:
					return executePriorityUnit(monitor);
				case HenshinPackage.ITERATED_UNIT:
					return executeIteratedUnit(monitor);
				case HenshinPackage.LOOP_UNIT:
					return executeLoopUnit(monitor);
				default:
					return false;
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#undo(org.eclipse.emf.henshin.interpreter.ApplicationMonitor)
	 */
	@Override
	public boolean undo(ApplicationMonitor monitor) {
		if (appliedRules.isEmpty()) {
			return true;
		}
		if (monitor==null) {
			monitor = InterpreterFactory.INSTANCE.createApplicationMonitor();
		}
		boolean success = true;
		while (!appliedRules.isEmpty()) {
			RuleApplication ruleApplication = appliedRules.pop();
			if (!ruleApplication.undo(monitor)) {
				success = false;
				break;
			}
			undoneRules.push(ruleApplication);
		}
		monitor.notifyUndo(this, success);
		return success;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#redo(org.eclipse.emf.henshin.interpreter.ApplicationMonitor)
	 */
	@Override
	public boolean redo(ApplicationMonitor monitor) {
		if (undoneRules.isEmpty()) {
			return true;
		}
		if (monitor==null) {
			monitor = InterpreterFactory.INSTANCE.createApplicationMonitor();
		}
		boolean success = true;
		while (!undoneRules.isEmpty()) {
			RuleApplication ruleApplication = undoneRules.pop();
			if (!ruleApplication.redo(monitor)) {
				success = false;
				break;
			}
			appliedRules.push(ruleApplication);
		}
		monitor.notifyRedo(this, success);
		return success;
	}
	
	/*
	 * Execute a Rule.
	 */
	protected boolean executeRule(ApplicationMonitor monitor) {
		Rule rule = (Rule) unit;
		RuleApplication ruleApp = new RuleApplicationImpl(engine, graph, rule, resultAssignment);
		if (ruleApp.execute(monitor)) {
			resultAssignment = new AssignmentImpl(ruleApp.getResultMatch(), true);
			appliedRules.push(ruleApp);
			return true;  // notification is done in the rule application
		} else {
			return false;
		}
	}

	/*
	 * Execute an IndependentUnit.
	 */
	protected boolean executeIndependentUnit(ApplicationMonitor monitor) {
		IndependentUnit indepUnit = (IndependentUnit) unit;
		List<Unit> subUnits = new ArrayList<Unit>(indepUnit.getSubUnits());
		boolean success = false;
		while (!subUnits.isEmpty()) {
			if (monitor.isCanceled()) {
				if (monitor.isUndo()) undo(monitor);
				break;
			}
			int index = new Random().nextInt(subUnits.size());
			UnitApplicationImpl unitApp = createApplicationFor(subUnits.remove(index));
			if (unitApp.execute(monitor)) {
				updateParameterValues(unitApp);
				appliedRules.addAll(unitApp.appliedRules);
				success = true;
				break;
			}
		}
		monitor.notifyExecute(this, success);
		return success;
	}
	
	/*
	 * Execute a SequentialUnit.
	 */
	protected boolean executeSequentialUnit(ApplicationMonitor monitor) {
		SequentialUnit seqUnit = (SequentialUnit) unit;
		boolean success = true;
		for (Unit subUnit : seqUnit.getSubUnits()) {
			if (monitor.isCanceled()) {
				if (monitor.isUndo()) undo(monitor);
				success = false;
				break;
			}
			UnitApplicationImpl unitApp = createApplicationFor(subUnit);
			if (unitApp.execute(monitor)) {
				updateParameterValues(unitApp);
				appliedRules.addAll(unitApp.appliedRules);
			} else {
				if (seqUnit.isStrict()) {
					success = false;
					if (seqUnit.isRollback()) {
						undo(monitor);
					}
				}
				break;
			}
		}
		monitor.notifyExecute(this, success);
		return success;
	}
	
	/*
	 * Execute a ConditionalUnit.
	 */
	protected boolean executeConditionalUnit(ApplicationMonitor monitor) {
		boolean success = false;
		ConditionalUnit condUnit = (ConditionalUnit) unit;
		UnitApplicationImpl ifUnitApp = createApplicationFor(condUnit.getIf());
		if (ifUnitApp.execute(monitor)) {
			updateParameterValues(ifUnitApp);
			appliedRules.addAll(ifUnitApp.appliedRules);
			UnitApplicationImpl thenUnitApp = createApplicationFor(condUnit.getThen());
			success = thenUnitApp.execute(monitor);
			if (success) {
				updateParameterValues(thenUnitApp);
			}
			appliedRules.addAll(thenUnitApp.appliedRules);
		} else {
			if (condUnit.getElse() != null) {
				UnitApplicationImpl elseUnitApp = createApplicationFor(condUnit.getElse());
				success = elseUnitApp.execute(monitor);
				if (success) {
					updateParameterValues(elseUnitApp);
				}
				appliedRules.addAll(elseUnitApp.appliedRules);
			}
		}
		if (monitor.isCanceled()) {
			if (monitor.isUndo()) undo(monitor);
			monitor.notifyExecute(this, false);
			return false;
		}
		if (!success) {
			undo(monitor);
		}
		monitor.notifyExecute(this, success);
		return success;
	}
	
	/*
	 * Execute a PriorityUnit.
	 */
	protected boolean executePriorityUnit(ApplicationMonitor monitor) {
		PriorityUnit priUnit = (PriorityUnit) unit;
		boolean success = false;
		for (Unit subUnit : priUnit.getSubUnits()) {
			if (monitor.isCanceled()) {
				if (monitor.isUndo()) undo(monitor);				
				break;
			}
			UnitApplicationImpl unitApp = createApplicationFor(subUnit);
			if (unitApp.execute(monitor)) {
				updateParameterValues(unitApp);
				appliedRules.addAll(unitApp.appliedRules);
				success = true;
				break;
			}
		}
		monitor.notifyExecute(this, success);
		return success;
	}
	
	/*
	 * Execute an IteratedUnit.
	 */
	protected boolean executeIteratedUnit(ApplicationMonitor monitor) {
		IteratedUnit iteratedUnit = (IteratedUnit) unit;
		
		// Determine the number of iterations:
		String itersString = iteratedUnit.getIterations();
		if (itersString==null) {
			return false;
		}
		itersString = itersString.trim();
		int iterations = 0;
		boolean ok = false;
		
		// Constant?
		try {
			iterations = Integer.parseInt(itersString);
			ok = true;
		} catch (NumberFormatException e) {}
		
		// Parameter?
		if (!ok) {
			for (Parameter param : unit.getParameters()) {
				if (itersString.equals(param.getName())) {
					Object v = resultAssignment.getParameterValue(param);
					if (v instanceof Number) {
						iterations = ((Number) v).intValue();
						ok = true;
						break;						
					} else {
						return false;
					}
				}
			}
		}
		
		// We need the script engine...
		if (!ok) {
			try {
				ScriptEngine scriptEngine = engine.getScriptEngine();
				for (Parameter param : unit.getParameters()) {
					scriptEngine.put(param.getName(), resultAssignment.getParameterValue(param));
				}
				Object value = scriptEngine.eval(itersString);
				if (value==null) {
					throw new RuntimeException("Error determining number of iterations for unit '" + iteratedUnit.getName() + "'");
				}
				String valueString = value.toString();
				int index = valueString.indexOf('.');
				if (index==0) {
					valueString = "0";
				} else if (index>0) {
					valueString = valueString.substring(0, index);
				}
				iterations = Integer.parseInt(valueString);
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		// Now apply the subunit n times:
		boolean success = true;
		for (int i=0; i<iterations; i++) {
			if (monitor.isCanceled()) {
				if (monitor.isUndo()) undo(monitor);
				success = false;
				break;
			}
			UnitApplicationImpl unitApp = createApplicationFor(iteratedUnit.getSubUnit());
			if (unitApp.execute(monitor)) {
				updateParameterValues(unitApp);
				appliedRules.addAll(unitApp.appliedRules);
			} else {
				success = false;
				break;
			}
		}
		monitor.notifyExecute(this, success);
		return success;
	}

	/*
	 * Execute a LoopUnit.
	 */
	protected boolean executeLoopUnit(ApplicationMonitor monitor) {
		LoopUnit loopUnit = (LoopUnit) unit;
		boolean success = true;
		while (true) {
			if (monitor.isCanceled()) {
				if (monitor.isUndo()) undo(monitor);
				success = false;
				break;
			}
			UnitApplicationImpl unitApp = createApplicationFor(loopUnit.getSubUnit());
			if (unitApp.execute(monitor)) {
				updateParameterValues(unitApp);
				appliedRules.addAll(unitApp.appliedRules);
			} else {
				break;
			}
		}
		monitor.notifyExecute(this, success);
		return success;
	}

	/*
	 * Create an ApplicationUnit for a given Unit.
	 */
	protected UnitApplicationImpl createApplicationFor(Unit subUnit) {
		if (resultAssignment==null) {
			resultAssignment = new AssignmentImpl(unit);
		}
		Assignment assign = new AssignmentImpl(subUnit);
		for (ParameterMapping mapping : unit.getParameterMappings()) {
			Parameter source = mapping.getSource();
			Parameter target = mapping.getTarget();
			if (target.getUnit()==subUnit) {
				assign.setParameterValue(target, resultAssignment.getParameterValue(source));
			}
		}
		return new UnitApplicationImpl(engine, graph, subUnit, assign);
	}
	
	/*
	 * Update the parameter values.
	 */
	protected void updateParameterValues(UnitApplicationImpl subUnitApp) {
		if (resultAssignment==null) {
			resultAssignment = new AssignmentImpl(unit);
		}
		for (ParameterMapping mapping : unit.getParameterMappings()) {
			Parameter source = mapping.getSource();
			Parameter target = mapping.getTarget();
			if (source.getUnit()==subUnitApp.getUnit()) {
				Parameter param = subUnitApp.getUnit().getParameter(source.getName());
				if (param!=null) {
					Object value = subUnitApp.getResultAssignment().getParameterValue(param);
					if (value!=null) {
						resultAssignment.setParameterValue(target, value);
					}
				}
			}
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getAssignment()
	 */
	@Override
	public Assignment getAssignment() {
		return assignment;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#setAssignment(org.eclipse.emf.henshin.interpreter.Assignment)
	 */
	@Override
	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getResultAssignment()
	 */
	@Override
	public Assignment getResultAssignment() {
		return resultAssignment;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getParameterValue(java.lang.String)
	 */
	@Override
	public Object getResultParameterValue(String paramName) {
		if (unit==null) {
			throw new RuntimeException("Transformation unit not set");
		}
		Parameter param = unit.getParameter(paramName);
		if (param==null) {
			throw new RuntimeException("No parameter \"" + paramName + "\" in transformation unit \"" + unit.getName() + "\" found" );
		}
		if (resultAssignment!=null) {
			return resultAssignment.getParameterValue(param);
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
			throw new RuntimeException("Unit not set");
		}
		Parameter param = unit.getParameter(paramName);
		if (param==null) {
			throw new RuntimeException("No parameter \"" + paramName + "\" in unit \"" + unit.getName() + "\" found" );
		}
		if (assignment==null) {
			assignment = new AssignmentImpl(unit);
		}
		assignment.setParameterValue(param, value);
	}
	
	/**
	 * Get the applied rules of this unit application.
	 * @return List of applied rules.
	 */
	public List<RuleApplication> getAppliedRules() {
		return new ArrayList<RuleApplication>(appliedRules);
	}

	/**
	 * Get the undone rules of this unit application.
	 * @return List of undone rules.
	 */
	public List<RuleApplication> getUndoneRules() {
		return new ArrayList<RuleApplication>(undoneRules);
	}
	
}
