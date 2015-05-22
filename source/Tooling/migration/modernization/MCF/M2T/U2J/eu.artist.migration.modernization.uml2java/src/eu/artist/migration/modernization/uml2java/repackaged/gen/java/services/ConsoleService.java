/**
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Alexander Bergmayr - initial API and implementation
 */
package eu.artist.migration.modernization.uml2java.repackaged.gen.java.services;

import org.eclipse.core.runtime.Status;

import eu.artist.migration.modernization.uml2java.repackaged.gen.java.UML2JavaActivator;

public class ConsoleService {
	
	public void printMessage(String msg) {
		UML2JavaActivator plugin = UML2JavaActivator.getDefault();
		plugin.getLog().log(new Status(Status.WARNING, plugin.getBundle().getSymbolicName(), Status.OK, msg, null));
	}
}
