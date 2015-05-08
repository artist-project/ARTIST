/*
* Copyright (c) 2014 Tecnalia.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*
*Zurik Corera (Tecnalia)-SCC component implementation
*
*
*
*
*Initially developed in the context of ARTIST EU project www.artist-project.eu
*/ 

package eu.artist.premigration.tft.scc.test;

import eu.artist.premigration.tft.scc.metricexplorer.MetricCalculator;

public class MetricCalculatorTest {

	public static void main(String[] args) throws Exception {
		
		String folder="D:/Proyectos/Artist/Dews";
		int type=1;
		MetricCalculator mc= new MetricCalculator();
		mc.getMetrics(folder, "", "", type);

		
/*
		String folder="D:/Proyectos/Artist/PetShop/dotNet/Pet Shop 4";
		int type=2;
		MetricCalculator mc= new MetricCalculator();
		mc.getMetrics(folder, "", "", type);
*/
		
	}

}
