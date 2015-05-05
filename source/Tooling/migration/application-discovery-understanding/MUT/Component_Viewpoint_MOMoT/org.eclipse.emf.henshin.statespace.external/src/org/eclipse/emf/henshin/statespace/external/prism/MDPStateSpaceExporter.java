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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.external.AbstractStateSpaceExporter;
import org.eclipse.emf.henshin.statespace.external.prism.PRISMUtil.Range;
import org.eclipse.emf.henshin.statespace.impl.StateExplorer;
import org.eclipse.emf.henshin.statespace.info.StateInfo;
import org.eclipse.emf.henshin.statespace.info.StateSpaceTimeInfo;
import org.eclipse.emf.henshin.statespace.info.TransitionInfo;

/**
 * Exporter for PRISM. This generates an MDP or a PTA model.
 * @author Christian Krause
 */
public class MDPStateSpaceExporter extends AbstractStateSpaceExporter {

	/**
	 * ID of this exporter.
	 */
	public static final String EXPORTER_ID = "org.eclipse.emf.henshin.statespace.external.export.prismmdp";
	
	/**
	 * Clean up interval.
	 */
	private static final int CLEAN_UP_INTERVAL = 10000;

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceExporter#doExport(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.emf.common.util.URI, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doExport(StateSpace stateSpace, URI uri, String parameters, IProgressMonitor monitor) throws IOException, StateSpaceException {

		int stateCount = stateSpace.getStates().size();
		monitor.beginTask("Exporting state space...", 3 * stateCount);
		int steps;

		// Get the time info:
		StateSpaceTimeInfo timeInfo;
		try {
			timeInfo = new StateSpaceTimeInfo(stateSpaceIndex);
		} catch (StateSpaceException e) {
			throw new IOException(e);
		}
		boolean timed = timeInfo.isTimed();

		// For timed cases, we need an explorer to find matches:
		StateExplorer explorer = null;
		if (timed) {
			explorer = new StateExplorer(stateSpaceIndex);
		}
		
		// Shall we produce an explicit model?
		if (timed && !"nm".equalsIgnoreCase(uri.fileExtension())) {
			throw new IOException("Explicit export for timed models not supported.");
		}
		boolean explicit = !timed && "tra".equalsIgnoreCase(uri.fileExtension());

		// Get the probabilistic rules:
		Map<String, List<Rule>> probRules = PRISMUtil.getProbabilisticRules(stateSpace);

		// Export to file...
		File file = new File(uri.toFileString());
		OutputStreamWriter writer = createWriter(file);

		// Get the probability constants:
		Map<String, String> probs = PRISMUtil.getAllProbs(stateSpace, explicit);

		// Output the header and constants:
		if (!explicit) {			
			writer.write(PRISMUtil.getModelHeader(timed ? "pta" : "mdp"));
			for (String ruleName : probRules.keySet()) {
				List<Rule> rules = probRules.get(ruleName);
				if (rules.size()>1) {
					for (int i=0; i<rules.size(); i++) {
						String key = PRISMUtil.getProbKey(rules.get(i), i);
						String value = probs.get(key);
						writer.write("const double " + key);
						if (value!=null && !Range.isRange(value)) {
							writer.write(" = " + value);
						}
						writer.write(";\n");
						writer.write("const double " + PRISMUtil.getProbVar(i) + " = " + key + ";\n");
					}
				}
			}
			writer.write(PRISMUtil.getConstants(stateSpace));
			writer.write("\nmodule " + uri.trimFileExtension().lastSegment() + "\n\n");
		}

		int[] invariants = null;
		
		if (explicit) {
			// State and transition count:
			writer.write(stateCount + " " + stateSpace.getTransitionCount() + "\n");
		} else {
			// State variables:
			writer.write(PRISMUtil.getVariableDeclarations(stateSpace.getStateCount(), false));
			if (timed) {
							
				// Variable for clock invariants:
				Map<String,Integer> invariantIndizes = new LinkedHashMap<String,Integer>();
				invariants = new int[stateSpace.getStateCount()];
				steps = 0;
				int lastIndex = 0;
				for (State s : stateSpace.getStates()) {
					StateInfo info = new StateInfo(s, stateSpaceIndex.getModel(s), explorer);
					String inv = timeInfo.getInvariant(info);
					if (inv==null) {
						inv = "true";
					}
					Integer invIndex = invariantIndizes.get(inv);
					if (invIndex==null) {
						invIndex = lastIndex++;
						invariantIndizes.put(inv, invIndex);
					}
					invariants[s.getIndex()] = invIndex;
					if (steps++ % CLEAN_UP_INTERVAL==0) {
						stateSpaceIndex.clearCache();
					}
				}
				writer.write("\ti : [0.." + Math.max(lastIndex-1,0) + "];\n");
				
				// The clock variables:
				for (String clock : timeInfo.getClocks()) {
					writer.write("\t" + clock + " : clock;\n");
				}
				
				// The clock invariants:
				if (!invariantIndizes.isEmpty()) {
					writer.write("\n\tinvariant\n");
					boolean first = true;
					for (Entry<String,Integer> entry : invariantIndizes.entrySet()) {
						writer.write(first ? "\t\t  (i=" : "\t\t& (i=");
						writer.write(entry.getValue() + " => " + entry.getKey() + ")\n");
						first = false;
					}
					writer.write("\tendinvariant\n\n");
				}
				
			}
		}

