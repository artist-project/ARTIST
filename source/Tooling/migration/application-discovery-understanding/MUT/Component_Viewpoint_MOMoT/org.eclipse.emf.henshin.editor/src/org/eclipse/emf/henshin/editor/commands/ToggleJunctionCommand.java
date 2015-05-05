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
import org.eclipse.emf.henshin.model.And;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Or;

/**
 * Converts {@link And} to {@link Or} and vice versa.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class ToggleJunctionCommand extends AbstractCommand {
	
	protected BinaryFormula junction;
	protected BinaryFormula newJunction;
	protected Collection<?> affectedObjects;
	
	public ToggleJunctionCommand(BinaryFormula junction) {
		this.junction = junction;
	}
	
	@Override
	protected boolean prepare() {
		return (junction instanceof And) || (junction instanceof Or);
	}
	
	@Override
	public void execute() {
		if (junction instanceof And) {
			newJunction = HenshinFactory.eINSTANCE.createOr();
		}
		if (junction instanceof Or) {
			newJunction = HenshinFactory.eINSTANCE.createAnd();
		}
		redo();
	}
	
	@Override
	public void redo() {
		newJunction.setLeft(junction.getLeft());
		newJunction.setRight(junction.getRight());
		junction.eContainer().eSet(junction.eContainingFeature(), newJunction);
		affectedObjects = Collections.singleton(newJunction);
	}
	
	@Override
	public void undo() {
		junction.setLeft(newJunction.getLeft());
		junction.setRight(newJunction.getRight());
		newJunction.eContainer().eSet(newJunction.eContainingFeature(), junction);
		affectedObjects = Collections.singleton(junction);
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
