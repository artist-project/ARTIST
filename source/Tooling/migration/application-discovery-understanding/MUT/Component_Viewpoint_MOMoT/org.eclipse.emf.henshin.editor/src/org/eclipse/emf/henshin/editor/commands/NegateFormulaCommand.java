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
import java.util.Collections;

import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Not;

/**
 * Negates the given {@link Formula}. If the given {@link Formula} or its
 * container is an instance of {@link Not} this element is removed by overriding
 * the command with {@link RemoveNegationCommand}. Otherwise a {@link Not} is
 * inserted between the given {@link Formula} and its container.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class NegateFormulaCommand extends AbstractOverrideableCommand {
	
	protected Formula formula;
	protected Not not;
	
	protected Collection<?> affectedObjects;
	
	public NegateFormulaCommand(EditingDomain domain, Formula formula) {
		super(domain);
		this.formula = formula;
	}
	
	@Override
	protected boolean prepare() {
		if (formula instanceof Not) {
			RemoveNegationCommand removeNegationCmd = new RemoveNegationCommand();
			removeNegationCmd.setNot((Not) formula);
			this.setOverride(removeNegationCmd);
		} else if (formula.eContainer() instanceof Not) {
			RemoveNegationCommand removeNegationCmd = new RemoveNegationCommand();
			removeNegationCmd.setNot((Not) formula.eContainer());
			this.setOverride(removeNegationCmd);
		}
		return true;
	}
	
	@Override
	public void doExecute() {
		not = HenshinFactory.eINSTANCE.createNot();
		doRedo();
	}
	
	@Override
	public void doRedo() {
		formula.eContainer().eSet(formula.eContainingFeature(), not);
		not.setChild(formula);
		affectedObjects = Collections.singleton(not);
	}
	
	@Override
	public void doUndo() {
		not.eContainer().eSet(not.eContainingFeature(), formula);
		affectedObjects = Collections.singleton(formula);
	}
	
	@Override
	public boolean doCanUndo() {
		return true;
	}
	
	@Override
	public Collection<?> doGetAffectedObjects() {
		return affectedObjects;
	}
}
