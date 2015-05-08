/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.libraryregistry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.modelexecution.fumldebug.core.ExecutionContext;

import fUML.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public abstract class AbstractOpaqueBehaviorExecutionRegistry implements
		IOpaqueBehaviorExecutionRegistry {

	private Map<String, OpaqueBehavior> opaqueBehaviors = new HashMap<String, OpaqueBehavior>();
	
	protected OpaqueBehavior getOpaqueBehavior(String qualifiedName) {
		return opaqueBehaviors.get(qualifiedName);
	}
	
	protected void createOpaqueBehaviorsMap(Collection<OpaqueBehavior> fUMLOpaqueBehaviors) {
		for(OpaqueBehavior fUMLOpaqueBehavior : fUMLOpaqueBehaviors) {
			opaqueBehaviors.put(fUMLOpaqueBehavior.qualifiedName, fUMLOpaqueBehavior);
		}
	}
	
	protected String getLibraryPath(String libraryname) {
		Collection<RegisteredLibrary> registeredLibraries = RegisteredLibrary.getRegisteredLibraries();		
		for(Iterator<RegisteredLibrary> iterator = registeredLibraries.iterator();iterator.hasNext();) {
			RegisteredLibrary registeredLibrary = iterator.next();
			if(libraryname.equals(registeredLibrary.getName())) {
				return registeredLibrary.getPath();
			}
		}
		return null;
	}	

	protected void registerOpaqueBehaviorExecution(
			OpaqueBehaviorExecution opaqueBehaviorExecution, String qualifiedName,
			ExecutionContext executionContext) {
		opaqueBehaviorExecution.types.add(opaqueBehaviors.get(qualifiedName));
		executionContext.addOpaqueBehavior(opaqueBehaviorExecution);
	}
	
	@Override
	public Map<String, OpaqueBehavior> getRegisteredOpaqueBehaviors() {
		return opaqueBehaviors;
	}
	
}
