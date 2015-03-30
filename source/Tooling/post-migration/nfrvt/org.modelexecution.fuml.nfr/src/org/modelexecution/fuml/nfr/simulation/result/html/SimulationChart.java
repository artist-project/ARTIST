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
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.modelexecution.fuml.nfr.simulation.result.AbstractPrinter;
import org.modelexecution.fuml.nfr.simulation.result.FileHandler;
import org.modelexecution.fuml.nfr.simulation.result.ISimulationResult;
import org.modelexecution.fuml.nfr.simulation.result.WorkloadResult;

public class SimulationChart extends AbstractPrinter {
	private static final ISimulationResult DEFAULT_X_AXIS = WorkloadResult.Time;
	private static final String DATA_SUBDIR = "data/";
	
	File originalCsvFile;
	String javascriptFile, cssFile;
	
	ISimulationResult xAxis, yAxis, goal;
	boolean multipleValues;
	String title;
	
	public SimulationChart() { }
	
	public SimulationChart(File originalCsvFile) {
		setOriginalCsvFile(originalCsvFile);
	}
	
	public File getOriginalCsvFile() {
		return originalCsvFile;
	}
	
	public SimulationChart setOriginalCsvFile(File originalCsvFile) {
		this.originalCsvFile = originalCsvFile;
		return this;
	}
	
	public SimulationChart setXAxis(ISimulationResult xAxis) {
		this.xAxis = xAxis;
		return this;
	}
	
	public ISimulationResult getXAxis() {
		if(xAxis == null)
			return DEFAULT_X_AXIS;
		return xAxis;
	}
	
	public SimulationChart setYAxis(ISimulationResult yAxis) {
		this.yAxis = yAxis;
		return this;
	}
	
	public ISimulationResult getYAxis() {
		return yAxis;
	}
	
	public SimulationChart setGoal(ISimulationResult goal) {
		this.goal = goal;
		return this;
	}
	
	public ISimulationResult getGoal() {
		return goal;
	}
	
	public SimulationChart setMultipleYValues(boolean multipleValues) {
		this.multipleValues = multipleValues;
		return this;
	}
	
	public boolean isMultipleValues() {
		return multipleValues;
	}
	
	public SimulationChart setJavascriptFile(String javascriptFile) {
		this.javascriptFile = javascriptFile;
		return this;
	}
	
	public String getJavascriptFile() {
		return this.javascriptFile;
	}
	
	public SimulationChart setCssFile(String cssFile) {
		this.cssFile = cssFile;
		return this;
	}
	
	public String getCssFile() {
		return this.cssFile;
	}
	
	public SimulationChart setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void writeFile(File htmlFile) throws IOException {
		FileHandler fileHandler = new FileHandler(htmlFile.getParent());
		Path chartCsvFile = Files.copy(Paths.get(getOriginalCsvFile().toURI()),
				Paths.get(fileHandler.getFile(DATA_SUBDIR + getOriginalCsvFile().getName()).toURI()), 
				StandardCopyOption.REPLACE_EXISTING);
		
		FileOutputStream chartStream = new FileOutputStream(htmlFile);
		chartStream.write(getHtmlMeta().getBytes());
		chartStream.write(getHtmlHeader().getBytes());
		chartStream.write(getBody(chartCsvFile).getBytes());
		chartStream.close();
	}
	
	private String getHtmlMeta() {
		StringBuilder builder = new StringBuilder();
		printLine(builder, "<!DOCTYPE html>");
		printLine(builder, "<meta charset=\"utf-8\">");
		return builder.toString();
	}
	
	private String getHtmlHeader() {
		StringBuilder builder = new StringBuilder();
		printLine(builder, "<head>");
		printLine(builder, "   <title>" + getTitle() + "</title>");
		printLine(builder, "   <link rel=\"stylesheet\" type=\"text/css\" href=\"" + getCssFile() + "\">");
		printLine(builder, "</head>");
		return builder.toString();
	}
	
	private String getBody(Path chartCsvFile) {
		StringBuilder builder = new StringBuilder();
		printLine(builder, "<body>");
		printLine(builder, "<h1>" + getTitle() + "</h1>");
		printLine(builder, getJsDependencies());
		printLine(builder, callJavaScript(chartCsvFile));
		printLine(builder, "</body>");
		return builder.toString();
	}
	
	private String getJsDependencies() {
		StringBuilder builder = new StringBuilder();
		printLine(builder, "<script src=\"http://d3js.org/d3.v3.js\"></script>");
		printLine(builder, "<script src=\"" + getJavascriptFile() + "\"></script>");
		return builder.toString();
	}
	
	private String callJavaScript(Path chartCsvFile) {
		StringBuilder builder = new StringBuilder();
		printLine(builder, "<script>");
		printLine(builder, "var info = {");
		printLine(builder, "	csv: \"" + DATA_SUBDIR + chartCsvFile.getFileName() +  "\",");
		printLine(builder, "	chart: {");
		printLine(builder, "		width: 900,");
		printLine(builder, "		height: 300");
		printLine(builder, "	},");
		printLine(builder, "	margin: {");
		printLine(builder, "		top: 10,"); 
		printLine(builder, "		right: 170,");
		printLine(builder, "		bottom: 30,"); 
		printLine(builder, "		left: 50");
		printLine(builder, "	},");
		printLine(builder, "	xAxis: {");
		printLine(builder, "		label: \"" + "Seconds" + "\",");
		printLine(builder, "		column: \"" + getXAxis().getTitle() + "\"");
		printLine(builder, "	},");
		printLine(builder, "	yAxis: {");
		if(isMultipleValues()) {
			printLine(builder, "		label: \"" + getYAxis().getTitle() + "\"");
		} else {
			printLine(builder, "		label: \"" + getYAxis().getTitle() + "\",");
			printLine(builder, "		column: \"" + getYAxis().getQualifierName() + "\"");
		}
		if(getGoal() != null) {
			printLine(builder, "	},");
			printLine(builder, "	goal: {");
			printLine(builder, "		label: \"" + getGoal().getTitle() + " (Avg Value)\",");
			printLine(builder, "		column: \"" + getGoal().getTitle() + "\"");
		}
		printLine(builder, "	}");
		printLine(builder, "};");
		printLine(builder, "chartPropertyEvolution(info);");
		printLine(builder, "</script>");
		return builder.toString();
	}
}
