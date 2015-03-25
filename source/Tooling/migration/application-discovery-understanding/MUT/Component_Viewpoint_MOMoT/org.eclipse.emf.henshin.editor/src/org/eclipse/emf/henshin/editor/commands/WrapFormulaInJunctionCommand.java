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
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.HenshinFactory;

/**
 * Inserts a {@link BinaryFormula} between the given {@link Formula} and its
 * container.
 * 
 * Uses a strategy/factorymethod pattern to switch between concrete
 * {@link BinaryFormula}s.
 * 
 * @see DiscardInFavorOfChildFormulaCommand
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class WrapFormulaInJunctionCommand extends AbstractCommand {
	
	protected Formula formula;
	protected BinaryFormula junction;
	protected JunctionCreationStrategy strategy;
	protected Collection<?> affectedObjects;
	
	protected WrapFormulaInJunctionCommand(Formula formula) {
		this.formula = formula;
		
	}
	
	protected void setStrategy(JunctionCreationStrategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	protected boolean prepare() {
		return true;
	}
	
	@Override
	public void execute() {
		junction = strategy.createJunction();
		redo();
	}
	
	@Override
	public void redo() {
		formula.eContainer().eSet(formula.eContainingFeature(), junction);
		junction.setLeft(formula);
		affectedObjects = Collections.singleton(junction);
	}
	
	@Override
	public void undo() {
		junction.eContainer().eSet(junction.eContainingFeature(), formula);
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
	
	protected interface JunctionCreationStrategy {
		BinaryFormula createJunction();
	}
	
	protected class AndStrategy implements JunctionCreationStrategy {
		@Override
		public BinaryFormula createJunction() {
			return HenshinFactory.eINSTANCE.createAnd();
		}
	}
	
	protected class OrStrategy implements JunctionCreationStrategy {
		@Override
		public BinaryFormula createJunction() {
			return HenshinFactory.eINSTANCE.createOr();
		}
	}
	
	public static WrapFormulaInJunctionCommand createWrapInAndCommand(Formula formula) {
		WrapFormulaInJunctionCommand cmd = new WrapFormulaInJunctionCommand(formula);
		cmd.setStrategy(cmd.new AndStrategy());
		return cmd;
	}
	
	public static WrapFormulaInJunctionCommand createWrapInOrCommand(Formula formula) {
		WrapFormulaInJunctionCommand cmd = new WrapFormulaInJunctionCommand(formula);
		cmd.setStrategy(cmd.new OrStrategy());
		return cmd;
	}
	
}
