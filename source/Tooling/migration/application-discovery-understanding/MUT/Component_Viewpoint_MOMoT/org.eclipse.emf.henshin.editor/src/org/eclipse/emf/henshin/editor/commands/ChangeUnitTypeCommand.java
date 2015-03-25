/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.commands;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.ConditionalUnit;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.PriorityUnit;
import org.eclipse.emf.henshin.model.SequentialUnit;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Allows {@link Unit}s to be replaced by other Units (currently implemented:
 * Switch between Sequential, Independent, Priority Units)
 * 
 * @author Felix Rieger
 * 
 */
public class ChangeUnitTypeCommand extends AbstractCommand {

	protected Unit unit; // old unit
	protected Unit newUnit; // new unit
	protected int oldUnitType;
	protected int newUnitType;
	protected Collection<?> affectedObjects;
	protected Module module;

	public ChangeUnitTypeCommand(Unit unit, int newUnitType) {
		this.unit = unit;
		this.newUnitType = newUnitType;
		if (unit != null) {
			module = (Module) unit.eContainer();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		// save the old unit's type for undo
		if (unit instanceof IndependentUnit) {
			oldUnitType = 1;
		} else if (unit instanceof SequentialUnit) {
			oldUnitType = 2;
		} else if (unit instanceof PriorityUnit) {
			oldUnitType = 3;
		}
		redo();

	}

	private void replaceUnit() {
		// get the module that contains the unit
		Module theModule = module;
		int unitIndex = theModule.getUnits().indexOf(unit); 

		if (unitIndex == -1) {
			unitIndex = theModule.getUnits().indexOf(newUnit); 
			System.err.println("unit index -1:" + unit + "\n trying [result: "
					+ unitIndex + "] " + newUnit);
		}
		newUnit = null; // prepare a new unit
		EList<Unit> subUnitList = null; // and its subunits

		// independent, sequential and priority units can be switched
		switch (newUnitType) {
		case 1:
			newUnit = HenshinFactory.eINSTANCE.createIndependentUnit();
			subUnitList = ((IndependentUnit) newUnit).getSubUnits();
			break;
		case 2:
			newUnit = HenshinFactory.eINSTANCE.createSequentialUnit();
			subUnitList = ((SequentialUnit) newUnit).getSubUnits();
			break;
		case 3:
			newUnit = HenshinFactory.eINSTANCE.createPriorityUnit();
			subUnitList = ((PriorityUnit) newUnit).getSubUnits();
			break;
		default:
			return;
		}

		// copy the old unit's attributes, subunits, parameters and parameter
		// mapping
		subUnitList.addAll(unit.getSubUnits(false));
		newUnit.setName(unit.getName());
		newUnit.setActivated(unit.isActivated());
		newUnit.setDescription(unit.getDescription());
		newUnit.getParameters().addAll(unit.getParameters());
		newUnit.getParameterMappings().addAll(unit.getParameterMappings());
		// remove the old unit from the transformation system, add the new unit
		if (unitIndex != -1) {
			theModule.getUnits().remove(unitIndex);
			theModule.getUnits().add(unitIndex, newUnit);
		} else {
			System.err.println("COULDN'T FIND UNITS IN MODULE, ADDING A NEW ONE");
			System.err.println(unit);
			System.err.println(newUnit);
			theModule.getUnits().add(newUnit);
		}

		// search for the old unit in the transformation system
		for (Unit tu : theModule.getUnits()) {
			if (tu.getSubUnits(true).contains(unit)) {
				changeParameterMappingsRec(tu, unit, newUnit); // change
				// parameter
				// mappings to
				// the new unit
				replaceUnitRec(tu, unit, newUnit); // replace references to the
				// old unit
			}
		}

	}

	/**
	 * Recursively change parameter mappings
	 * 
	 * @param parentUnit
	 *            the Unit where the recursion should start
	 * @param oldUnit
	 *            the unit to be replaced
	 * @param newUnit
	 *            the new unit
	 */
	private void changeParameterMappingsRec(Unit parentUnit, Unit oldUnit,
			Unit newUnit) {
		for (Unit tu : parentUnit.getSubUnits(false)) {
			if (tu != parentUnit) { // do not recurse infinitely
				if (tu.equals(oldUnit)) {
					changeParameterMappings(parentUnit, tu, newUnit);
				}
				if (tu.getSubUnits(false).size() > 0) {
					changeParameterMappingsRec(tu, oldUnit, newUnit);
				}
			}
		}

	}

	/**
	 * Recursively replace Units
	 * 
	 * @param parentUnit
	 *            The Unit where the recursion should start
	 * @param oldUnit
	 *            The Unit to be replaced
	 * @param newUnit
	 *            The new Unit
	 */
	private void replaceUnitRec(Unit parentUnit, Unit oldUnit, Unit newUnit) {
		EList<Unit> subUnitList = null;

		if (parentUnit instanceof SequentialUnit) {
			subUnitList = ((SequentialUnit) parentUnit).getSubUnits();
		} else if (parentUnit instanceof IndependentUnit) {
			subUnitList = ((IndependentUnit) parentUnit).getSubUnits();
		} else if (parentUnit instanceof PriorityUnit) {
			subUnitList = ((PriorityUnit) parentUnit).getSubUnits();
		} else if (parentUnit instanceof ConditionalUnit) {
			ConditionalUnit cu = (ConditionalUnit) parentUnit;
			if (cu.getIf().equals(oldUnit)) {
				cu.setIf(newUnit);
			}
			if (cu.getThen().equals(oldUnit)) {
				cu.setThen(newUnit);
			}
			if (cu.getElse().equals(oldUnit)) {
				cu.setElse(newUnit);
			}
			return;
		}

		// remove the old unit and replace it with the new unit
		while (subUnitList.contains(oldUnit)) {
			int i = subUnitList.indexOf(oldUnit);
			subUnitList.remove(i);
			subUnitList.add(i, newUnit);
		}

		// recursively replace all old units with new units
		for (Unit tu : subUnitList) {
			// do not replace if the current unit is the parent unit, as this
			// leads to an infinite recursion
			if ((!(tu.equals(newUnit)))
					&& tu.getSubUnits(true).contains(oldUnit)
					&& (tu != parentUnit)) {
				replaceUnitRec(tu, oldUnit, newUnit);
			}
		}
	}

	/**
	 * Change parameter mappings.
	 * 
	 * @param parentUnit
	 * @param oldUnit
	 * @param newUnit
	 */
	private void changeParameterMappings(Unit parentUnit, Unit oldUnit,
			Unit newUnit) {
		List<ParameterMapping> parameterMappings = parentUnit
				.getParameterMappings();
		for (ParameterMapping pm : parameterMappings) {
			if (pm.getSource().getUnit().equals(oldUnit)) {
				int oldParameterIndex = oldUnit.getParameters().indexOf(
						pm.getSource());
				Parameter newParameter = newUnit.getParameters().get(
						oldParameterIndex);
				pm.setSource(newParameter);
			}

			if (pm.getTarget().getUnit().equals(oldUnit)) {
				int oldParameterIndex = oldUnit.getParameters().indexOf(
						pm.getTarget());
				Parameter newParameter = newUnit.getParameters().get(
						oldParameterIndex);
				pm.setTarget(newParameter);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		if (newUnit != null) {

			Unit tmpUnit = unit;
			unit = newUnit;
			newUnit = tmpUnit;

			int unitIndex = module.getUnits().indexOf(unit);
			module.getUnits().remove(unitIndex);
			module.getUnits().add(unitIndex, newUnit);

			for (Unit tu : module.getUnits()) {
				if (tu.getSubUnits(true).contains(unit)) {
					changeParameterMappingsRec(tu, unit, newUnit); // change
					// parameter
					// mappings
					// to the
					// new unit
					replaceUnitRec(tu, unit, newUnit); // replace references to
					// the old unit
				}
			}
		} else {
			replaceUnit();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		Unit tmpUnit = unit;
		unit = newUnit;
		newUnit = tmpUnit;

		int unitIndex = module.getUnits().indexOf(unit);
		module.getUnits().remove(unitIndex);
		module.getUnits().add(unitIndex, newUnit);

		for (Unit current : module.getUnits()) {
			if (current.getSubUnits(true).contains(unit)) {
				changeParameterMappingsRec(current, unit, newUnit);
				replaceUnitRec(current, unit, newUnit);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		if ((unit instanceof IndependentUnit)
			|| (unit instanceof SequentialUnit)
			|| (unit instanceof PriorityUnit)) {
			return true;
		} else {
			return false;
		}
	}

}
