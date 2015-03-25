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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * {@link RemoveCommand} that ignores all elements of the collection which are
 * not contained in the given feature (any more). e.g. use this class instead of
 * {@link RemoveCommand} if elements of a feature may have been removed as a
 * side effect of another {@link RemoveCommand} to avoid exceptions inside
 * factorized compound removals.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class NegligentRemoveCommand extends RemoveCommand {
	
	public NegligentRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection) {
		super(domain, owner, feature, collection);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.RemoveCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		collection.retainAll(ownerList);
		super.doExecute();
	}
	
}
