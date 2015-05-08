/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.util;

import org.eclipse.emf.ecore.EObject;

/**
 * An abstract superclass of helper classes that handle one model.
 * 
 * @author Martin Fleck
 */
public abstract class AbstractMigrationModelHandler<T extends EObject> {
	protected T model;
	
	public AbstractMigrationModelHandler(T model) {
		this.model = model;
	}
	
	protected T getModel() {
		return model;
	}
	
	protected String toFQN(String elementName) {
		if(elementName == null)
			return "";
		String modelFQN = MigrationResourceUtil.getFullyQualifiedName(getModel());
		if(modelFQN == null)
			modelFQN = "";
		return elementName.startsWith(modelFQN + MigrationResourceUtil.XTEXT_DELIMITER) ||
			elementName.startsWith(modelFQN + MigrationResourceUtil.UML_DELIMITER) ? elementName : 
			modelFQN + MigrationResourceUtil.XTEXT_DELIMITER + elementName;
	}
}
