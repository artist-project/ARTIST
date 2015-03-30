/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.nfr;

import java.util.List;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.uml2.uml.NamedElement;

public interface IResourceUsage {
	
	public static final String UNDEFINED = "#undefined#";
	public static final String VARIABLE_CHAR = "$";

	public abstract ResourceUsage getRawResourceUsage();

	public abstract List<Resource> getUsedResources();

	public abstract String getExecTime(Resource resource);

	public abstract String getAllocatedMemory(Resource resource);

	public abstract String getUsedMemory(Resource resource);

	public abstract String getPowerPeak(Resource resource);

	public abstract String getEnergy(Resource resource);

	public abstract String getMsgSize(Resource resource);
	
	public abstract NamedElement getElement();

}