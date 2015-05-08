/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.edit;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.layout.TransitionBendpointHelper;

public class TransitionLabelLocator extends ConnectionLocator {
	
	// Distance from the mid point.
	private int distance;

	public TransitionLabelLocator(Transition transition, Connection connection) {
		super(connection);
		distance = TransitionBendpointHelper.getBendpointDistance(transition);
		if (distance==0) distance = -10;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.draw2d.ConnectionLocator#getReferencePoint()
	 */
	@Override
	protected Point getReferencePoint() {
		Connection connection = getConnection();
		Point p = connection.getPoints().getMidpoint();
		connection.translateToAbsolute(p);
		p.y += distance;
		return p;
	}

}
