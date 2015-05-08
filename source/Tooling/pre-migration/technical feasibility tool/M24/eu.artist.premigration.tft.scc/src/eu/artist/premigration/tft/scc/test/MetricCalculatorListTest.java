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

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import eu.artist.premigration.tft.scc.metricexplorer.MetricCalculator;

public class MetricCalculatorListTest {

	public static void main(String[] args) throws Exception {
		
		HashMap<String, List<String>> classFiles= new HashMap<String, List<String>>();
		List<String> com1= new ArrayList<String>();
		com1.add("org.dews_online.ccui.core.control.actiondelegate.AddBusinessObjectsToActiveIncidentActionDelegate.java");
		com1.add("org.dews_online.ccui.core.control.actiondelegate.ChangeCruiseControlModeInIncidentManagerActionDelegate.java");
		com1.add("org.dews_online.ccui.core.control.actiondelegate.CloseIncidentActionDelegate.java");
		com1.add("org.dews_online.ccui.core.control.actiondelegate.CreateNewIncidentActionDelegate.java");
		com1.add("org.dews_online.ccui.core.control.actiondelegate.DeleteAllSnapshotsActionDelegate.java");
		classFiles.put("org.dews_online.ccui.core.control.actiondelegate",com1);
		
		List<String> com2= new ArrayList<String>();
		com2.add("org.dews_online.ccui.core.model.ADewsBusinessObject.java");
		com2.add("org.dews_online.ccui.core.model.AIncidentBasedBusinessObject.java");
		com2.add("org.dews_online.ccui.core.model.DewsBusinessObjectEvent.java");
		com2.add("org.dews_online.ccui.core.model.DewsBusinessObjectLabelComparator.java");
		classFiles.put("org.dews_online.ccui.core.model",com2);
		
		int type=1;
		List<String> srcPath =new ArrayList<String>();
		srcPath.add("D:/Proyectos/Artist/Dews2/org.dews_online.ccui.core/src2/");
		srcPath.add("D:/Proyectos/Artist/Dews2/org.dews_online.ccui.core/src/");
		
		MetricCalculator mc= new MetricCalculator();
		mc.getMetricsByComponent(classFiles, srcPath, null, null, type);

	}

}
