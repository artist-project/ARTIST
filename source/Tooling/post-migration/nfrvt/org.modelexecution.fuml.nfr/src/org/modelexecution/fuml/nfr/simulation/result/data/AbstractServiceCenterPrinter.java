/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.data;

import org.modelexecution.fuml.nfr.simulation.result.AbstractPrinter;

import at.ac.tuwien.big.simpleqn.Balancer;
import at.ac.tuwien.big.simpleqn.ScalingBalancer;
import at.ac.tuwien.big.simpleqn.Service;

public abstract class AbstractServiceCenterPrinter extends AbstractPrinter {

	public AbstractServiceCenterPrinter(char separator) {
		super(separator);
	}
	
	public String getServiceName(Service service) {
		String suffix = "";
		if(service instanceof Balancer)
			suffix = "_Balancer";
		if(service instanceof ScalingBalancer)
			suffix = "_ScalingBalancer";
		return service.name() + suffix;
	}
}
