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
import java.io.FileOutputStream;
import java.io.IOException;

import org.modelexecution.fuml.nfr.simulation.result.AbstractPrinter;

public class SimulationCss extends AbstractPrinter {

	private String cssString;
	
	public void writeFile(File file) throws FileNotFoundException, IOException {
		FileOutputStream jsFile = new FileOutputStream(file);
		jsFile.write(getCssString().getBytes());
		jsFile.close();
	}
	
	private String getCssString() {
		if(cssString == null) {
			StringBuilder builder = new StringBuilder();
			printLine(builder, "body {");
			printLine(builder, "  font: 10px sans-serif;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, ".axis path,");
			printLine(builder, ".axis line {");
			printLine(builder, "  fill: none;");
			printLine(builder, "  stroke: #000000;");
			printLine(builder, "  shape-rendering: crispEdges;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, ".line {");
			printLine(builder, "  fill: none;");
			printLine(builder, "  stroke: steelblue;");
			printLine(builder, "  stroke-width: 1px;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, ".goal {");
			printLine(builder, "  stroke-dasharray: 5, 5;");
			printLine(builder, "  stroke-width: 1px;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "text.goalFulfilled {");
			printLine(builder, "  fill: green;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "text.goalFailed {");
			printLine(builder, "  fill: red;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "text.goalIndependent {");
			printLine(builder, "  fill: black;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "div.tooltip {");
			printLine(builder, "  position: absolute;");
			printLine(builder, "  text-align: left;");
			printLine(builder, "  padding: 5px;");
			printLine(builder, "  font: 10px monospace;");
			printLine(builder, "  background: lightsteelblue;");
			printLine(builder, "  border: 0px;");
			printLine(builder, "  border-radius: 8px;");
			printLine(builder, "  pointer-events: none;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "div.tooltip.goalIndependent {");
			printLine(builder, "  background: lightsteelblue;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "div.tooltip.goalFulfilled {");
			printLine(builder, "  background: #1BCF5D;");
			printLine(builder, "}");
			printLine(builder, "");
			printLine(builder, "div.tooltip.goalFailed {");
			printLine(builder, "  background: #FA284B;");
			printLine(builder, "}");
			cssString = builder.toString();
		}
		return cssString;
	}

}
