/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.menuContributors;

import java.util.List;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.editor.commands.DiscardInFavorOfChildFormulaCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.editor.commands.NegateFormulaCommand;
import org.eclipse.emf.henshin.editor.commands.ToggleJunctionCommand;
import org.eclipse.emf.henshin.editor.commands.WrapFormulaInJunctionCommand;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;

/**
 * Contributes several actions for editing {@link Formula}s.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class FormulaCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new FormulaCommandMenuContributor();
	
	private static final String COMMAND_LABEL_DISCARD = "DiscardInFavorOfChild";
	private static final String COMMAND_LABEL_DISCARD_LEFT = "DiscardInFavorOfChild_Left";
	private static final String COMMAND_LABEL_DISCARD_RIGHT = "DiscardInFavorOfChild_Right";
	
	private static final String COMMAND_LABEL_NEGATE_FORMULA = "NegateFormula";
	
	private static final String COMMAND_LABEL_TOGGLE_JUNCTION = "ToggleJunction";
	
	private static final String COMMAND_LABEL_WIJ = "WrapInJunction";
	private static final String COMMAND_LABEL_WIJ_AND = "WrapInJunction_And";
	private static final String COMMAND_LABEL_WIJ_OR = "WrapInJunction_Or";
	
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		buildNegateFormula(menuManager, selection, domain);
		buildToggleJunction(menuManager, selection, domain);
		buildWrapInJunction(menuManager, selection);
		buildDiscardInFavorOfChild(menuManager, selection);
		
	}
	
	private void buildDiscardInFavorOfChild(IMenuManager menuManager, List<?> selection) {
		if ((selection.size() == 1) && (selection.get(0) instanceof BinaryFormula)) {
			MenuManager subMenu = new MenuManager(getLabel(COMMAND_LABEL_DISCARD));
			subMenu.add(createAction(getLabel(COMMAND_LABEL_DISCARD_LEFT),
					new DiscardInFavorOfChildFormulaCommand.Left((BinaryFormula) selection.get(0))));
			subMenu.add(createAction(getLabel(COMMAND_LABEL_DISCARD_RIGHT),
					new DiscardInFavorOfChildFormulaCommand.Right((BinaryFormula) selection.get(0))));
			menuManager.add(subMenu);
		}
	}
	
	private void buildNegateFormula(IMenuManager menuManager, List<?> selection,
			EditingDomain domain) {
		//
		//
		if ((selection.size() == 1) && (selection.get(0) instanceof Formula)) {
			menuManager.add(createAction(getLabel(COMMAND_LABEL_NEGATE_FORMULA),
					new NegateFormulaCommand(domain, (Formula) selection.get(0))));
		}
	}
	
	private void buildToggleJunction(IMenuManager menuManager, List<?> selection,
			EditingDomain domain) {
		if ((selection.size() == 1) && (selection.get(0) instanceof BinaryFormula)) {
			menuManager.add(createAction(getLabel(COMMAND_LABEL_TOGGLE_JUNCTION),
					new ToggleJunctionCommand((BinaryFormula) selection.get(0))));
		}
	}
	
	private void buildWrapInJunction(IMenuManager menuManager, List<?> selection) {
		if ((selection.size() == 1) && (selection.get(0) instanceof Formula)) {
			MenuManager subMenu = new MenuManager(getLabel(COMMAND_LABEL_WIJ));
			subMenu.add(createAction(getLabel(COMMAND_LABEL_WIJ_AND),
					WrapFormulaInJunctionCommand.createWrapInAndCommand((Formula) selection.get(0))));
			subMenu.add(createAction(getLabel(COMMAND_LABEL_WIJ_OR),
					WrapFormulaInJunctionCommand.createWrapInOrCommand((Formula) selection.get(0))));
			menuManager.add(subMenu);
		}
	}
}
