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
package eu.artist.postmigration.nfrvt.lang.util.mwe.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;

/**
 * Sub-classes the {@link DefaultGlobalScopeProvider} to provide the 
 * possibility to explicitly set a parent scope (only NULLSCOPE is
 * possible in {@link DefaultGlobalScopeProvider}).
 * @author Martin Fleck
 */
public class ParentalDefaultScopeProvider extends DefaultGlobalScopeProvider {

	IScope parentScope;
	
	public IScope getParentScope() {
		if(parentScope == null)
			return IScope.NULLSCOPE;
		return parentScope;
	}

	public void setParentScope(IScope parentScope) {
		this.parentScope = parentScope;
	}

	@Override
	protected IScope getScope(final Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		return getScope(getParentScope(), context, ignoreCase, type, filter);
	}
}
