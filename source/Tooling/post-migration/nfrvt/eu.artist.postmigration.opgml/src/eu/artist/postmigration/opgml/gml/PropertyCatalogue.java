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
package eu.artist.postmigration.opgml.gml;

import org.moeaframework.core.variable.RealVariable;

import eu.artist.postmigration.opgml.gml.Property.Direction;

public class PropertyCatalogue {
	public static Property Cost = new Property("Cost", new RealVariable(0.0, Double.POSITIVE_INFINITY), Direction.Decreasing);
	public static Property Utilization = new Property("AvgUtilization", new RealVariable(0.0, 1.0), Direction.Range);
	public static Property AverageResponseTime = new Property("AvgResponseTime", new RealVariable(0.0, Double.POSITIVE_INFINITY), Direction.Decreasing);
	public static Property Security = new Property("Security", new RealVariable(0.0, 1.0), Direction.Increasing);
}
