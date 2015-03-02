/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry;

import java.util.Map;

import org.modelexecution.fumldebug.core.ExecutionContext;

import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public interface IOpaqueBehaviorExecutionRegistry {
	
	public void registerOpaqueBehaviorExecutions(ExecutionContext executionContext);
	
	public Map<String, OpaqueBehavior> getRegisteredOpaqueBehaviors();
	
}
