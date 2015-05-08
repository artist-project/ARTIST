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

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Rule;

/**
 * {@link ApplicationMonitor} implementation that gathers profiling statistics.
 * @author Christian Krause
 */
public class ProfilingApplicationMonitor extends BasicApplicationMonitor {

	// Start time:
	protected long startTime = 0;
	
	// Duration for executing rules (summed up execution times):
	protected Map<Rule,Long> durations = new LinkedHashMap<Rule,Long>();
	
	// Number of executions per rule:
	protected Map<Rule,Integer> executions = new LinkedHashMap<Rule,Integer>();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.ApplicationMonitorImpl#notifyExecute(org.eclipse.emf.henshin.interpreter.UnitApplication, boolean)
	 */
	@Override
	public void notifyExecute(UnitApplication application, boolean success) {
		
		// First round we need to skip:
		if (startTime==0) {
			startTime = System.currentTimeMillis();
			return;
		}
		
		// Only measure times for rule applications:
		if (!(application instanceof RuleApplication)) {
			return;
		}
		
		// Measure how long the execution took:
		Rule rule = (Rule) application.getUnit();
		long finishTime = System.currentTimeMillis();
		long executionTime = finishTime - startTime;
		
		// Update the execution count:
		Integer count = executions.get(rule);
		if (count==null) {
			count = 1;
		} else {
			count++;
		}
		executions.put(rule, count);
		
		// Update duration:
		Long duration = durations.get(rule);
		if (duration==null) {
			duration = executionTime;
		} else {
			duration = duration + executionTime;
		}
		durations.put(rule, duration);
		
		// Update the new start time:
		startTime = finishTime;
		
	}
	
	public void printStats() {
		for (Rule rule : executions.keySet()) {
			System.out.println("Stats for rule '" + rule.getName() + "':");
			System.out.println(" - Number of Executions: " + executions.get(rule));
			System.out.println(" - Total execution time: " + durations.get(rule) + "ms");
			System.out.println(" - Aver. execution time: " + (durations.get(rule) / executions.get(rule)) + "ms\n");
		}
	}
	
}
