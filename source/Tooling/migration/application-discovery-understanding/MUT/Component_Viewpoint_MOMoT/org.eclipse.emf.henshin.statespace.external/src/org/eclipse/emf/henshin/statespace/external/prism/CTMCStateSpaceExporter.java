/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external.prism;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.external.AbstractStateSpaceExporter;

/**
 * Exporter for PRISM. This generates a CTMC model.
 * @author Christian Krause
 */
public class CTMCStateSpaceExporter extends AbstractStateSpaceExporter {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#export(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.emf.common.util.URI, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doExport(StateSpace stateSpace, URI uri, String parameters, IProgressMonitor monitor) throws IOException {

		int stateCount = stateSpace.getStates().size();
		monitor.beginTask("Exporting state space...", 2*stateCount);

		// Shall we produce an explicit model?
		boolean explicit = "tra".equalsIgnoreCase(uri.fileExtension());

		// Export to file...
		File file = new File(uri.toFileString());
		OutputStreamWriter writer = createWriter(file);
		
		// Get the rate constants:
		Map<String,String> rates = PRISMUtil.getAllRates(stateSpace, explicit);
		
		// Output the header and constants:
		if (!explicit) {
			writer.write(PRISMUtil.getModelHeader("ctmc"));
			for (Rule rule : stateSpace.getRules()) {
				String key = PRISMUtil.getRateKey(rule);
				String value = rates.get(key);
				writer.write("const double " + key);
				if (value!=null) {
					writer.write(" = " + value);
				}
				writer.write(";\n");
			}
			writer.write("\nmodule " + uri.trimFileExtension().lastSegment() + "\n\n");
		}
		
		// State and transition count:
		if (explicit) {
			writer.write(stateCount + " " + stateSpace.getTransitionCount() + "\n");
		} else {
			writer.write("\ts : [0.." + stateCount + "];\n\n");
		}
		
		// Output the transitions:
		for (State s : stateSpace.getStates()) {
			for (Transition t : s.getOutgoing()) {
				if (explicit) {
					writer.write(s.getIndex() + " " + t.getTarget().getIndex() + " " + rates.get(PRISMUtil.getRateKey(t.getRule())) + "\n");
				} else {
					writer.write("\t[" + getAction(t.getRule())+ "] s=" + s.getIndex() + 
							" -> " + PRISMUtil.getRateKey(t.getRule()) + 
							" : (s'=" + t.getTarget().getIndex() + ");\n");
				}
			}
			
			// Update the monitor:
			monitor.worked(1);
			if (monitor.isCanceled()) {
				break;
			}
		}
		
		// Initial states
		if (!explicit) {
			writer.write("\nendmodule\n\n");
			writer.write("init\n\t");
			for (int i=0; i<stateSpace.getInitialStates().size(); i++) {
				writer.write("s=" + stateSpace.getInitialStates().get(i).getIndex());
				if (i<stateSpace.getInitialStates().size()-1) writer.write(" | ");
			}
			writer.write("\nendinit\n");
		}
		
		// State labels:		
		if (parameters!=null) {
			try {
				String expanded = PRISMUtil.expandLabels(parameters, stateSpaceIndex, new SubProgressMonitor(monitor, stateCount));
				if (explicit) {
					OutputStreamWriter labelsWriter = createWriter(new File(uri.toFileString().replaceAll(".tra", ".lab")));
					labelsWriter.write(expanded);
					labelsWriter.close();
				} else {
					writer.write("\n" + expanded + "\n");
				}
			} catch (Exception e) {
				throw new IOException(e);
			}
		}

		// Finished:
		writer.close();
		if (!monitor.isCanceled()) {
			monitor.done();
		}
		
	}
	
	/*
	 * Canonical name for rules.
	 */
	protected static String getAction(Rule rule) {
		return rule.getName().trim();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getName()
	 */
	@Override
	public String getName() {
		return "PRISM CTMC";
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getFileExtensions()
	 */
	@Override
	public String[] getFileExtensions() {
		return new String[] { "sm" };
	}

}
