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

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Formula;

/**
 * Replace a {@link BinaryFormula} in its containing {@link EStructuralFeature}
 * by one of its child formulas.
 * 
 * Nested classes provide the concrete behavior for replacement by left/right
 * child. This is an alternative to the strategy/factorymethod pattern used in
 * {@link WrapFormulaInJunctionCommand}. Feedback desired!
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public abstract class DiscardInFavorOfChildFormulaCommand extends AbstractCommand {
	
	protected BinaryFormula formula;
	protected Formula child;
	
	public DiscardInFavorOfChildFormulaCommand(BinaryFormula formula) {
		this.formula = formula;
	}
	
	@Override
	protected boolean prepare() {
		return (formula != null) && (formula.eContainer() != null);
	}
	
	@Override
	public void execute() {
		redo();
	}
	
	@Override
	public void redo() {
		child = getChild();
		formula.eContainer().eSet(formula.eContainingFeature(), child);
	}
	
	@Override
	public boolean canUndo() {
		return true;
	}
	
	@Override
	public void undo() {
		child.eContainer().eSet(child.eContainingFeature(), formula);
		resetChild();
	}
	
	protected abstract Formula getChild();
	
	protected abstract void resetChild();
	
	public static class Left extends DiscardInFavorOfChildFormulaCommand {
		
		public Left(BinaryFormula formula) {
			super(formula);
		}
		
		@Override
		protected Formula getChild() {
			return formula.getLeft();
		}
		
		@Override
		protected void resetChild() {
			formula.setLeft(child);
		}
	}
	
	public static class Right extends DiscardInFavorOfChildFormulaCommand {
		
		public Right(BinaryFormula formula) {
			super(formula);
		}
		
		@Override
		protected Formula getChild() {
			return formula.getRight();
		}
		
		@Override
		protected void resetChild() {
			formula.setRight(child);
		}
	}
	
}
