/*
 * Copyright (c) 2013, 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.eval.run.process;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;

public class GMLProcessFactory implements IProcessFactory {

	@Override
	public IProcess newProcess(ILaunch launch, Process process, String label,
			@SuppressWarnings("rawtypes") Map attributes) {
		return new GMLProcess(launch, process, label, attributes);
	}

}
