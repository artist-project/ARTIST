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
package eu.artist.postmigration.opgml.unused;

import eu.artist.postmigration.opgml.gml.GoalModel;

public abstract class AbstractGoalFitnessFunction extends AbstractEstimatesFitnessFunction {

	private GoalModel goals;
	
	public AbstractGoalFitnessFunction(GoalModel goals, PatternImpactEstimates estimates) {
		super(goals.getPropertiesOfInterest(), estimates);
		setGoals(goals);
	}

	public GoalModel getGoals() {
		return goals;
	}

	public void setGoals(GoalModel goals) {
		this.goals = goals;
	}
}
