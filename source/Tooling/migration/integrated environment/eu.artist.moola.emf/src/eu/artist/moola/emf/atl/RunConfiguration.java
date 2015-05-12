/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.moola.emf.atl;

import java.util.ArrayList;
import java.util.List;

public class RunConfiguration {

	private List<ModelConfig> modelConfigs;
	private String transformation;
	private boolean refinement;
	
	public RunConfiguration() {
		this.modelConfigs = new ArrayList<>();
	}
	
	public List<ModelConfig> getModelConfigs() {
		return modelConfigs;
	}

	public void setModelConfigs(List<ModelConfig> models) {
		this.modelConfigs = models;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public boolean getRefinement() {
		return refinement;
	}

	public void setRefinement(boolean refinement) {
		this.refinement = refinement;
	}
	
}
