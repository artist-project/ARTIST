/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.impl;

import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * {@link ApplicationMonitor} implementation with logging capabilities.
 * @author Christian Krause
 *
 */
public class LoggingApplicationMonitor extends BasicApplicationMonitor {
	
	// Print stream to be used for logging:
	protected PrintStream logStream = System.out;
	
	// Whether to print logs only for rule applications:
	protected boolean onlyRuleApplications = false;

	// Whether to print logs only for unit (not rule) applications:
	protected boolean onlyUnitApplications = false;

	// Whether to print logs only for successful unit applications:
	protected boolean onlySuccesses = false;
	
	// Whether to print logs only for failed unit applications:
	protected boolean onlyFailures = false;
	
	// URI for saving intermediate models:
	protected URI autoSaveURI;
	
	// Execution step:
	protected int step = 0;
	
	// Maximum number of execution steps:
	protected int maxSteps = -1;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.ApplicationMonitorImpl#cancel()
	 */
	@Override
	public void cancel() {
		super.cancel();
		if (logStream!=null) {
			logStream.println("=== CANCEL REQUESTED ===\n");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.ApplicationMonitorImpl#cancelAndUndo()
	 */
	@Override
	public void cancelAndUndo() {
		super.cancelAndUndo();
		if (logStream!=null) {
			logStream.println("=== CANCEL AND UNDO REQUESTED ===\n");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.ApplicationMonitorImpl#notifyExecute(org.eclipse.emf.henshin.interpreter.UnitApplication, boolean)
	 */
	@Override
	public void notifyExecute(UnitApplication application, boolean success) {
		super.notifyExecute(application, success);
		logStep(application, success, "EXECUTED");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.ApplicationMonitorImpl#notifyUndo(org.eclipse.emf.henshin.interpreter.UnitApplication, boolean)
	 */
	@Override
	public void notifyUndo(UnitApplication application, boolean success) {
		super.notifyUndo(application, success);
		logStep(application, success, "UNDONE");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.ApplicationMonitorImpl#notifyRedo(org.eclipse.emf.henshin.interpreter.UnitApplication, boolean)
	 */
	@Override
	public void notifyRedo(UnitApplication application, boolean success) {
		super.notifyExecute(application, success);
		logStep(application, success, "REDONE");
	}
	
	/*
	 * Print log info about an execution step.
	 */
	protected void logStep(UnitApplication application, boolean success, String stepKind) {
		if (logStream==null) {
			return;
		}
		if (onlyRuleApplications && !(application instanceof RuleApplication)) {
			return;
		}
		if (onlyUnitApplications && (application instanceof RuleApplication)) {
			return;
		}
		if (onlySuccesses && !success) {
			return;
		}
		if (onlyFailures && success) {
			return;
		}
		step++;
		EGraph graph = application.getEGraph();
		logStream.println("=== (" + step + ") " + stepKind +  
				((application instanceof RuleApplication) ? " RULE " : " UNIT ") + 
				"'" + application.getUnit().getName() + "' [" + String.valueOf(success).toUpperCase() + "] ===\n");
		String edges = "?";
		try {
			edges = String.valueOf(InterpreterUtil.countEdges(graph));
		} catch (Throwable t) {} 
		
		logStream.println("Graph size: " + graph.size() + " nodes, " + edges + " edges\n");
		if (application instanceof RuleApplication) {
			RuleApplication ruleApp = (RuleApplication) application;
			if (success) {
				logStream.println(ruleApp.getCompleteMatch());
				logStream.println(ruleApp.getResultMatch());					
			} else {
				Match match = ruleApp.getPartialMatch();
				if (match!=null && !match.isEmpty()) {
					logStream.println("Partial " + ruleApp.getPartialMatch().toString().replaceFirst("Match", "match"));
				}
			}
		} else {
			Assignment assignment = application.getAssignment();
			Assignment resultAssignment = application.getResultAssignment();
			if (assignment!=null && !assignment.isEmpty()) {
				logStream.println(assignment);
			}
			if (success && resultAssignment!=null && !resultAssignment.isEmpty()) {
				logStream.println(resultAssignment);			
			}
		}
		// Save intermediate result?
		if (autoSaveURI!=null) {
			String basename = autoSaveURI.lastSegment();
			String realname = autoSaveURI.trimFileExtension().lastSegment() + 
					"-" + new DecimalFormat("0000").format(step) + "." + autoSaveURI.fileExtension();
			URI uri = URI.createURI(autoSaveURI.toString().replaceFirst(basename, realname));
			ResourceSet resourceSet = null;
			for (EObject root : graph.getRoots()) {
				if (root.eResource()!=null && root.eResource().getResourceSet()!=null) {
					resourceSet = root.eResource().getResourceSet();
					break;
				}
			}
			if (resourceSet==null) {
				resourceSet = new HenshinResourceSet();
			}
			EGraph copy = graph.copy(null);
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().addAll(copy.getRoots());
			Map<Object,Object> options = new HashMap<Object,Object>();
			options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			try {
				System.out.println("Saving intermediate result to " + uri + "\n");
				resource.save(options);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		if (maxSteps>=0 && step>=maxSteps) {
			System.out.println("Terminated after " + step + " steps by logging application monitor.");
			System.exit(1);
		}
	}

	public void setLogStream(PrintStream logStream) {
		this.logStream = logStream;
	}

	public void setOnlyRuleApplications(boolean onlyRuleApplications) {
		this.onlyRuleApplications = onlyRuleApplications;
	}

	public void setOnlyUnitApplications(boolean onlyUnitApplications) {
		this.onlyUnitApplications = onlyUnitApplications;
	}

	public void setOnlySuccesses(boolean onlySuccesses) {
		this.onlySuccesses = onlySuccesses;
	}

	public void setOnlyFailures(boolean onlyFailures) {
		this.onlyFailures = onlyFailures;
	}

	public void setAutoSaveURI(URI autoSaveURI) {
		this.autoSaveURI = autoSaveURI;
	}
	
	public void setMaxSteps(int maxSteps) {
		this.maxSteps = maxSteps;
	}
	
}
