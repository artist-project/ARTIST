/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.usage;

import org.modelexecution.fuml.nfr.IResourceUsage;

public interface IResourceUsageSum extends IResourceUsage {
	public float getExecTimeSum();
	public float getAllocatedMemorySum();
	public float getUsedMemorySum();
	public float getPowerPeakSum();
	public float getEnergySum();
	public float getMsgSizeSum();
	
	public void reComputeSums();
}
