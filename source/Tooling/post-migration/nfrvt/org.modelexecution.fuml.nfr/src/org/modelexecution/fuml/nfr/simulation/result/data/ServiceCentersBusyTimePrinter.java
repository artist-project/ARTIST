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

import java.util.List;

import scala.collection.immutable.Range;
import at.ac.tuwien.big.simpleqn.Service;

public class ServiceCentersBusyTimePrinter extends AbstractServiceCentersPropertyPrinter {

	public ServiceCentersBusyTimePrinter(char separator, List<Service> services) {
		super(separator, services);
	}

	@Override
	protected void printPropertyValue(StringBuilder builder, Service service, Range range) {
		printWithSeparator(builder, service.busyTime(range));
	}
}