		// Output the transitions:
		int removedIllegal = 0;
		steps = 0;
		for (State s : stateSpace.getStates()) {

			// Sort transitions by labels:
			Map<MDPLabel, List<Transition>> trs = MDPLabel.getTransitionsByLabel(s);
			int transitionIndex = 0;
			for (MDPLabel l : trs.keySet()) {
				List<Transition> ts = trs.get(l);
				if (ts.isEmpty()) continue;

				// Check if all rules are enabled:
				String label = l.getTransition().getRule().getName();
				List<Rule> rules = probRules.get(label);
				boolean allEnabled = true;
				for (Rule r : rules) {
					boolean enabled = false;
					for (Transition t : ts) {
						if (t.getRule()==r) {
							enabled = true;
							break;
						}
					}
					if (!enabled) {
						allEnabled = false;
						break;
					}
				}
				if (!allEnabled) {
					removedIllegal++;
					continue;
				}

				// Output the transition:
				if (!explicit) {
					String guard = null;
					if (timed) {
						TransitionInfo info = new TransitionInfo(l.getTransition(), stateSpaceIndex.getModel(l.getTransition().getSource()), explorer);
						guard = timeInfo.getGuard(info);
					}
					writer.write("\t[" + label + "] " + PRISMUtil.getPRISMState(s.getIndex(), guard, false) + " -> ");
				}

				boolean first = true;
				for (Transition t : ts) {
					if (!first) {
						writer.write(explicit ? "\n" : " + ");
					}
					String probKey = PRISMUtil.getProbVar(rules.indexOf(t.getRule()));
					if (explicit) {
						String prob = (rules.size()>1) ? probs.get(probKey) : "1";
						writer.write(s.getIndex() + " " + transitionIndex + " " + t.getTarget().getIndex() + " " + prob);
					} else {
						String prob = (rules.size()>1) ? probKey+":" : "";
						String extra = null;
						if (timed) {
							TransitionInfo info = new TransitionInfo(t, stateSpaceIndex.getModel(t.getSource()), explorer);
							extra = "(i'=" + invariants[t.getTarget().getIndex()] + ")";
							String resets = timeInfo.getResets(info);
							if (resets!=null) {
								extra = extra + "&" + resets;
							}
						}
						writer.write(prob + PRISMUtil.getPRISMState(t.getTarget().getIndex(), extra, true));
					}
					first = false;
				}

				if (explicit) {
					writer.write("\n");
					transitionIndex++;
				} else {				
					writer.write(";\n");
				}
			}

			// Clean up regularly:
			if (steps++ % CLEAN_UP_INTERVAL==0) {
				stateSpaceIndex.clearCache();
			}

			// Update the monitor:
			monitor.worked(1);
			if (monitor.isCanceled()) {
				break;
			}

		}

		// Did we remove any illegal transitions?
		if (removedIllegal>0) {
			StateSpacePlugin.INSTANCE.logWarning("Removed " + removedIllegal + " illegal probabilistic transitions");
		}

		// Initial states
		if (!explicit) {
			writer.write("\nendmodule\n\n");
			if (!timed) {
				writer.write("init\n\t");
				writer.write(PRISMUtil.getPRISMStates(stateSpace.getInitialStates()));
				writer.write("\nendinit\n");
			}
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

		// States file:
		if (explicit) {
			OutputStreamWriter statesWriter = createWriter(new File(uri.toFileString().replaceAll(".tra", ".sta")));
			statesWriter.write(PRISMUtil.getVariableDeclarations(stateSpace.getStateCount(), true) + "\n");					
			for (int i=0; i<stateCount; i++) {
				statesWriter.write(i + ":(" + i + ")\n");
			}
			statesWriter.close();
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
		return "PRISM MDP/PTA";
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.export.StateSpaceExporter#getFileExtensions()
	 */
	@Override
	public String[] getFileExtensions() {
		return new String[] { "nm", "tra" };
	}

}
