/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external.tikz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceExporter;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.layout.TransitionBendpointHelper;

/**
 * A state space exporter for the TikZ format (LaTeX).
 * @author Christian Krause
 */
public class TikZStateSpaceExporter implements StateSpaceExporter {
		
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
		
		// Get the number of states:
		int states = stateSpace.getStates().size();
		int transitions = stateSpace.getTransitionCount();
		monitor.beginTask("Exporting state space...", states + transitions + 1);

		// The header:
		writer.write("\\begin{tikzpicture}[scale=0.5]\n");
		writer.write("\\definecolor{normfill}{rgb}{" + color2String(State.COLOR_DEFAULT) + "}\n");
		writer.write("\\definecolor{initfill}{rgb}{" + color2String(State.COLOR_INITIAL) + "}\n");
		writer.write("\\definecolor{openfill}{rgb}{" + color2String(State.COLOR_OPEN) + "}\n");
		writer.write("\\definecolor{termfill}{rgb}{" + color2String(State.COLOR_TERMINAL) + "}\n");
		writer.write("\\tikzstyle{henstate}=[circle,draw,fill=normfill,inner sep=1pt,minimum size=4mm,font=\\small]\n");
		writer.write("\\tikzstyle{heninit}=[fill=initfill]\n");
		writer.write("\\tikzstyle{henopen}=[fill=openfill]\n");
		writer.write("\\tikzstyle{henterm}=[fill=termfill]\n");
		writer.write("\\tikzstyle{hentrans}=[->,>=stealth',bend angle=15,font=\\small]\n\n");
		monitor.worked(1);
		
		// Print the states:
		for (State state : stateSpace.getStates()) {
			
			// Location:
			int[] location = state.getLocation();
			int index = state.getIndex();
			writer.write("\\node at(" + location[0] + "pt," + (-location[1]) + "pt) [henstate");
			
			// Attributes:
			if (state.isInitial()) writer.write(",heninit");
			else if (state.isOpen()) writer.write(",henopen");
			else if (state.getOutgoing().isEmpty()) writer.write(",henterm");
			
			// Id and label:
			writer.write("] (s" + index + ") {" + index + "};\n");
			
			// Update the monitor:
			monitor.worked(1);
			if (monitor.isCanceled()) {
				writer.close();
				return;
			}
			
		}
		
		writer.write("\n");
		
		// Print the transitions:
		for (State state : stateSpace.getStates()) {
			int source = state.getIndex();
			for (Transition transition : state.getOutgoing()) {
				
				// Get the target and the label:
				int target = transition.getTarget().getIndex();
				String label = transition.getLabel();

				// Bend the transition?
				int distance = TransitionBendpointHelper.getBendpointDistance(transition);
				String bend = (distance!=0) ? ",bend left=" + ((int) Math.abs(distance)) : "";
				
				// Write...
				writer.write("\\draw (s" + source + ") edge[hentrans" + bend + "] node[auto] {" + label + "} (s" + target + ");\n");

				// Update the monitor:
				monitor.worked(1);
				if (monitor.isCanceled()) {
					writer.close();
					return;
				}
				
			}
		}
		
		// End:
		writer.write("\n\\end{tikzpicture}\n");
		writer.close();
		monitor.done();
		
	}
	
	/*
	 * Convert an RGB value to a TikZ color string.
	 */
	private static String color2String(int[] rgb) {
		return (((double) rgb[0]) / 255.0) + "," + (((double) rgb[1]) / 255.0) + "," + (((double) rgb[2]) / 255.0);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getName()
	 */
	@Override
	public String getName() {
		return "TikZ";
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getFileExtensions()
	 */
	@Override
	public String[] getFileExtensions() {
		return new String[] { "tex" };
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceExporter#setStateSpaceIndex(org.eclipse.emf.henshin.statespace.StateSpaceIndex)
	 */
	@Override
	public void setStateSpaceIndex(StateSpaceIndex index) {
	}

}
