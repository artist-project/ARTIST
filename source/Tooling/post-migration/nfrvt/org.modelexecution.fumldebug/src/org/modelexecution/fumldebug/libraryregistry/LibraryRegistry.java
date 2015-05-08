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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.modelexecution.fumldebug.core.ExecutionContext;

import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class LibraryRegistry {
	
	private final static String LIBRARY_REGISTRY_EXTENSION_ID = "org.modelexecution.fuml.libraryregistry";
	private static final String LIBRARY_REGISTRY_EXTENSION_ATTRIBUTE_CLASS = "class";
	
	private ExecutionContext executionContext;
	
	public LibraryRegistry(ExecutionContext executionContext) {
		this.executionContext = executionContext;
	}
	
	public Map<String, OpaqueBehavior> loadRegisteredLibraries() {
		final Map<String, OpaqueBehavior> registeredOpaqueBehaviors = new HashMap<String, OpaqueBehavior>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(LIBRARY_REGISTRY_EXTENSION_ID);		
		for(int i=0;i<config.length;++i) {
			IConfigurationElement element = config[i];
			try {
				final Object o = element.createExecutableExtension(LIBRARY_REGISTRY_EXTENSION_ATTRIBUTE_CLASS);
				
				ISafeRunnable runnable = new ISafeRunnable() {
					
					@Override
					public void run() throws Exception {						
						IOpaqueBehaviorExecutionRegistry opaqueBehaviorExecutionRegistry = (IOpaqueBehaviorExecutionRegistry)o;
						opaqueBehaviorExecutionRegistry.registerOpaqueBehaviorExecutions(executionContext);
						registeredOpaqueBehaviors.putAll(opaqueBehaviorExecutionRegistry.getRegisteredOpaqueBehaviors());
					}
					
					@Override
					public void handleException(Throwable exception) {
					}
				};
				
				SafeRunner.run(runnable);
			} catch (CoreException e) {
			}
			
		}
		return registeredOpaqueBehaviors;
	}

}
