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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Creates a {@link ParameterMapping} between two given {@link Parameter}s.
 * 
 * 
 * @author Stefan Jurack (sjurack)
 */
public class CreateParameterMappingCommand extends AbstractCommand {
	
	protected Parameter source;
	protected Parameter target;
	Unit sourceUnit, targetUnit, ownerUnit;
	protected ParameterMapping mapping;
	protected Collection<?> affectedObjects;
	
	public CreateParameterMappingCommand(Parameter source, Parameter target) {
		this.source = source;
		this.target = target;
	}
	
	/**
	 * Checks if a parameter mappings already exists. This method shall hint the
	 * wrapping action to appear enabled or disabled.
	 * 
	 * @return
	 */
	public boolean isEnabled() {
		if (this.canExecute()) {
			
			// Check if there already exists such a parameter mapping
			for (ParameterMapping pm : ownerUnit.getParameterMappings()) {
				if (pm.getSource().equals(this.source) && pm.getTarget().equals(this.target))
					return false;
			}// for
			return true;
		}// if
		return false;
	}// isEnabled
	
	/*
	 * Checks if a parameter mapping between the given parameters is principally
	 * possible. However, is NOT checked, whether a mapping already exists.
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		
		if (QuantUtil.anyNull(source, target) || QuantUtil.allIdentical(source, target))
			return false;
		
		/*
		 * Check if one of both parameter's parent unit refers the other's
		 * parent unit.
		 */

		// (1)
		sourceUnit = source.getUnit();
		targetUnit = target.getUnit();
		
		if (sourceUnit.getSubUnits(false).contains(targetUnit))
			ownerUnit = sourceUnit;
		else if (targetUnit.getSubUnits(false).contains(sourceUnit))
			ownerUnit = targetUnit;
		else
			ownerUnit = null;
		
		if (ownerUnit == null) return false;
		
		return true;
	}// prepare
	
	@Override
	public void execute() {
		
		mapping = HenshinFactory.eINSTANCE.createParameterMapping();
		mapping.setSource(source);
		mapping.setTarget(target);
		redo();
	}
	
	@Override
	public void redo() {
		ownerUnit.getParameterMappings().add(mapping);
		affectedObjects = Collections.singleton(mapping);
	}
	
	@Override
	public boolean canUndo() {
		return true;
	}
	
	@Override
	public void undo() {
		ownerUnit.getParameterMappings().remove(mapping);
		List<Parameter> pList = new ArrayList<Parameter>();
		pList.add(this.source);
		pList.add(this.target);
		affectedObjects = pList;
	}
	
	@Override
	public Collection<?> getAffectedObjects() {
		return affectedObjects;
	}
	
}// class
