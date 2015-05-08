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

import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.CastUtil;

public class PopulationPrinter<S extends Solution> implements IPopulationPrinter<S> {
	
	private ISolutionPrinter<S> solutionPrinter;
	private Class<S> solutionClazz;

	public PopulationPrinter(Class<S> solutionClazz, ISolutionPrinter<S> solutionPrinter) {
		this.solutionClazz = solutionClazz;
		this.solutionPrinter = solutionPrinter;		
	}

	public ISolutionPrinter<S> getSolutionPrinter() {
		return solutionPrinter;
	}

	@Override
	public String print(Population population) {
		String txt = "Population with " + population.size() + " solution(s):\n";
		int solutionNr = 1;
		for(Solution solution : population) {
			txt += "\n------------------\n";
			txt += "Solution " + solutionNr++ + "/" + population.size() + "\n";
			txt += "------------------\n";
			txt += getSolutionPrinter().print(CastUtil.asClass(solution, solutionClazz)) + "\n";
		}
		return txt;
	}
}