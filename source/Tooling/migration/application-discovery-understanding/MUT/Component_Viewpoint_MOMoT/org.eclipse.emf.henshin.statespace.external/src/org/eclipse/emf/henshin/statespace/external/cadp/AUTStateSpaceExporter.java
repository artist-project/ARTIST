/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external.cadp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceExporter;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * Exporter for the Aldebaran (AUT) format as used by CADP.
 * @author Christian Krause
 */
public class AUTStateSpaceExporter implements StateSpaceExporter {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#export(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.emf.common.util.URI, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doExport(StateSpace stateSpace, URI uri, String parameters, IProgressMonitor monitor) throws IOException {
		
		// Export to file...
		File file = new File(uri.toFileString());
		OutputStream out = new BufferedOutputStream(new FileOutputStream(file), 65536);
		OutputStreamWriter writer = new OutputStreamWriter(out);
		
		// Make sure that there is exactly one initial state.
		if (stateSpace.getInitialStates().size()!=1) {
			StateSpacePlugin.INSTANCE.logError("AUT format can encode only state spaces with exactly one initial state!", null);
			if (stateSpace.getInitialStates().isEmpty()) {
				writer.close();
				throw new IOException();
			}
		}
		
		// States and transitions:
		int initial = stateSpace.getInitialStates().get(0).getIndex();
		int states = stateSpace.getStates().size();
		int transitions = stateSpace.getTransitionCount();
		monitor.beginTask("Exporting state space...", states+1);
		
		// Write the header.
		writer.write("des (" + initial + "," + transitions + "," + states + ")\n");
		monitor.worked(1);
		
		// Iterate over all states:
		List<State> statesList = stateSpace.getStates();
		for (int source=0; source<states; source++) {
			for (Transition transition : statesList.get(source).getOutgoing()) {
				writer.write("(" + source + ",");
				writer.write("\"" + transition.getLabel() + "\",");
				writer.write(transition.getTarget().getIndex() + ")\n");
			}
			monitor.worked(1);
			if (monitor.isCanceled()) {
				break;
			}
		}
		
		// Finished:
		writer.close();
		if (!monitor.isCanceled()) {
			monitor.done();
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getName()
	 */
	@Override
	public String getName() {
		return "CADP";
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getFileExtensions()
	 */
	@Override
	public String[] getFileExtensions() {
		return new String[] { "aut" };
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceExporter#setStateSpaceIndex(org.eclipse.emf.henshin.statespace.StateSpaceIndex)
	 */
	@Override
	public void setStateSpaceIndex(StateSpaceIndex index) {
	}

}
