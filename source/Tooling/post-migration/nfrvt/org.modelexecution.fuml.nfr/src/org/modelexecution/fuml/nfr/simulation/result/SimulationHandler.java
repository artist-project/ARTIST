/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.data.SimulationCSVFileWriter;
import org.modelexecution.fuml.nfr.simulation.result.html.HtmlWriter;
import org.modelexecution.fuml.nfr.simulation.result.model.ModelAnnotator;
import org.modelexecution.fuml.nfr.simulation.result.model.ModelWriter;

public class SimulationHandler {

	private static final String CSV_SUBDIR = "/csv/";
	private static final String HTML_SUBDIR = "/html/";
	
	private WorkloadSimulation simulation;
	private ModelAnnotator modelAnnotator;
	private ModelWriter modelWriter;
	private SimulationCSVFileWriter csvWriter;
	private HtmlWriter htmlWriter;
	
	public SimulationHandler(WorkloadSimulation simulation) {
		this.simulation = simulation;
		this.modelAnnotator = new ModelAnnotator(simulation);
		this.modelWriter = new ModelWriter(simulation);
		this.csvWriter = new SimulationCSVFileWriter(simulation);
		this.htmlWriter = new HtmlWriter();
	}

	public WorkloadSimulation getSimulation() {
		return simulation;
	}
	
	private ModelAnnotator getModelAnnotator() {
		return modelAnnotator;
	}

	private ModelWriter getModelWriter() {
		return modelWriter;
	}

	private SimulationCSVFileWriter getCSVWriter() {
		return csvWriter;
	}
	
	private HtmlWriter getHTMLWriter() {
		return htmlWriter;
	}

	public void annotateModel() {
		getModelAnnotator().annotateModel();
	}
	
	public void writeModel(String fileName) {
		getModelWriter().writeModel(fileName);
	}
	
	public void writeCSVFiles(String directory, boolean printHTML) {
		writeCSVFiles(directory, getSimulation().getModelName(), printHTML);
	}
	
	private void writeServiceCenterPropertyEvolution(ServiceCenterResult property, boolean printHtml) throws FileNotFoundException, IOException, URISyntaxException {
		File csvFile = getCSVWriter().printAllServicesPropertyEvolution(property);
		if(printHtml)
			getHTMLWriter().writeServiceCenterPropertyEvolution(csvFile, property);
	}
	
	public void writeCSVFiles(String directory, String baseName, boolean printHtml) {
		try {
			try {
				getCSVWriter().setOutputDirectory(directory + CSV_SUBDIR).setBaseName(baseName);
				if(printHtml)
					getHTMLWriter().setOutputDirectory(directory + HTML_SUBDIR);
				
				getCSVWriter().printStaticInformation();
				
				File workloadEvolution = getCSVWriter().printNetEvolution();
				if(printHtml)
					getHTMLWriter().writeNetEvolutions(workloadEvolution);

				writeServiceCenterPropertyEvolution(ServiceCenterResult.Utilization, printHtml);
				writeServiceCenterPropertyEvolution(ServiceCenterResult.Throughput, printHtml);
				writeServiceCenterPropertyEvolution(ServiceCenterResult.AvgDemandPerRequest, printHtml);
				writeServiceCenterPropertyEvolution(ServiceCenterResult.AvgQueueLength, printHtml);
				writeServiceCenterPropertyEvolution(ServiceCenterResult.IdleTime, printHtml);
				writeServiceCenterPropertyEvolution(ServiceCenterResult.BusyTime, printHtml);
				writeServiceCenterPropertyEvolution(ServiceCenterResult.MaxQueueLength, printHtml);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
