/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.html;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import org.modelexecution.fuml.nfr.simulation.result.FileHandler;
import org.modelexecution.fuml.nfr.simulation.result.ISimulationResult;
import org.modelexecution.fuml.nfr.simulation.result.ServiceCenterResult;
import org.modelexecution.fuml.nfr.simulation.result.WorkloadResult;

public class HtmlWriter {

	private static final String FILE_EXT = ".html";
	private static final String CSS_FILE = "css/simulation.css";
	private static final String JS_FILE = "js/simulation.js";
	
	private FileHandler fileHandler;
	private SimulationJavaScript simulationJavaScript;
	private SimulationCss simulationCss;
	
	private boolean basicsWritten = false;
	
	public HtmlWriter() {
		this.fileHandler = new FileHandler();
	}
	
	public HtmlWriter(String fileDirectory) {
		this();
		getFileHandler().setFileDirectory(fileDirectory);
	}
	
	public HtmlWriter setOutputDirectory(String fileDirectory) {
		getFileHandler().setFileDirectory(fileDirectory);
		return this;
	}
	
	private FileHandler getFileHandler() {
		return fileHandler;
	}
	
	private SimulationJavaScript getSimulationJavaScript() {
		if(simulationJavaScript == null)
			simulationJavaScript = new SimulationJavaScript();
		return simulationJavaScript;
	}
	
	private  SimulationCss getSimulationCss() {
		if(simulationCss == null)
			simulationCss = new SimulationCss();
		return simulationCss;
	}
	
	public void writeBasicStructure() throws FileNotFoundException, IOException, URISyntaxException {
		if(basicsWritten)
			return;
		getSimulationJavaScript().writeFile(getFileHandler().getFile(JS_FILE));
		getSimulationCss().writeFile(getFileHandler().getFile(CSS_FILE));
		basicsWritten = true;
	}
	
	public void writeServiceCenterPropertyEvolution(File csvFile, ServiceCenterResult property) throws FileNotFoundException, IOException, URISyntaxException {
		writeBasicStructure();
		String title = property.getTitle() + " Evolution";
		File chartFile = getChartFile(csvFile);
		
		SimulationChart chart = createHtmlChart()
				.setOriginalCsvFile(csvFile)
				.setTitle(title)
				.setXAxis(ServiceCenterResult.Time)
				.setYAxis(property)
				.setMultipleYValues(true)
				.setGoal(ServiceCenterResult.Goal);
		
		chart.writeFile(chartFile);
	}
	
	public void writeNetEvolutions(File csvFile) throws FileNotFoundException, IOException, URISyntaxException {
		writeBasicStructure();
		writeNetEvolution(csvFile, WorkloadResult.BusyTime);
		writeNetEvolution(csvFile, WorkloadResult.CompletedJobs);
		writeNetEvolution(csvFile, WorkloadResult.Throughput);
		writeNetEvolution(csvFile, WorkloadResult.Utilization);
	}
	
	public void writeNetEvolution(File csvFile, WorkloadResult property) throws FileNotFoundException, IOException {		
		String title = "Workload Evolution: " + property.getTitle();
		File chartFile = getChartFile(csvFile, property);
		
		SimulationChart chart =  createHtmlChart()
				.setOriginalCsvFile(csvFile)
				.setTitle(title)
				.setXAxis(WorkloadResult.Time)
				.setYAxis(property)
				.setMultipleYValues(false);
		
		chart.writeFile(chartFile);
	}
	
	private String removeFileExtension(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}

	private File getChartFile(File csvFile) throws IOException {
		return getFileHandler().getFile(removeFileExtension(csvFile.getName()) + FILE_EXT);
	}
	
	private File getChartFile(File csvFile, ISimulationResult property) throws IOException {
		return getFileHandler().getFile(removeFileExtension(csvFile.getName()) + "_" + property.getQualifierName() + FILE_EXT);
	}
	
	private SimulationChart createHtmlChart() {
		return new SimulationChart().setCssFile(CSS_FILE).setJavascriptFile(JS_FILE);
	}
	
}
