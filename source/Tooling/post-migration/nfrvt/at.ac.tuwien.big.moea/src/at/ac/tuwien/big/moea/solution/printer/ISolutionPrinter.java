/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.moea.solution.printer;

import org.moeaframework.core.Solution;

public interface ISolutionPrinter<S extends Solution> {
	ISolutionPrinter<S> addObjectiveName(int index, String name);
	ISolutionPrinter<S> addVariableName(int index, String name);
	ISolutionPrinter<S> addConstraintName(int index, String name);
	
	ISolutionPrinter<S> setObjectiveNames(Iterable<String> names);
	ISolutionPrinter<S> setVariableNames(Iterable<String> names);
	ISolutionPrinter<S> setConstraintNames(Iterable<String> names);
	
	public String getObjectiveName(int index);
	public String getVariableName(int index);
	public String getConstraintName(int index);
	
	public String getObjectiveData(S solution, int index);
	public String getVariableData(S solution, int index);
	public String getConstraintData(S solution, int index);
	
	boolean printVariables();
	boolean printObjectives();
	boolean printAttributes();
	boolean printConstraints();
	
	boolean printSummaries();
	boolean printPlaceholders();
	
	ISolutionPrinter<S> setPrintPlaceholders(boolean printPlaceholders);
	
	String print(S solution);
}
