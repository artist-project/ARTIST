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
package at.ac.tuwien.big.momot.solution.printer;

import java.io.Serializable;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.solution.printer.GenericSolutionPrinter;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class GenericMatchSolutionPrinter extends GenericSolutionPrinter<MatchSolution> implements IMatchSolutionPrinter {

	@Override
	public String print(EGraph graph) {
		return "";
	}

	@Override
	protected String printAttribute(String key, Serializable value) {
		if(key == MatchSolution.ATTRIBUTE_EXECUTION_RESULT)
			return "";
		return super.printAttribute(key, value);
	}
	
	@Override
	protected String printAttributeSummary(MatchSolution solution) {
		if(!solution.hasAttribute(MatchSolution.ATTRIBUTE_EXECUTION_RESULT))
			return super.printAttributeSummary(solution);
		
		// skipping execution result
		return getIndent() + "Number of attributes: " + (solution.getAttributes().size() - 1) + "\n";
	}
}
