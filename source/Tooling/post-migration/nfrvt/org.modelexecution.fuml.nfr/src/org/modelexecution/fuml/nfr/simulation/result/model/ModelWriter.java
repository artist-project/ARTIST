/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.model;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;

public class ModelWriter {
	
	private WorkloadSimulation simulation;
	
	public ModelWriter(WorkloadSimulation simulation) { 
		this.simulation = simulation;
	}
	
	public WorkloadSimulation getWorkloadSimulation() {
		return simulation;
	}
	
	public Resource writeModel(String filePath) {		
		Resource modelResource = getWorkloadSimulation().getWorkload().getUMLModelResource();
	    Resource saveResource = modelResource.getResourceSet().createResource(URI.createURI(filePath, true));
	    saveResource.getContents().addAll(modelResource.getContents());

	    try {
	      saveResource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      return null;
	    }
		return saveResource;
	}
}
