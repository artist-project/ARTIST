/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.NestedCondition;

/**
 * Custom command for adding nested conditions to a rule. This
 * automatically creates the "conclusion" graph in the nested condition.
 * 
 * @author Felix Rieger
 * @generated NOT
 */
public class SetNestedConditionCommand extends SetCommand implements Command {

	public SetNestedConditionCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		super(domain, owner, feature, value);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.SetCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		if (getValue() instanceof NestedCondition) {
			NestedCondition nc = (NestedCondition) getValue();
			// create conclusion graph
			if (nc.getConclusion() == null) {
				Graph conclusion = HenshinFactory.eINSTANCE.createGraph();
				nc.setConclusion(conclusion);
			}
		}
		super.doExecute();
	}
	
}

