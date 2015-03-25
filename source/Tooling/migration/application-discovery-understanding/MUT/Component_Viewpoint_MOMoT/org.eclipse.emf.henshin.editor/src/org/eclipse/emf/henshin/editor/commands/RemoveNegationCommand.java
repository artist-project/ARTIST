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

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Not;

/**
 * Replace the given {@link Not} in its containing {@link EStructuralFeature} by
 * its child {@link Formula}.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class RemoveNegationCommand extends AbstractCommand {
	
	protected Not not;
	protected Formula child;
	protected Collection<?> affectedObjects;
	
	public void setNot(Not not) {
		this.not = not;
	}
	
	@Override
	protected boolean prepare() {
		child = not.getChild();
		return true;
	}
	
	@Override
	public void execute() {
		redo();
	}
	
	@Override
	public void redo() {
		not.eContainer().eSet(not.eContainingFeature(), not.getChild());
		affectedObjects = Collections.singleton(child);
	}
	
	@Override
	public void undo() {
		child.eContainer().eSet(child.eContainingFeature(), not);
		not.setChild(child);
		affectedObjects = Collections.singleton(not);
	}
	
	@Override
	public boolean canUndo() {
		return true;
	}
	
	@Override
	public Collection<?> getAffectedObjects() {
		return affectedObjects;
	}
}
